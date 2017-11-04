<%-- 
    Document   : cloud
    Created on : Oct 31, 2017, 12:34:28 PM
    Author     : sandeep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload Product Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquerys.js"></script>
  <script src="js/myscript.js"></script>
  
  <link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/mystyle.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css" />
    </head>
    <body>
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
        <li> <a href="ViewProfiles.jsp">Profiles</a></li>
        <li class="active"><a href="cloud.jsp">Upload Products</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">

          <!-- User Nmae -->
          <li><a href="#"><span class="glyphicon glyphicon-user"></span> <b style="color:green">Welcome </b><b style="color:Orange"> Sandeep as Admin</b></a></li>
    	

<!-- User Registration Button -->
	<li ><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
        <br><Br>
        <h1 style="border:1px solid brown; margin: auto; width: 80%; text-align: center;">Upload Products</h1>
        <br><BR>
        
        <form action="foodsupload" method="post" style="margin: auto; width: 80%; text-align: center;" enctype="multipart/form-data">
            <h1 style="font-size: 80px;color:black;   ">Food Information</h1>
            <input type="hidden" value="<%= request.getSession().getAttribute("userdb") %>"  name="username">
            <input type="text" name ="name" class="form-control" placeholder="Your Food Name" required>
              <br>
              <input type="text" name ="price" class="form-control" placeholder="Your Food Price" required>
              <br>
              <center>

                  <input type="file" name="image" class="form-control" style="width: 550px;text-align: center" required>
              </center>
               <br>
            <input type="submit" value="Upload it " class="btn btn-danger" style="width: 80px">
        </form> 
    
        
        
    </body>
</html>
