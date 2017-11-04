package org.apache.jsp.South;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <c:import url=\"head-meta.jsp\"/>\n");
      out.write("     \n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/jquerys.js\"></script>\n");
      out.write("  <script src=\"js/myscript.js\"></script>\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/mystyle.css\" />\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\" />\n");
      out.write("        <title>Menu</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"container-fluid top_bar\" id=\"homeID\">\n");
      out.write("<div class=\"container\"> \n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-3\">\n");
      out.write(" <a href=\"https://www.facebook.com\" class= \"social_icon\"> <i class=\"fa fa-facebook\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write(" <a href=\"https://www.twitter.com\" class= \"social_icon\"> <i class=\"fa fa-twitter\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write(" <a href=\"https://www.youtube.com\" class= \"social_icon\"> <i class=\"fa fa-youtube-play\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write(" <a href=\"https://www.gmail.com\" class= \"social_icon\"> <i class=\"fa fa-google-plus\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-9 text-right contact_info\">\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"></span>  Veggi    \n");
      out.write("<span class=\"glyphicon glyphicon-earphone\"></span>  +91-9910440857\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div> <!--end of header-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\" style=\"margin-bottom:0px;\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("<a class=\"navbar-brand\" href=\"#\" style=\"color:#17A589\">Veggi</a>\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("        <li class=\"active\"><a href=\"menu.jsp\">Menu</a></li>\n");
      out.write("        <li><a href=\"about_us.jsp\">About Us</a></li>\n");
      out.write("        <li><a href=\"contact_us.jsp\">Contact Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("          <!-- User Nmae -->\n");
      out.write("          <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> <b style=\"color:green\">Welcome </b><b style=\"color:Orange\"> ");
      out.print( request.getSession().getAttribute("userdb") );
      out.write("</b></a></li>\n");
      out.write("    \t\n");
      out.write("\n");
      out.write("<!-- User Registration Button -->\n");
      out.write("\t<li ><a href=\"loginform.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<!--navigation section end -->\n");
      out.write("\n");
      out.write("<!--Product PAGE Searching Bar-->  \n");
      out.write("<div class=\"container\"> \n");
      out.write("<div row=\"row\">\n");
      out.write("<form>\n");
      out.write("  <input type=\"text\" name=\"search\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search Food...\"> <img src=\"images/TableService.png\" width=\"15%\"/>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<hr><br>\n");
      out.write("<!--Product PAGE Searching Bar END-->\n");
      out.write("<!--PRODUCT PAGE -->\n");
      out.write("<!--products section start-->\n");
      out.write("<div class=\"container\" id=\"myUL\">    \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\" >Dosa</div>\n");
      out.write("        <a href=\"Biryanimain.jsp\"><div class=\"panel-body\"><img src=\"images/Dosa.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>2.25 - 3.22 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Idli</div>\n");
      out.write("        <a href=\"CholeBhature.jsp\"><div class=\"panel-body\"><img src=\"images/Chole bhature.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>5.27 - 8.58 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Idli Upmam</div>\n");
      out.write("        <a href=\"Chaat.jsp\"><div class=\"panel-body\"><img src=\"images/Chaat.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>12.85 - 13.53 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div><br>\n");
      out.write("\n");
      out.write("<div class=\"container\">    \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Koottu </div>\n");
      out.write("        <a href=\"Chana Masala.jsp\"><div class=\"panel-body\"><img src=\"images/Chanamasala.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>5.99 - 8.69 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Mendu Vada</div>\n");
      out.write("        <a href=\"Dal Makhani.jsp\"><div class=\"panel-body\"><img src=\"images/Dalmakhani.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>30.0 - 39.0 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Pongal</div>\n");
      out.write("        <a href=\"Palakpaneer.jsp\"><div class=\"panel-body\"><img src=\"images/Palakpaneer.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\" ><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>9.17 - 10.16 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <br></div>\n");
      out.write("\t<div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Uttapam</div>\n");
      out.write("        <a href=\"Dumaaloo.jsp\"><div class=\"panel-body\"><img src=\"images/Dumaaloo.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>28.1 - 28.59 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Avial </div>\n");
      out.write("        <a href=\"Aloo Pratha.jsp\"><div class=\"panel-body\"><img src=\"images/Aloopratha.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>3.8 - 4.13 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Bonda</div>\n");
      out.write("        <a href=\"Jeera Aloo.jsp\"><div class=\"panel-body\"><img src=\"images/JeeraAloo.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>17.99 - 21.19 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t</div>\n");
      out.write("</div><br><br>\n");
      out.write("<!--products section end -->\n");
      out.write("\n");
      out.write("<!--Footer section start -->\n");
      out.write("<footer class=\"container-fluid text-center\">\n");
      out.write("  <h4><i><b>Veggis</b></i></h4>  \n");
      out.write("  <form class=\"form-inline\"><b>Get deals:</b>\n");
      out.write("    <input type=\"email\" class=\"form-control\" size=\"50\" placeholder=\"Enter your email-id\" required>\n");
      out.write("    <button type=\"button\" class=\"btn btn-danger lastbtn\">Subscribe now</button>\n");
      out.write("  </form>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!--latest footer at bottom start -->\n");
      out.write("<div class=\"container-fluid footer\" style=\"background-color:#145A32;\">\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<div class=\"col-sm-4\">\n");
      out.write("\n");
      out.write("<p><a href=\"#\" class=\"btn btn-danger\" >Read More...</a></p>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-4 midfooter\">\n");
      out.write("<h3>Quick Links</h3>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"Home.jsp\">&raquo; Home </a></li>\n");
      out.write("<li><a href=\"about_us.jsp\">&raquo; About Us</a></li>\n");
      out.write("<li><a href=\"contact_us.jsp\">&raquo; Contact Us</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-4\"></div>\n");
      out.write("<h3>Contact Details</h3>\n");
      out.write("<p>Address : </strong> JAVANDROID/69, South-X(Delhi,India)</p>\n");
      out.write("<p>Email : </strong> Veggi</p>\n");
      out.write("<p>Phone : </strong> 9910440857</p>\n");
      out.write("<p style=\"text-align: right; margin-right: 60px;\">Timing : </strong> 9:30am to 6:30pm</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!--latest footer at bottom ending -->\n");
      out.write("<!--footer section end -->\n");
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
