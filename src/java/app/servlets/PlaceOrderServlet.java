
package app.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class PlaceOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get parameters from the form
        int userId = Integer.parseInt(request.getParameter("user_id"));
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String contactNumber = request.getParameter("contactNumber");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String district = request.getParameter("district");
        String shippingCode = request.getParameter("shippingCode");
        String shippingMethod = request.getParameter("shippingMethod");
        double discountedPrice = Double.parseDouble(request.getParameter("discountedPrice"));

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Establish database connection (replace with your database details)
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_new", "root", "");

            // Prepare SQL statement
            String sql = "INSERT INTO orders (user_id, email, name, contact_number, address, city, district, shipping_code, shipping_method, discounted_price) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Set parameters
            pstmt.setInt(1, userId);
            pstmt.setString(2, email);
            pstmt.setString(3, name);
            pstmt.setString(4, contactNumber);
            pstmt.setString(5, address);
            pstmt.setString(6, city);
            pstmt.setString(7, district);
            pstmt.setString(8, shippingCode);
            pstmt.setString(9, shippingMethod);
            pstmt.setDouble(10, discountedPrice);

            // Execute the query
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                // Order placed successfully
                response.sendRedirect("orderSuccess.jsp");
            } else {
                // Order failed
                response.sendRedirect("orderFailed.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("orderFailed.jsp");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}