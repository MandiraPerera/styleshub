package app.servlets;

import app.classes.Category;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CategoryServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String operation = request.getParameter("operation");

        if ("addcategory".equals(operation)) {
            try {
                String categoryTitle = request.getParameter("categorytitle");
                String categoryDescription = request.getParameter("categorydescription");

                Category category = new Category();
                category.setCategorytitle(categoryTitle);
                category.setCategoryDescription(categoryDescription);
                category.save();

                request.getSession().setAttribute("message", "Category added successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
                request.getSession().setAttribute("message", "Error adding category: " + e.getMessage());
            }
        }
        
        response.sendRedirect("admin.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
