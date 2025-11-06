package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.classes.Category;
import app.classes.Product;
import app.classes.User;
import java.util.List;
import app.classes.Category;
import app.classes.Product;
import app.classes.User;
import java.util.List;
import java.sql.SQLException;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/components/nav_bar.jsp");
    _jspx_dependants.add("/components/cart_model.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Style Hub</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>StyleHub</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .navbar {\r\n");
      out.write("            background-color: #808080;\r\n");
      out.write("            border-radius: 15px;\r\n");
      out.write("            width: 97%;\r\n");
      out.write("            margin: 0 auto 2rem;\r\n");
      out.write("            padding: 1rem;\r\n");
      out.write("            font-family: 'Poppins', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar-brand {\r\n");
      out.write("            font-size: 1.75rem;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("        }\r\n");
      out.write("        .nav-link {\r\n");
      out.write("            font-size: 1.25rem;\r\n");
      out.write("            font-weight: 500;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar-toggler {\r\n");
      out.write("            border-color: transparent;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar-toggler-icon {\r\n");
      out.write("            filter: invert(1);\r\n");
      out.write("        }\r\n");
      out.write("        .nav-item img {\r\n");
      out.write("            width: 28px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container-fluid d-flex justify-content-center\">\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">StyleHub</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("                        <li class=\"nav-item active\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">About</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#cart\">\r\n");
      out.write("                                <img src=\"images/cart-plus-solid.svg\" alt=\"Cart\" />\r\n");
      out.write("                                <span class=\"ms-2 cart-items\">( 0 )</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"login.jsp\">Login</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"register.jsp\">Register</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"logout.jsp\">Log out</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            List<Category> categories = Category.findAll();

            String cat = request.getParameter("category");
            List<Product> products = null;
            if (cat != null) {
                products = Product.findByCategoryID(Integer.parseInt(cat));
            } else {
                products = Product.findAll();
            }
            if (cat == null) {
                cat = "9999999";
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("<!-- Cart Model -->\n");
      out.write("<div class=\"modal fade\" id=\"cart\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("        <h1 class=\"modal-title fs-4\" id=\"exampleModalLabel\">Selected Items</h1>\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body cart-body\">\n");
      out.write("        <!-- Cart items will be dynamically updated here -->\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("        \n");
      out.write("        <button type=\"button\" class=\"btn btn-primary checkout-btn\" onclick=\"goToCheckout()\">Checkout</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <ul class=\"list-group m-5\">\n");
      out.write("                    <a href=\"index.jsp\" class=\"list-group-item list-group-item-action ");
      out.print( cat.equals("9999999") ? "active" : "");
      out.write("\">\n");
      out.write("                        All\n");
      out.write("                    </a>\n");
      out.write("                    ");
 for (Category c : categories) {
      out.write("\n");
      out.write("                    <a href=\"index.jsp?category=");
      out.print( c.getCategoryid());
      out.write("\" class=\"list-group-item list-group-item-action ");
      out.print( (c.getCategoryid() == Integer.parseInt(cat)) ? "active" : "");
      out.write("\">\n");
      out.write("                        ");
      out.print( c.getCategorytitle());
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <div class=\" my-5\">\n");
      out.write("                    <div class=\"row col-md-12\">\n");
      out.write("                        ");
 for (Product p : products) {
      out.write("\n");
      out.write("                        <div class=\"col-md-3 mx-3 mb-3 shadow-sm pb-3\">\n");
      out.write("                            <div class=\"container text-center p-3\">\n");
      out.write("                                <img src=\"");
      out.print( p.getProductpic());
      out.write("\" class=\"card-img-top img-fluid\" alt=\"Product image\" style=\"max-height: 250px; object-fit: cover;\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <h5 class=\"card-title font-weight-bold text-truncate\">");
      out.print( p.getProductname());
      out.write(" </h5>\n");
      out.write("                                <p class=\"card-text text-muted text-truncate\">");
      out.print( p.getProductdetails());
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer text-center bg-white border-0\">\n");
      out.write("                                <div class=\"price-info align-items-center\">\n");
      out.write("                                    <span class=\"text-success font-weight-bold mr-2\">&#8360; ");
      out.print( p.getPriceAfterDiscount());
      out.write("</span>\n");
      out.write("                                    <span class=\"text-muted mx-2\" style=\"text-decoration: line-through;\">&#8360; ");
      out.print( p.getProductprice());
      out.write("</span>\n");
      out.write("                                    <span class=\"text-danger\">(");
      out.print( p.getProductdiscount());
      out.write("% off)</span>\n");
      out.write("                                </div>\n");
      out.write("                                    <button class=\"btn btn-primary my-2\" onclick=\"addToCart(");
      out.print( p.getProductid());
      out.write(", '");
      out.print( p.getProductname());
      out.write("', ");
      out.print( p.getPriceAfterDiscount());
      out.write(")\"> <i style=\"font-size: 20px;\">+</i> Select Item</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.7.1.min.js\" integrity=\"sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"./js/script.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
