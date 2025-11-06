package app.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet("/deleteCategoryServlet")
public class DeleteCategoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int categoryId = Integer.parseInt(request.getParameter("id"));

    String jdbcURL = "jdbc:mysql://localhost:3306/rad_new";
    String jdbcUsername = "root";
    String jdbcPassword = "";

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

        String sql = "DELETE FROM category WHERE category_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1,categoryId);
        int rowsAffected = stmt.executeUpdate();

        if (rowsAffected > 0) {
            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().write("Category deleted successfully.");
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.getWriter().write("Category not found.");
        }

        stmt.close();
        conn.close();
    } catch (SQLException e) {
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        response.getWriter().write("Error deleting category: " + e.getMessage());
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        response.getWriter().write("Error loading JDBC driver: " + e.getMessage());
        e.printStackTrace();
    }
}
}
//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    int categoryId = Integer.parseInt(request.getParameter("category_id"));
//
//    String jdbcURL = "jdbc:mysql://localhost:3306/rad_new";
//    String jdbcUsername = "root";
//    String jdbcPassword = "";
//
//    try {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
//
//        String sql = "DELETE FROM category WHERE category_id = ?";
//        PreparedStatement stmt = conn.prepareStatement(sql);
//        stmt.setInt(1, categoryId);
//        int rowsAffected = stmt.executeUpdate();
//
//        if (rowsAffected > 0) {
//            response.setStatus(HttpServletResponse.SC_OK);
//            response.getWriter().write("Category deleted successfully.");
//        } else {
//            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
//            response.getWriter().write("Category not found.");
//        }
//
//        stmt.close();
//        conn.close();
//    } catch (SQLException e) {
//        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//        response.getWriter().write("Error deleting category: " + e.getMessage());
////        System.err.println("SQL query: " + );
//        System.err.println("Category ID: " + categoryId);
//        e.printStackTrace();
//    } catch (ClassNotFoundException e) {
//        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//        response.getWriter().write("Error loading JDBC driver: " + e.getMessage());
//        e.printStackTrace();
//    }
//}
//}
