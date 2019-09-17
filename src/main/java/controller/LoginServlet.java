package controller;

import entity.User;
import entity.UsersHelper;
import service.UserServiceImpl;
import service.UserSevice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/11/2019 */
@WebServlet("/")
public class LoginServlet extends HttpServlet {

  UserSevice userSevice;

  User currentUser;
  UsersHelper usersHelper = new UsersHelper();

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (userSevice.userIsExist(currentUser)) {
      req.getSession().setAttribute("currentUser", currentUser);

      req.getRequestDispatcher("/WEB-INF/views/showItems.jsp").forward(req, resp);
    }
  }

  @Override
  public void init() throws ServletException {
    super.init();
    userSevice = new UserServiceImpl();
    currentUser = usersHelper.getAllUsers().get(0);
  }
}
