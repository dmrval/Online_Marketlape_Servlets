package controller;

import entity.UsersHelper;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/17/2019 */
@WebServlet("/showItems")
public class ShowItemsServlet extends HttpServlet {

  static UsersHelper usersHelper;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (!UserServiceImpl.isExist(usersHelper.allUsers.get(0))) {
      req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    } else {
      doPost(req, resp);
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    req.getSession().setAttribute("login", "login");
    req.getSession().setAttribute("pass", "pass");
    req.getSession().setAttribute("allProducts", usersHelper.getAllProducts());
    req.getSession().setAttribute("currentUser", usersHelper.allUsers.get(1));
    req.getRequestDispatcher("/WEB-INF/views/showItems.jsp").forward(req, resp);
  }

  @Override
  public void init() throws ServletException {
    super.init();
    if (usersHelper == null) {
      usersHelper = new UsersHelper();
      usersHelper.startInit();
    }
  }
}
