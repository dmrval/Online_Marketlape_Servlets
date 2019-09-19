package controller;

import entity.User;
import entity.UsersHelper;
import service.UserServiceImpl;
import service.UserSevice;

import javax.ejb.EJB;
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

  @EJB User currentUser;

  static UsersHelper usersHelper;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (LoginServlet.currSession != req.getSession()) {
      req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    } else {
      doPost(req, resp);
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    if (userSevice.userIsExist(currentUser)) {
      req.setAttribute("allUsers", usersHelper);
      LoginServlet.currSession = req.getSession(true);
      req.getSession().setAttribute("currentUser", currentUser);
      req.getRequestDispatcher("/WEB-INF/views/showItems.jsp").forward(req, resp);
    }
  }

  @Override
  public void init() throws ServletException {
    super.init();
    if (usersHelper == null) {
      usersHelper = new UsersHelper();
      usersHelper.startInit();
    }
    userSevice = new UserServiceImpl();
    currentUser = usersHelper.allUsers.get(0);
  }
}
