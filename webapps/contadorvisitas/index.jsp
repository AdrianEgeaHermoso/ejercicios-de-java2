<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>

    

    
    <% 
    if(session.getAttribute("contador") == null){
        session.setAttribute("contador", 1);
    }else{
        session.setAttribute("contador", (Integer)session.getAttribute("contador") + 1);
    }
        

     %>

     <h1>VISITAS: <%= session.getAttribute("contador") %></h1>
  </body>
</html>