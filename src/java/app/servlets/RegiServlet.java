package app.servlets;

import app.classes.User;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegiServlet extends HttpServlet {
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    String username = request.getParameter("user_name");
    String email = request.getParameter("user_mail");
    String password = request.getParameter("user_password");
    String phone = request.getParameter("user_phone");
    String address = request.getParameter("user_address");
    String role = "normal"; // Default role for new users
    try {
        User.register(username, email, password, phone, address, role);
        // Set success message in session
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", "Registration successful! You can now log in.");
        // Redirect to login page
        response.sendRedirect("login.jsp");
    } catch (SQLException e) {
        // Handle errors and set an error message
        HttpSession session = request.getSession();
        session.setAttribute("errorMessage", "Registration failed. Please try again.");
        response.sendRedirect("register.jsp");
    }
}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}