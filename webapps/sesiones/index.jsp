<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    </head>

    <body>
        <h1>Sesiones</h1>

        <% 
        session.setAttribute("color", "verde");
        session.setAttribute("x", 7);
        session.setAttribute("nombre", "Adri");
        session.setAttribute("precio", 7.5);
        
        %>

        La variable x vale <%= session.getAttribute("x")%><br>
        La variable nombre vale <%= session.getAttribute("nombre")%><br>
        La variable precio vale <%= session.getAttribute("precio")%><br>


        <a href="pagina1.jsp">Pagina 1</a><br>
        <a href="pagina2.jsp">Pagina 2</a><br>
    </body>

    </html>