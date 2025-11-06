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

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Login | Style Hub</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            html, body {\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            .centered-form-container {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                min-height: calc(100vh - 56px);\n");
      out.write("            }\n");
      out.write("            .login-form {\n");
      out.write("                width: 100%;\n");
      out.write("                max-width: 500px;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin: auto;\n");
      out.write("                background-color: #f8f9fa;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("        <div class=\"centered-form-container\">\n");
      out.write("            <div class=\"login-form\">\n");
      out.write("                ");

                    String successMessage = (String) session.getAttribute("successMessage");
                    if (successMessage != null) {
                
      out.write("\n");
      out.write("                <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                    ");
      out.print( successMessage );
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                        session.removeAttribute("successMessage");
                    }
                
      out.write("\n");
      out.write("                ");

                    String errorMessage = (String) session.getAttribute("errorMessage");
                    if (errorMessage != null) {
                
      out.write("\n");
      out.write("                <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                    ");
      out.print( errorMessage );
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                        session.removeAttribute("errorMessage");
                    }
                
      out.write("\n");
      out.write("                <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("                    <h3 class=\"text-center mb-4\">Please Enter Your Details to Login</h3>\n");
      out.write("                    <!-- Email input -->\n");
      out.write("                    <div class=\"form-outline mb-4\">\n");
      out.write("                        <label class=\"form-label\" for=\"form2Example1\">Email address</label>\n");
      out.write("                        <input name=\"email\" type=\"email\" id=\"form2Example1\" class=\"form-control\" required />\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Password input -->\n");
      out.write("                    <div class=\"form-outline mb-4\">\n");
      out.write("                        <label class=\"form-label\" for=\"form2Example2\">Password</label>\n");
      out.write("                        <input name=\"password\" type=\"password\" id=\"form2Example2\" class=\"form-control\" required />\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Submit button -->\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-block w-100 mb-4\">Log in</button>\n");
      out.write("                    <!-- Register link -->\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <p>Not a member? <a href=\"register.jsp\">Register</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("                integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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
