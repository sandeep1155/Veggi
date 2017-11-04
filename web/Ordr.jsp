<%-- 
    Document   : Ordr
    Created on : Sep 28, 2017, 12:26:06 PM
    Author     : sandeep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Final Booking page</title>
        <script src="js/sweetalert.min.js"></script>
<link rel="stylesheet" href="css/sweetalert.css">
    </head>
    <body>
        <jsp:useBean id="fibo" scope="page" class="load.Ordr" />
        <jsp:setProperty name="fibo" property="order_id" />
        <jsp:setProperty name="fibo" property="order_Date" />
        <jsp:setProperty name="fibo" property="Quantity" />
        <jsp:setProperty name="fibo" property="Id" />
        
        
        <script>
            var a=fibo.store();
            if(a === 1){
            alert("Data Saved Successfully");
        }else {
            alert("Data Failed to save");
        }
        </script>
        <%        
        int a=fibo.store();
        if(a==1){
            //out.print("Value Stored");
        }else {
            //out.print("Value not Stored");
        }
        %>
        
        <%
            response.sendRedirect("fbook.jsp");
            response.getWriter().append("<script>alert('Your car booking successfully Done!!,'); </script>");
            
            
            %>
    </body>
</html>
