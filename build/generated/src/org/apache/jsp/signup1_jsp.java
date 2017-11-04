package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Veggi Signup </title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Online Food World  template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs Sign up Web Templates, \n");
      out.write(" Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design\">\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/stylee.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!--fonts-->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Cookie\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("<!--//fonts--> \n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- login -->\n");
      out.write("        \n");
      out.write("\t<h1 class=\"wthree\">Veggi</h1>\n");
      out.write("\t<div class=\"container login-section\">\t\n");
      out.write("\t\t<div class=\"login-w3l\">\t\n");
      out.write("\t\t\t<div class=\"login-form\">\t\n");
      out.write("\t\t\t\t<h2 class=\"wthree\">Sign up!</h2>\t\n");
      out.write("                                <form action=\"DoSignUp\" method=\"post\" class=\"agile_form\">\n");
      out.write("\t\t\t\t\t<div class=\"w3ls-name1\">\n");
      out.write("\t\t\t\t\t\t<label class=\"header\">name</label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"loremipsum \"name =\"signup\" class=\"form-control\" type=\"text\" required=\"\">\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t<div class=\"w3ls-name1\">\n");
      out.write("\t\t\t\t\t\t<label class=\"header\">phone</label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"enter the number\" name =\"signup\"class=\"form-control\" type=\"text\" required=\"\">\n");
      out.write("                                                \n");
      out.write("                                          \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"w3ls-name1\">\n");
      out.write("\t\t\t\t\t\t<label class=\"header\">email</label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"email@example.com\" name =\"signup\"class=\"form-control\" type=\"email\" required=\"\">\n");
      out.write("                                                \n");
      out.write("                                          \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"w3ls-name1\">\n");
      out.write("\t\t\t\t\t\t<label class=\"header\">address</label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"enter the address\" name =\"signup\"class=\"form-control\" type=\"textarea\" required=\"\">\n");
      out.write("                                                \n");
      out.write("                                          \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("\t\t\t\t\t<div class=\"w3ls-name1\">\n");
      out.write("\t\t\t\t\t\t<label class=\"header\">password</label>\t\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"*****\" name =\"signup\"class=\"form-control\" type=\"password\" required=\"\">\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Signup\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t \n");
      out.write("\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t</div> \t\n");
      out.write("        <p class=\"footer\">© 2017 Online Food World Veggi. All Rights Reserved | Design by San</a></p>\n");
      out.write("        </body>\n");
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
