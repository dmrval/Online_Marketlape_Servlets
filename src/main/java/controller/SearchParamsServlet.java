package controller;

import entity.Product;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Author - Damir_Valeev Created on 9/19/2019 */
@WebServlet("/searchParams")
public class SearchParamsServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    doPost(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    User currentUser = (User) req.getSession().getAttribute("currentUser");
    String selecter = req.getParameter("selecter");
    String searchText = req.getParameter("searchText");
    List<Product> allProducts = ShowItemsServlet.usersHelper.getAllProducts();
    List<Product> result = new ArrayList<>();
    if (selecter.equals("Seller")) {
      for (Product tmp : allProducts) {
        if (tmp.getInfo().getMaster().getFullname().equals(searchText)) {
          result.add(tmp);
          System.out.println(tmp.getInfo().getMaster().getFullname());
        }
      }
    } else {
      for (Product tmp : allProducts) {
        if (tmp.getNameProduct().equals(searchText)) {
          result.add(tmp);
        }
      }
    }
    req.getSession().setAttribute("allProducts", result);
    if (currentUser.getFullname().equals("Guest")) {
      req.getRequestDispatcher("/WEB-INF/views/guestPage.jsp").forward(req, resp);
    } else {
      req.getRequestDispatcher("/WEB-INF/views/showItems.jsp").forward(req, resp);
    }
  }

  @Override
  public void init() throws ServletException {
    super.init();
  }
}
