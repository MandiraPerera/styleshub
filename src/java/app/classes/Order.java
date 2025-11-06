package app.classes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private String userName;
    private String email;
    private String contactNumber;
    private String address;
    private String city;
    private String district;
    private String shippingMethod;
    private double discountedPrice;
    private Timestamp orderDate;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
    

    // Constructor, getters, and setters

    public static List<Order> findAll() throws SQLException {
        List<Order> orders = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish database connection (replace with your database details)
             conn = DbConnector.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * from orders";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Order order = new Order();
                order.setOrderId(rs.getInt("order_id"));
                order.setUserName(rs.getString("email"));
                order.setEmail(rs.getString("email"));
                order.setContactNumber(rs.getString("contact_number"));
                order.setAddress(rs.getString("address"));
                order.setCity(rs.getString("city"));
                order.setDistrict(rs.getString("district"));
                order.setShippingMethod(rs.getString("shipping_method"));
                order.setDiscountedPrice(rs.getDouble("discounted_price"));
                order.setOrderDate(rs.getTimestamp("order_date"));
                orders.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }

        return orders;
    }

    // Implement getters and setters for all fields
    
    
    
    
    
    public static int getOrderCount() throws SQLException {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    int count = 0;

    try {
        // Establish database connection (replace with your database details)
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_new", "root", "");

        stmt = conn.createStatement();
        String sql = "SELECT COUNT(*) AS order_count FROM orders";
        rs = stmt.executeQuery(sql);

        if (rs.next()) {
            count = rs.getInt("order_count");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    }

    return count;
}
}