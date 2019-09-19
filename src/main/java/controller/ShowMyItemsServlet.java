package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/16/2019 */
@WebServlet("/showMyItems")
public class ShowMyItemsServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    if (LoginServlet.currSession != request.getSession()) {
      request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    } else {
      request.getRequestDispatcher("/WEB-INF/views/showMyItems.jsp").forward(request, response);
    }
  }

  @Override
  public void init() throws ServletException {
    super.init();
  }
}
