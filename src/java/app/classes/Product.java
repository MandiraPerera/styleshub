package app.classes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private int productid;
    private String productname;
    private String productdetails;
    private String productpic;
    private int productprice;
    private int productdiscount;
    private int productquantity;
    private int categoryid;

    public Product() {
    }

    public Product(String productname, String productdetails, String productpic, int productprice, int productdiscount, int productquantity, int categoryid) {
        this.productname = productname;
        this.productdetails = productdetails;
        this.productpic = productpic;
        this.productprice = productprice;
        this.productdiscount = productdiscount;
        this.productquantity = productquantity;
        this.categoryid = categoryid;
    }

    // Getters and setters
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdetails() {
        return productdetails;
    }

    public void setProductdetails(String productdetails) {
        this.productdetails = productdetails;
    }

    public String getProductpic() {
        return productpic;
    }

    public void setProductpic(String productpic) {
        this.productpic = productpic;
    }

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public int getProductdiscount() {
        return productdiscount;
    }

    public void setProductdiscount(int productdiscount) {
        this.productdiscount = productdiscount;
    }

    public int getProductquantity() {
        return productquantity;
    }

    public void setProductquantity(int productquantity) {
        this.productquantity = productquantity;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public void save() throws SQLException {
        Connection conn = DbConnector.getConnection();
        String sql = "INSERT INTO product (productname, productdetails, productpic, productprice, productdiscount, productquantity, categoryid) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, this.productname);
        stmt.setString(2, this.productdetails);
        stmt.setString(3, this.productpic);
        stmt.setInt(4, this.productprice);
        stmt.setInt(5, this.productdiscount);
        stmt.setInt(6, this.productquantity);
        stmt.setInt(7, this.categoryid);
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            this.productid = rs.getInt(1);
        }
        conn.close();
    }

    // find by category id
public static List<Product> findByCategoryID(int id) throws SQLException {
        Connection conn = DbConnector.getConnection();
        String sql = "SELECT * FROM product WHERE categoryid = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        List<Product> products = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product(
                rs.getString("productname"),
                rs.getString("productdetails"),
                rs.getString("productpic"),
                rs.getInt("productprice"),
                rs.getInt("productdiscount"),
                rs.getInt("productquantity"),
                rs.getInt("categoryid")
            );
            product.productid = rs.getInt("productid");
            products.add(product);
        }
        conn.close();
        return products;
    }

    public static List<Product> findAll() throws SQLException {
        Connection conn = DbConnector.getConnection();
        String sql = "SELECT * FROM product";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Product> products = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product(
                rs.getString("productname"),
                rs.getString("productdetails"),
                rs.getString("productpic"),
                rs.getInt("productprice"),
                rs.getInt("productdiscount"),
                rs.getInt("productquantity"),
                rs.getInt("categoryid")
            );
            product.productid = rs.getInt("productid");
            products.add(product);
        }
        conn.close();
        return products;
    }

    public static Product findById(int id) throws SQLException {
        Connection conn = DbConnector.getConnection();
        String sql = "SELECT * FROM product WHERE productid = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        Product product = null;
        if (rs.next()) {
            product = new Product(
                rs.getString("productname"),
                rs.getString("productdetails"),
                rs.getString("productpic"),
                rs.getInt("productprice"),
                rs.getInt("productdiscount"),
                rs.getInt("productquantity"),
                rs.getInt("categoryid")
            );
            product.productid = rs.getInt("productid");
        }
        conn.close();
        return product;
    }

    @Override
    public String toString() {
        return "Product{" + "productid=" + productid + ", productname=" + productname + ", productdetails=" + productdetails + ", productpic=" + productpic + ", productprice=" + productprice + ", productdiscount=" + productdiscount + ", productquantity=" + productquantity + ", categoryid=" + categoryid + '}';
    }

    public int getPriceAfterDiscount() {
        if (this.productdiscount > 0 && this.productdiscount <= 100) {
            double discount = (this.productdiscount / 100.0) * this.productprice;
            return (int) (this.productprice - discount);
        }
        return this.productprice;
    }
}
