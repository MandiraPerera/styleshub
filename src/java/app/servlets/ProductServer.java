package app.servlets;

import app.classes.Category;
import app.classes.Product;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class ProductServer extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String operation = request.getParameter("operation");

        if ("addproduct".equals(operation)) {
            try {
                String productName = request.getParameter("productname");
                String productDetails = request.getParameter("productdetails");
                int productPrice = Integer.parseInt(request.getParameter("productprice"));
                int productDiscount = Integer.parseInt(request.getParameter("productdiscount"));
                int productQuantity = Integer.parseInt(request.getParameter("productquantity"));
                int categoryId = Integer.parseInt(request.getParameter("categoryid"));
                String pp = request.getParameter("productpic");
                
                // Here you would typically save the file to your server
                // For this example, we'll just use the filename
                
                Product product = new Product(productName, productDetails, pp, productPrice, productDiscount, productQuantity, categoryId);
                product.save();
                
                request.getSession().setAttribute("message", "Product added successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
                request.getSession().setAttribute("message", "Error adding product: " + e.getMessage());
            }
        }
        
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