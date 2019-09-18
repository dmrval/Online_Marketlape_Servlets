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

/** Author - Damir_Valeev Created on 9/17/2019 */
@WebServlet("/showItems")
public class ShowItemsServlet extends HttpServlet {
  UserSevice userSevice;

  User currentUser;

  UsersHelper usersHelper;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    doPost(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    req.setAttribute("allUsers", usersHelper);
    if (userSevice.userIsExist(currentUser)) {
      req.getSession().setAttribute("currentUser", currentUser);
      req.getRequestDispatcher("/WEB-INF/views/showItems.jsp").forward(req, resp);
    }
  }

  @Override
  public void init() throws ServletException {
    super.init();
    usersHelper = new UsersHelper();
    usersHelper.startInit();
    userSevice = new UserServiceImpl();
    currentUser = usersHelper.allUsers.get(0);
  }
}
