package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("  <title>Contact Us</title>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <script src=\"js/sweetalert.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/sweetalert.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <script src=\"js/bootstrap.js\"></script>\n");
      out.write("  <script src=\"js/jquery-3.2.1.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write(" \n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/mystyle.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=number], input[type=email], textarea[type=\"text\"] {\n");
      out.write("    width: 50%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".subbtn {\n");
      out.write("    width: auto;\n");
      out.write("    padding: 10px 18px;\n");
      out.write("    background-color: #f44336;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("function sub(){\n");
      out.write("swal(\n");
      out.write("  'Nice!',\n");
      out.write("  'Thank you for contact us.',\n");
      out.write("  'success'\n");
      out.write(")\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function CheckIndianNumber(IndianNumber)\n");
      out.write("{\n");
      out.write("var IndNum = /^([0|\\+[0-9]{1,5})?([7-9][0-9]{9})$/;\n");
      out.write("if(IndNum.test(IndianNumber))\n");
      out.write("       {\n");
      out.write("           swal(\n");
      out.write("  'Success!',\n");
      out.write("  'Valid Mobile Number',\n");
      out.write("  'success'\n");
      out.write(")\n");
      out.write("       }\n");
      out.write("       else\n");
      out.write("       {\n");
      out.write("           swal(\n");
      out.write("      'Error!',\n");
      out.write("      'Mobile number is not valid!',\n");
      out.write("      'error'\n");
      out.write("    )\n");
      out.write("       }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid top_bar\" id=\"homeID\">\n");
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
      out.write("        <li><a href=\"\">Menu</a></li>\n");
      out.write("        <li><a href=\"\">About Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("          <!-- User Name -->\n");
      out.write("          <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> <b style=\"color:green\">Welcome </b><b style=\"color:Orange\"> ");
      out.print( request.getSession().getAttribute("userdb") );
      out.write("</b></a></li>\n");
      out.write("    \t\n");
      out.write("\n");
      out.write("<!-- User Logut Button -->\n");
      out.write("\t<li ><a href=\"loginform.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<!--navigation section end -->\n");
      out.write("<center><h2 style=\"color:#239B56; font-family:Fixedsys;\"><b>Contact Form </b></h2></center>\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"width:140%; margin-top:50px;\">    \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Contact Form</div>\n");
      out.write("        <form action=\"contactusdb.jsp\">\n");
      out.write("<div class=\"container\" style=\"width:190%;\"><br>\n");
      out.write("<label><b>Name : </b></label><br>\n");
      out.write("<input type=\"text\" placeholder=\"Enter Name\" requires name=\"name\" /><br><br>\n");
      out.write("<label><b>Contact : </b></label><br>\n");
      out.write("<input type=\"text\" placeholder=\"Enter Mobile Number\" onchange=\"CheckIndianNumber(this.value)\" required name=\"contact\" maxlength=\"10\" /><br><br>\n");
      out.write("<label><b>Email-Id : </b></label><br>\n");
      out.write("<input type=\"email\" placeholder=\"Enter Email-id\" required  name=\"email\"/><br><br>\n");
      out.write("<label><b>Message : </b></label><br>\n");
      out.write("<textarea type=\"text\" placeholder=\"Enter Message\" required name=\"message\"> </textarea><br><br> \n");
      out.write("<button type=\"submit\"  class=\"subbtn\" onClick=\"sub()\">Submit</button>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:green;\">Feel Free To Contact Us.</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"col sm-12\">\n");
      out.write("\t<img src=\"images/Besanladdu.jpg\" />\n");
      out.write("\t</div>\n");
      out.write("\t\t<img src=\"\" />\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("<!--latest footer at bottom start -->\n");
      out.write("<div class=\"container-fluid footer\" style=\"background-color:#145A32;\">\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<div class=\"col-sm-4\">\n");
      out.write("<img src=\"\" alt=\"\" class=\"img-responsive\" />\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-4 midfooter\">\n");
      out.write("<h3>Quick Links</h3>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"Home.jsp\">&raquo; Home </a></li>\n");
      out.write("<li><a href=\"\">&raquo; Menu</a></li>\n");
      out.write("<li><a href=\"\">&raquo; About Us</a></li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-4\"></div>\n");
      out.write("<h3>Contact Details</h3>\n");
      out.write("<p>Address : </strong> South-X(Delhi,India)</p>\n");
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
