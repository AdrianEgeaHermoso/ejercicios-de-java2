<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>
      <h1>DINOSAURIOS</h1>
    <% 
    if(session.getAttribute("usuario") == null){
        %>
        <a href="login.jsp">Login</a>
        <%

    }else{
        %>
        <a href="login.jsp">Log Out</a>
        <%
    }
    %>
  </body>
</html>