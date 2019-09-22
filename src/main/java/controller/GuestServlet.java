package controller;

import entity.User;
import entity.UsersHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/19/2019 */
@WebServlet("/guestLogin")
public class GuestServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    User guest = new User("Guest");
    request.getSession().setAttribute("currentUser", guest);
    request.getSession().setAttribute("allProducts", ShowItemsServlet.usersHelper.getAllProducts());
    request.getRequestDispatcher("/WEB-INF/views/guestPage.jsp").forward(request, response);
  }

  @Override
  public void init() throws ServletException {
    super.init();
    if (ShowItemsServlet.usersHelper == null) {
      ShowItemsServlet.usersHelper = new UsersHelper();
      ShowItemsServlet.usersHelper.startInit();
    }
  }
}
