package murach.email;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import murach.business.User;

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Correct URL for the index page
        String url = "/index.html";

        // Get the action parameter
        String action = req.getParameter("action");
        if (action == null) {
            action = "join";
        }

        // Handle "add" action
        else if (action.equals("add")) {

            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            String email = req.getParameter("email");
            String date = req.getParameter("date");
            String contact = req.getParameter("contact");
            User user = new User(email, firstName, lastName, date, contact);

            String hear = req.getParameter("hear");

            String[] checkBox = req.getParameterValues("receive");

            req.setAttribute("user", user);
            req.setAttribute("checkBoxs", checkBox);
            req.setAttribute("hear", hear);
            url = "/thanks.jsp";
        }

        RequestDispatcher rd = req.getRequestDispatcher(url);
        rd.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }
}