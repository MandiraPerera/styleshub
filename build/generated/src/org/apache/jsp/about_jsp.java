package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.classes.Category;
import app.classes.Product;
import app.classes.User;
import java.util.List;
import java.sql.SQLException;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/components/nav_bar.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>About Us - StyleHub</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #e0e0e0;\n");
      out.write("            min-height: 100vh;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1);\n");
      out.write("            padding: 50px;\n");
      out.write("        }\n");
      out.write("        .logo {\n");
      out.write("            font-size: 1.8em;\n");
      out.write("            color: #333;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\t\t.text-decoration-none{\n");
      out.write("\t\t\tmargin-left:15px;\n");
      out.write("\t\t\tfont-weight:bold;\n");
      out.write("\t\t}\n");
      out.write("        .about-images img {\n");
      out.write("            border-radius: 50%;\n");
      out.write("            width: 150px;\n");
      out.write("            height: 150px;\n");
      out.write("            border: 5px solid #ffffff;\n");
      out.write("            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1);\n");
      out.write("            object-fit: cover;\n");
      out.write("        }\n");
      out.write("        .contact-box {\n");
      out.write("            height: 100%;\n");
      out.write("            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("     \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <header class=\"row mb-5\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <div class=\"logo\"></div>\n");
      out.write("            </div>\n");
      out.write("           ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>StyleHub</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"script.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            .navbar {\r\n");
      out.write("                background-color: #808080;\r\n");
      out.write("                border-radius: 15px;\r\n");
      out.write("                width: 97%;\r\n");
      out.write("                margin: 0 auto 2rem;\r\n");
      out.write("                padding: 1rem;\r\n");
      out.write("                font-family: 'Poppins', sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("            .navbar-brand {\r\n");
      out.write("                font-size: 1.75rem;\r\n");
      out.write("                font-weight: 600;\r\n");
      out.write("            }\r\n");
      out.write("            .nav-link {\r\n");
      out.write("                font-size: 1.25rem;\r\n");
      out.write("                font-weight: 500;\r\n");
      out.write("            }\r\n");
      out.write("            .navbar-toggler {\r\n");
      out.write("                border-color: transparent;\r\n");
      out.write("            }\r\n");
      out.write("            .navbar-toggler-icon {\r\n");
      out.write("                filter: invert(1);\r\n");
      out.write("            }\r\n");
      out.write("            .nav-item img {\r\n");
      out.write("                width: 28px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid d-flex justify-content-center\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">StyleHub</a>\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                        <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("                            <li class=\"nav-item active\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#cart\">\r\n");
      out.write("                                    <img src=\"images/cart-plus-solid.svg\" alt=\"Cart\" />\r\n");
      out.write("                                    <span class=\"ms-2 cart-items\">( 0 )</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"login.jsp\">Login</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"register.jsp\">Register</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"javascript:void(0);\" onclick=\"confirmLogout()\">Log out</a>                        </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"row mb-5 align-items-center\">\n");
      out.write("                <div class=\"col-lg-6 mb-4 mb-lg-0\">\n");
      out.write("                    <h2 class=\"mb-4\">Hello! <br>About Us</h2>\n");
      out.write("                    <p class=\"text-secondary\">StyleHub is your go-to destination for trendy and stylish clothing. We offer a curated selection of fashion-forward pieces that combine quality and comfort, ensuring you always look and feel your best. Discover your unique style with us today!</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"about-images d-flex justify-content-around\">\n");
      out.write("                        <img src=\"images/tshirt.jpeg\" alt=\"Clothing Item 1\" class=\"img-fluid\">\n");
      out.write("                        <img src=\"images/watch.jpeg\" alt=\"Clothing Item 2\" class=\"img-fluid d-none d-md-block\">\n");
      out.write("                        <img src=\"images/cap.jpeg\" alt=\"Clothing Item 3\" class=\"img-fluid d-none d-lg-block\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 mb-3 mb-md-0\">\n");
      out.write("                    <div class=\"card contact-box\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <h5 class=\"card-title\">Mobile</h5>\n");
      out.write("                            <p class=\"card-text\">055-7865467</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mb-3 mb-md-0\">\n");
      out.write("                    <div class=\"card contact-box\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <h5 class=\"card-title\">Email</h5>\n");
      out.write("                            <p class=\"card-text\">stylehub@gmail.com</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card contact-box\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <h5 class=\"card-title\">Address</h5>\n");
      out.write("                            <p class=\"card-text\">No.29, Main street, Badulla</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS (optional, for certain components) -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
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
