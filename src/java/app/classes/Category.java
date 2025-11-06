package app.classes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Category {
    private int categoryid;
    private String categorytitle;
    private String categoryDescription;

    public Category() {
    }

    public Category(int categoryid, String categorytitle, String categoryDescription) {
        this.categoryid = categoryid;
        this.categorytitle = categorytitle;
        this.categoryDescription = categoryDescription;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public String getCategorytitle() {
        return categorytitle;
    }


    public String getCategoryDescription() {
        return categoryDescription;
    }

public void save() throws SQLException {
    String sql = "INSERT INTO category (category_name, category_description) VALUES (?, ?)";
    
    // Try-with-resources automatically closes resources
    try (Connection conn = DbConnector.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

        stmt.setString(1, this.categorytitle);
        stmt.setString(2, this.categoryDescription);

        stmt.executeUpdate();

        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                this.categoryid = rs.getInt(1);
            }
        }
    }
}


    public static Category findById(int id) throws SQLException {
        Connection conn = DbConnector.getConnection();
        String sql = "SELECT * FROM category WHERE category_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        Category category = null;
        if (rs.next()) {
            category = new Category(
                rs.getInt("category_id"),
                rs.getString("category_name"),
                rs.getString("category_description")
            );
        }
        conn.close();
        return category;
    }

    public static List<Category> findAll() throws SQLException {
        Connection conn = DbConnector.getConnection();
        String sql = "SELECT * FROM category";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Category> categories = new ArrayList<>();
        while (rs.next()) {
            Category category = new Category(
                rs.getInt("category_id"),
                rs.getString("category_name"),
                rs.getString("category_description")
            );
            categories.add(category);
        }
        conn.close();
        return categories;
    }

    public void update() throws SQLException {
        Connection conn = DbConnector.getConnection();
        String sql = "UPDATE category SET category_name = ?, category_description = ? WHERE category_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, this.categorytitle);
        stmt.setString(2, this.categoryDescription);
        stmt.setInt(3, this.categoryid);
        stmt.executeUpdate();
        conn.close();
    }

    public void delete() throws SQLException {
        Connection conn = DbConnector.getConnection();
        String sql = "DELETE FROM categories WHERE category_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, this.categoryid);
        stmt.executeUpdate();
        conn.close();
    }

    // setter
    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public void setCategorytitle(String categorytitle) {
        this.categorytitle = categorytitle;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public String toString() {
        return "Category{" + "category_id=" + categoryid + ", categorytitle=" + categorytitle + ", category_description=" + categoryDescription + '}';
    }
}
