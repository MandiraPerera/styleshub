package app.classes;

import static java.lang.System.out;
import java.sql.*;

public class User {

    private int userId;
    private String username;
    private String useremail;
    private String userpassword;
    private String userphone;
    private String useraddress;
    private String role; // 'admin' or 'user'

    // Constructor
    public User() {
    }

    public User(String username, String useremail, String userpassword, String userphone, String useraddress, String role) {
        this.username = username;
        this.useremail = useremail;
        this.userpassword = userpassword;
        this.userphone = userphone;
        this.useraddress = useraddress;
        this.role = role;
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Save user to database
public void save() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        conn = DbConnector.getConnection();
        String sql = "INSERT INTO user (username, useremail, userpassword, userphonenumber, useraddress, usertype) VALUES (?, ?, ?, ?, ?, ?)";
        stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, this.username);
        stmt.setString(2, this.useremail);
        stmt.setString(3, this.userpassword);
        stmt.setString(4, this.userphone);
        stmt.setString(5, this.useraddress);
        stmt.setString(6, this.role);
        stmt.executeUpdate();

        System.out.println("hehe");
        
        rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            this.userId = rs.getInt(1);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // or handle the exception as per your needs
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace(); // handle potential exceptions during resource cleanup
        }
    }
}


    // Find user by email and password for login
    public static User login(String email, String password) {
        try {
            Connection conn = DbConnector.getConnection();
            String sql = "SELECT * FROM user WHERE useremail = ? AND userpassword = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            User user = null;
            if (rs.next()) {
                user = new User(
                        rs.getString("username"),
                        rs.getString("useremail"),
                        rs.getString("userpassword"),
                        rs.getString("userphonenumber"),
                        rs.getString("useraddress"),
                        rs.getString("usertype")
                );
                user.userId = rs.getInt("id");
                
            }
            conn.close();
            return user;
        } catch (SQLException e) {
            out.print(e.getMessage());
        }
        return null;
    }

    // Register new user
    public static void register(String username, String email, String password, String phone, String address, String role) throws SQLException {
        User newUser = new User(username, email, password, phone, address, role);
        newUser.save();
    }

    public static int getUserCount() throws SQLException {
        int count = 0;
        String query = "SELECT COUNT(*) FROM user WHERE usertype = 'normal'";
        try (Connection conn = DbConnector.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                count = rs.getInt(1);
            }
        }
        return count;
    }

    public static int getAdminCount() throws SQLException {
        int count = 0;
        String query = "SELECT COUNT(*) FROM user WHERE usertype = 'admin'";
        try (Connection conn = DbConnector.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                count = rs.getInt(1);
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", username=" + username + ", useremail=" + useremail + ", userpassword=" + userpassword + ", userphone=" + userphone + ", useraddress=" + useraddress + ", role=" + role + '}';
    }
}
