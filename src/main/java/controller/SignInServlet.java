package controller;

import entity.User;
import service.UserSevice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/13/2019 */
@WebServlet("/signIn")
public class SignInServlet extends HttpServlet {

  UserSevice userSevice;

  User currentUser;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (userSevice.userIsExist(currentUser)) {
      req.getRequestDispatcher("/showItems.jsp").forward(req, resp);
    }
  }

  @Override
  public void init() throws ServletException {
    super.init();
    currentUser = new User("Ivanov Ivan Ivanovich", "Stepnaya 9", "IVAN");
  }
}
