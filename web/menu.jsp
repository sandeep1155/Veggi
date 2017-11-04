<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>
<%@page import="foodupload.foodgettersetter"%>
<%@page import="foodupload.foodinterImpl"%>
<%@page import="foodupload.foodinterface"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en"> 

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="css/bootstrap.css" />

        <title>Buy Product</title>
        <style>
            .column {
                float: left;
                width: 24.8%;
                margin-bottom: 16px;
                padding: 0 8px;
            }
            /* Display the columns below each other instead of side by side on small screens */
            @media (max-width: 650px) {
                .column {
                    width: 100%;
                    display: block;
                }
            }
            /* Add some shadows to create a card effect */
            .card {
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.9);
            }
            /* Some left and right padding inside the container */
            .container {
                padding: 0 16px;
            }
            /* Clear floats */
            .container::after, .row::after {
                content: "";
                clear: both;
                display: table;
            }
            .title {
    color: grey;
}
       </style>
    </head>

    <body>


        <div class="container-fluid top_bar" id="homeID">
            <div class="container"> 
                <div class="row">
                    <div class="col-sm-3">
                        <a href="https://www.facebook.com" class= "social_icon"> <i class="fa fa-facebook" style ="color:#fff; size:17px; font-size:17px"></i></a>
                        <a href="https://www.twitter.com" class= "social_icon"> <i class="fa fa-twitter" style ="color:#fff; size:17px; font-size:17px"></i></a>
                        <a href="https://www.youtube.com" class= "social_icon"> <i class="fa fa-youtube-play" style ="color:#fff; size:17px; font-size:17px"></i></a>
                        <a href="https://www.gmail.com" class= "social_icon"> <i class="fa fa-google-plus" style ="color:#fff; size:17px; font-size:17px"></i></a>
                    </div>
                    <div class="col-sm-9 text-right contact_info">
                        <span class="glyphicon glyphicon-envelope"></span> veggi,    
                        <span class="glyphicon glyphicon-earphone"></span>  +91-9910440857
                    </div>
                </div>
            </div>
        </div> <!--end of header-->



        <nav class="navbar navbar-inverse" style="margin-bottom:0px;">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <a class="navbar-brand" href="#" style="color:#00FF7F">Veggi</a>
                    <ul class="nav navbar-nav">
                        <li><a href="Hme.jsp">Home</a></li>
                        <li><a href="contact_us.jsp">Contact Us</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">

                        <!-- User Nmae -->
                        <  <li><a href=""><span class="glyphicon glyphicon-user"></span> <b style="color:green">Welcome </b><b style="color:Orange"> <%= request.getSession().getAttribute("userdb")%></b></a></li>


                        <!-- User Registration Button -->
                        <li ><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <!--navigation section end -->

        <!--Product PAGE Searching Bar-->  
        <!--div class="container"> 
        <div row="row">
        <form>
          <input type="text" name="search" id="myInput" onkeyup="myFunction()" placeholder="Search Food..."> <img src="images/searchcar.jpg" width="15%"/>
        </form>
        </div>
        </div>
        
        <hr><br>
        <!--Product PAGE Searching Bar END-->
        <!--PRODUCT PAGE -->
        <!--products section start-->
        <br>
        <%
            foodinterImpl impl = new foodinterImpl();
            ArrayList list = (ArrayList) impl.getcar_info();
        %>

<div class="row" style="margin-left: 8px">

            <c:set var="value" value="<%=list%>" />
            <c:forEach var="a" items="${value}" >

                <div class="column">
                    <div class="card" style="background-color: white">
                        <img src="${a.getCarimage()}" width="367px" height="340px"/> 
                        <div class="container">
                            <h5><b style="color:black">${a.getCarname()}</b></h5>
                            <p style="background-color: gray; width:290px; padding: 10px"><b  style="color: red"> Rs./- </b><b style="color: black">${a.getCarprice()}</b> <input style="margin-left: 60px" class ="btn btn-danger" data-toggle="modal" data-target="#myModal" type="button" value="Book Now"></p>
                        </div>
                    </div>
                </div>
            </c:forEach>


        </div>




        <!--latest footer at bottom start -->


        <div class="container-fluid footer" style="background-color:#7FFFDA;">
            <div class="container-fluid">
                <div class="col-sm-4">
                    
                </div>
                <div class="col-sm-4 midfooter">
                    <h3>Quick Links</h3>
                    <ul>
                        <li><a href="Home.jsp">&raquo; Home </a></li>
                        <li><a href="contact_us.jsp">&raquo; Contact Us</a></li>
                    </ul>

                </div>
                <div class="col-sm-4"></div>
                <h3>Contact Details</h3>
                <p>Address : </strong> Sandeep kumar,(Delhi)</p>
                <p>Email : </strong> sankumar1155@gmail.com</p>
                
                <p style="text-align: right; margin-right: 60px;">Timing : </strong> 10:00am to 9:30pm</p>
            </div>

        </div>
        <!--latest footer at bottom ending -->
        <!--footer section end -->
        
        
        <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="background-color:green; color:orange">
          <button type="button" class="close" data-dismiss="modal" style="color:red">&times;</button>
          <h4 class="modal-title">Fill your details to book order</h4>
        </div>
        <div class="modal-body">
          <form action="ordrdb.jsp" method="post">
    <div class="form-group">
        <label for="pwd">Name:</label>
     <input type="plain" class="form-control" placeholder="Enter your name" name="bname" required>
    </div>
     <div class="form-group">
         <label for="pwd">Email:</label>
     <input type="email" class="form-control" placeholder="Enter your email" name="bemail" required>
    </div>
    <div class="form-group">
      <label>Contact:</label>
      <input type="plain" class="form-control" placeholder="Enter your mobile number" onchange="CheckIndianNumber(this.value)" name="bnumber" maxlength="10"required>
    </div>
              <script>
function CheckIndianNumber(IndianNumber)
{
var IndNum = /^([0|\+[0-9]{1,5})?([7-9][0-9]{9})$/;
if(IndNum.test(IndianNumber))
       {
           swal(
  'Success!',
  'Valid Mobile Number',
  'success'
)
       }
       else
       {
           swal(
      'Error!',
      'Mobile number is not valid!',
      'error'
    )
       }
}
</script>
     <div class="form-group">
     <label>Your Address:</label>
  <textarea class="form-control" rows="5" name="bcomment" required></textarea> 
    </div>
              <button type="submit" class="btn btn-primary">SUBMIT</button> 
  </form>
     
        </div>
      </div>
      
    </div>
  </div>
    </body>
</html>