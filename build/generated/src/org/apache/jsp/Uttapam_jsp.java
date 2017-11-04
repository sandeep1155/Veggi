package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Uttapam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en-US\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-compatable\" Content=\"IE-edge>\"\n");
      out.write("<meta name=\"viewport\" content = \"width-device-width\"> \n");
      out.write("<title>Uttapam</title>\n");
      out.write("  <script src=\"js/sweetalert.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/sweetalert.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".btn-danger{\n");
      out.write("margin-left:50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-info{\n");
      out.write("margin-left:50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nano_head {\n");
      out.write("border-style: outset;\n");
      out.write("padding-top:10px;\n");
      out.write("padding-bottom:20px;\n");
      out.write("margin-top:30px;\n");
      out.write("box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("  text-align: center;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("button[type=submit] {\n");
      out.write("background-color: #222222;\n");
      out.write("width:80px;\n");
      out.write("color:#fff;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #000;\n");
      out.write("\tborder-radius:1px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], select {\n");
      out.write("    width: 10%;\n");
      out.write("    margin: 8px 0;\n");
      out.write("\tborder-radius:1px;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #000;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".top_bar {background:#145A32; padding:5px 0;\n");
      out.write("padding-top:20px;\n");
      out.write("padding-bottom:20px;\n");
      out.write("}\n");
      out.write(".social_icon {margin-right:5px;}\n");
      out.write(".contact_info{color:#fff; font-size:16px; }\n");
      out.write("\n");
      out.write(".nanolist_head {\n");
      out.write("border-style: outset;\n");
      out.write("padding-top:10px;\n");
      out.write("padding-bottom:20px;\n");
      out.write("margin-top:30px;\n");
      out.write("margin-bottom:50px;\n");
      out.write("box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<!--header -->\n");
      out.write("<body>\n");
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
      out.write("<span class=\"glyphicon glyphicon-envelope\"></span>  veggi   \n");
      out.write("<span class=\"glyphicon glyphicon-earphone\"></span>  +91-9910440857\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div> <!--end of header-->\n");
      out.write("</body>\n");
      out.write("<body>\n");
      out.write("<div class=\"container nano_head\"> <!-- main contain of car-->\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-5\" >\n");
      out.write("        <div class=\"panel-heading\"><b>Uttapam</b></div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"images/Uttapam.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-7\">\n");
      out.write("        <h3><b>Uttapam</b></h3>\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_half.png\" />\n");
      out.write("\t\t<img src=\"images/rating_empty.png\" />\n");
      out.write("\t\t\n");
      out.write("\t<hr>\n");
      out.write("\t\t\n");
      out.write("\t\t<h4 style=\"color:#F08080\"><img src=\"images/ic_pink.png\" /><b>2.38 Lakhs</b> </h4>\n");
      out.write("                <div>   \n");
      out.write("<h5><b>Nano Milage : </b>36km/kg CNG Manual & 25.4 Kmpl Petrol Manual</p></h5>\n");
      out.write("</div>\n");
      out.write("</div><hr>\n");
      out.write("\t<br><br>\t\t\n");
      out.write("<p><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\" class=\"btn btn-success glyphicon glyphicon-hand-right\"> BOOK NOW</a>\n");
      out.write("\n");
      out.write("</p></div><br>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\" style=\"background-color:green; color:orange\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Fill your details to contact Dealer</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <form action=\"ordrdb.jsp\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"pwd\">Name:</label>\n");
      out.write("     <input type=\"plain\" class=\"form-control\" placeholder=\"Enter your name\" name=\"bname\" required>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("         <label for=\"pwd\">Email:</label>\n");
      out.write("     <input type=\"email\" class=\"form-control\" placeholder=\"Enter your email\" name=\"bemail\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label>Contact:</label>\n");
      out.write("      <input type=\"plain\" class=\"form-control\" placeholder=\"Enter your mobile number\" name=\"bnumber\" required maxlength=\"10\" onchange=\"CheckIndianNumber(this.value)\">\n");
      out.write("    </div>\n");
      out.write("              <script>\n");
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
      out.write("     <div class=\"form-group\">\n");
      out.write("     <label>Your Messages:</label>\n");
      out.write("  <textarea class=\"form-control\" rows=\"5\" name=\"bcomment\" required></textarea> \n");
      out.write("    </div>\n");
      out.write("      <div class=\"modal-footer\"><button type=\"submit\" class=\"btn btn-primary\">SUBMIT</button></div>\n");
      out.write("  </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
