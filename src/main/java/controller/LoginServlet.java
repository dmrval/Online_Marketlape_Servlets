package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/11/2019 */
@WebServlet("/")
public class LoginServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    HttpSession session = request.getSession(false);
    if (session != null && session.getAttribute("currentUser") != null) {
      request.getRequestDispatcher("/WEB-INF/views/showItems.jsp").forward(request, response);
    }

    request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
  }

  @Override
  public void init() throws ServletException {
    super.init();
  }
}
