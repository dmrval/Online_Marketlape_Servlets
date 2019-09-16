package controller;

import entity.User;
import entity.UsersHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/16/2019 */
@WebServlet("/showMyItems")
public class ShowMyItemsServlet extends HttpServlet {

  User curr;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("currentUser");
    curr = UsersHelper.getUserByUserName(name);
    System.out.println(curr.getFullname());
    request.setAttribute("currentUser", curr);

    request.getRequestDispatcher("showMyItems.jsp").forward(request, response);
  }

  @Override
  public void init() throws ServletException {
    super.init();
  }
}
