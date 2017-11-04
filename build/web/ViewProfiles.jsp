<%-- 
    Document   : ViewProfiles
    Created on : Sep 6, 2017, 8:39:28 PM
    Author     : Sandeep kumar
--%>



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="profiles.Profiles"%>
<%@page import="profiles.ProfileDaoIMPl"%> 
<%@page import="profiles.ProfileDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Profile Page</title>
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
    
    <%
    ProfileDAO pdao = new ProfileDaoIMPl();
    
   List<Profiles> list = pdao.getProfiles();         
         
   
   request.setAttribute("products", list);
    
    %>
    
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
        <li class="active"><a href="ViewProfiles.jsp">Profiles</a></li>
        <li><a href="cloud.jsp">Upload Products</a></li>
        <li><a href="fooddetails.jsp">Products Detail</a></li>
      
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
        <h1 style="border:1px solid brown; margin: auto; width: 80%; text-align: center;">View Profiles </h1>
        <br><BR>
        <table class="table table-striped" style="margin: auto; width: 80%; text-align: center;"> 
           
            <tbody>
                <c:forEach items="${products}" var="x">
                <tr>
                    <th>${x.getName()}</th>
                     <th>${x.getEmail()}</th>
                      <th>${x.getPhone()}</th>
                       <th>${x.getAddress()}</th>
                       <th><a href="DeleteFromDB?id=${x.getId()}" class="btn btn-danger">Delete</a></th>
                        <th> <th><a href="UpDate.jsp?id=${x.getId()}" class="btn btn-success">Update</a></th></th>
                </tr>
                </c:forEach>
                
            </tbody>
        </table>
     
      
              
        
    </body>
    </head>

