import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Controller", urlPatterns = "/Controller")
public class Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param = request.getParameter("page");
        String forwardTo = "notFound.jsp";
        if (param != null) {
            switch (param) {
                case "about":
                    forwardTo = "about.jsp";
                    break;
                case "login":
                    forwardTo = "login.jsp";
                    break;
                case "signUp":
                    forwardTo = "signUp.jsp";
                    break;
            }
        }

        request.getRequestDispatcher(forwardTo).forward(request, response);
    }
}
