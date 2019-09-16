package controller;

import entity.User;
import service.UserServiceImpl;
import service.UserSevice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/11/2019 Inside the package - entity */
@WebServlet("/")
public class LoginServlet extends HttpServlet {

  UserSevice userSevice;

  User currentUser;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    System.out.println("LoginServlet");
    request.setCharacterEncoding("UTF-8");
    request.getRequestDispatcher("login.jsp").forward(request, response);
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
    userSevice = new UserServiceImpl();
    currentUser = new User("Ivanov Ivan Ivanovich", "Stepnaya 9", "IVAN");
  }
}