<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    </head>

    <body>
        <h1>Página 2</h1>

        

        La variable x vale <%= session.getAttribute("x")%><br>
        La variable nombre vale <%= session.getAttribute("nombre")%><br>
        La variable precio vale <%= session.getAttribute("precio")%><br>

        <a href="index.jsp">Principal</a><br>
        <a href="pagina1.jsp">Pagina 1</a><br>
        
    </body>

    </html>