<%-- 
    Document   : menu2
    Created on : Sep 24, 2017, 10:44:42 PM
    Author     : sandeep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <c:import url="head-meta.jsp"/>
     
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquerys.js"></script>
  <script src="js/myscript.js"></script>
  
  <link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/mystyle.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
   <script src="js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css" />
        <title>Menu</title>
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
<span class="glyphicon glyphicon-envelope"></span>  Veggi    
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
<a class="navbar-brand" href="#" style="color:#17A589">Veggi</a>
      <ul class="nav navbar-nav">
        <li><a href="Home.jsp">Home</a></li>
        <li><a href="contact_us.jsp">Contact Us</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">

          <!-- User Nmae -->
          <li><a href="#"><span class="glyphicon glyphicon-user"></span> <b style="color:green">Welcome </b><b style="color:Orange"> <%= request.getSession().getAttribute("userdb") %></b></a></li>
    	

<!-- User Registration Button -->
	<li ><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
<!--navigation section end -->

<!--Product PAGE Searching Bar-->  
<div class="container"> 
<div row="row">
<form>
  <input type="text" name="search" id="myInput" onkeyup="myFunction()" placeholder="Search Food..."> <img src="images/TableService.png" width="15%"/>
</form>
</div>
</div>

<hr><br>
<!--Product PAGE Searching Bar END-->
<!--PRODUCT PAGE -->
<!--products section start-->
<div class="container" id="myUL">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading" >Dosa</div>
        <a href="Dosa.jsp"><div class="panel-body"><img src="images/Dosa.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <div class="panel-footer"><b style="color:red;">Buy at  </b><img src="images/ic.png"/><b>150</b></div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Idli</div>
        <a href="Idli.jsp"><div class="panel-body"><img src="images/idli.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <div class="panel-footer"><b style="color:red;">Buy at  </b><img src="images/ic.png"/><b>120</b></div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Bisi bele bath</div>
        <a href="Bisi Bele Bath.jsp"><div class="panel-body"><img src="images/bisibelebath.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <div class="panel-footer"><b style="color:red;">Buy at  </b><img src="images/ic.png"/><b>80</b></div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Koottu </div>
        <a href="Kottu.jsp"><div class="panel-body"><img src="images/Koottu.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <div class="panel-footer"><b style="color:red;">Buy at  </b><img src="images/ic.png"/><b>90</b></div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Mendu Vada</div>
        <a href="Mendu Vada.jsp"><div class="panel-body"><img src="images/mendu vada.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <div class="panel-footer"><b style="color:red;">Buy at  </b><img src="images/ic.png"/><b>100</b></div>
      </div>
    </div>
	<div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Pongal</div>
        <a href="Pongal.jsp"><div class="panel-body"><img src="images/Pongal.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <div class="panel-footer" ><b style="color:red;">Buy at  </b><img src="images/ic.png"/><b>80</b></div>
      </div>
    </div>
      <br></div>
	<div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Uttapam</div>
        <a href="Uttapam.jsp"><div class="panel-body"><img src="images/Uttapam.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <div class="panel-footer"><b style="color:red;">Buy at  </b><img src="images/ic.png"/><b>120</b></div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Avial </div>
        <a href="Avial.jsp"><div class="panel-body"><img src="images/Avial.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <div class="panel-footer"><b style="color:red;">Buy at  </b><img src="images/ic.png"/><b>120</b></div>
      </div>
    </div>
      <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Bonda</div>
        <a href="Bonda.jsp"><div class="panel-body"><img src="images/Bonda.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <div class="panel-footer"><b style="color:red;">Buy at  </b><img src="images/ic.png"/><b>80</b></div>
      </div>
    </div>
	</div>
</div><br><br>
<!--products section end -->

<!--Footer section start -->
<footer class="container-fluid text-center">
  <h4><i><b>Veggis</b></i></h4>  
  <form class="form-inline"><b>Get deals:</b>
    <input type="email" class="form-control" size="50" placeholder="Enter your email-id" required>
    <button type="button" class="btn btn-danger lastbtn">Subscribe now</button>
  </form>
</footer>

<!--latest footer at bottom start -->
<div class="container-fluid footer" style="background-color:#145A32;">
<div class="container-fluid">
<div class="col-sm-4">

<p><a href="#" class="btn btn-danger" >Read More...</a></p>
</div>
<div class="col-sm-4 midfooter">
<h3>Quick Links</h3>
<ul>
<li><a href="Home.jsp">&raquo; Home </a></li>
<li><a href="about_us.jsp">&raquo; About Us</a></li>
<li><a href="contact_us.jsp">&raquo; Contact Us</a></li>
</ul>

</div>
<div class="col-sm-4"></div>
<h3>Contact Details</h3>
<p>Address : </strong>South-X(Delhi,India)</p>
<p>Email : </strong> Veggi</p>
<p>Phone : </strong> 9910440857</p>
<p style="text-align: right; margin-right: 60px;">Timing : </strong> 9:30am to 6:30pm</p>
</div>

</div>
<!--latest footer at bottom ending -->
<!--footer section end -->
    </body>
</html>