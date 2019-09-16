package controller;

import entity.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
  private User user;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    System.out.println("Enter doGet");

    String action = request.getParameter("action");

    request.setAttribute("user", user);

    switch ((action == null) ? "info" : action) {
      case "update":
        request.getRequestDispatcher("/update.jsp").forward(request, response);
        break;
      case "info":
      default:
        request.getRequestDispatcher("/user.jsp").forward(request, response);
        break;
    }
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    System.out.println("Enter doPost");
    request.setCharacterEncoding("UTF-8");

    String action = request.getParameter("action");

    if ("submit".equals(action)) {
      user.setFullname(request.getParameter("fullname"));
      user.setAddress(request.getParameter("address"));
      user.setLogin(request.getParameter("login"));
    }

    request.setAttribute("user", user);
    request.getRequestDispatcher("/user.jsp").forward(request, response);
  }

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init();
    user = new User("Ivanov Ivan Ivanovich", "Stepnaya 9", "IVAN");
  }

  @Override
  public void destroy() {
    super.destroy();
    System.out.println("DESTROY");
  }
}
