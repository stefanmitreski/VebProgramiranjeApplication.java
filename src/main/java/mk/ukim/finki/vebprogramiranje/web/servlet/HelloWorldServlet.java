package mk.ukim.finki.vebprogramiranje.web.servlet;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "hello", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        if(name == null)
        {
            name = "";
        }
        if(surname == null)
        {
            surname = "";
        }

        PrintWriter writer = resp.getWriter();
        writer.format("<html><head><body><h1>Hi! %s %s</h1></body></head></html>",name, surname);
        writer.flush();
    }

}