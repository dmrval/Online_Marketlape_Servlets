package controller;

import entity.AuctionProductInfo;
import entity.Product;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/19/2019 */
@WebServlet("/addProduct")
public class AddNewProductServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    request.getRequestDispatcher("/WEB-INF/views/addProduct.jsp").forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    User currentUser = (User) req.getSession().getAttribute("currentUser");
    String prodname = req.getParameter("prodname");
    String description = req.getParameter("description");
    double startPrice = Double.parseDouble(req.getParameter("startPrice"));
    double stepLevel = Double.parseDouble(req.getParameter("stepLevel"));
    double time = Double.parseDouble(req.getParameter("time"));
    boolean isBidding = false;
    String string = req.getParameter("forSale");
    if (string.equals("1")) {
      isBidding = true;
    }
    Product newProd =
        new Product(
            9999,
            prodname,
            description,
            new AuctionProductInfo(startPrice, stepLevel, time, currentUser, isBidding));

    currentUser.getProductList().add(newProd);
    req.getRequestDispatcher("/WEB-INF/views/showMyItems.jsp").forward(req, resp);
  }

  @Override
  public void init() throws ServletException {
    super.init();
  }
}
