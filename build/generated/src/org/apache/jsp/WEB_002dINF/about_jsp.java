package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <header class=\"row mb-5\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <div class=\"logo\">StyleHub</div>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"col-md-6 text-md-end\">\n");
      out.write("                <a href=\"#\" class=\"text-decoration-none text-secondary\">Home</a>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"text-decoration-none text-secondary\">Portfolio</a>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"text-decoration-none text-secondary\">About us</a>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"text-decoration-none text-secondary\">Login</a>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"row mb-5 align-items-center\">\n");
      out.write("                <div class=\"col-lg-6 mb-4 mb-lg-0\">\n");
      out.write("                    <h2 class=\"mb-4\">Hello! <br>About Us</h2>\n");
      out.write("                    <p class=\"text-secondary\">StyleHub is your go-to destination for trendy and stylish clothing. We offer a curated selection of fashion-forward pieces that combine quality and comfort, ensuring you always look and feel your best. Discover your unique style with us today!</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"about-images d-flex justify-content-around\">\n");
      out.write("                        <img src=\"tshirt.jpeg\" alt=\"Clothing Item 1\" class=\"img-fluid\">\n");
      out.write("                        <img src=\"watch.jpeg\" alt=\"Clothing Item 2\" class=\"img-fluid d-none d-md-block\">\n");
      out.write("                        <img src=\"cap.jpeg\" alt=\"Clothing Item 3\" class=\"img-fluid d-none d-lg-block\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 mb-3 mb-md-0\">\n");
      out.write("                    <div class=\"card contact-box\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <h5 class=\"card-title\">Mobile</h5>\n");
      out.write("                            <p class=\"card-text\">055-7777777</p>\n");
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
