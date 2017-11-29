package Project.servlets;

import Project.util.DataBaseUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "LookServlet", urlPatterns = "/lookServlet")
public class LookServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        try {
            Class.forName(DataBaseUtil.getClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if (cookies == null)
            resp.sendRedirect("/Pages/welcome.jsp");
        else {
            System.out.println("Dolzno bitm cookie soidenenie");
            resp.sendRedirect("/Pages/welcome.jsp");
        }
    }
}
