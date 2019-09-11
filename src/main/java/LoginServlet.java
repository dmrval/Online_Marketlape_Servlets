import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Author - Damir_Valeev Created on 9/11/2019 Inside the package - entity */
public class LoginServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    System.out.println("LoginServlet");
    request.setCharacterEncoding("UTF-8");
    request.getRequestDispatcher("/login.jsp").forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    super.doPost(req, resp);
  }

  @Override
  public void init() throws ServletException {
    super.init();
  }
}
