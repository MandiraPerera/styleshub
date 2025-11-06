/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.servlets;

import java.io.IOException;
import static java.lang.System.out;
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

@WebServlet("/deleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("id"));
        out.println(productId);

        // Database connection parameters
        String jdbcURL = "jdbc:mysql://localhost:3306/rad_new";
        String jdbcUsername = "root";
        String jdbcPassword = "";
        
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            
            // Establish connection to the database
            Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            
            // SQL query to delete the product
            String sql = "DELETE FROM product WHERE productid = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, productId);
            stmt.executeUpdate();
            
            // Close the resources
            stmt.close();
            conn.close();
            
            response.setStatus(HttpServletResponse.SC_OK);
        } catch (SQLException | ClassNotFoundException e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }
    }
}

