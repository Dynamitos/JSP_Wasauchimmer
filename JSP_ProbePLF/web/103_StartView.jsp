<%-- 
    Document   : 103StartView
    Created on : 24.04.2017, 14:41:45
    Author     : Gott erhalte, Gott beschütze uns'ren jungen Kaiser. 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ein Haufen Zahlen zum selbst Einstellen</h1>
        <form action="${pageContext.request.contextPath}\CalcFiiboServlet">
            <p>Fibonacci ab Zahl:</p>
            <input type="text" name="startNum"/>
            <p>Für folgende Anzahl an Durchläufen: </p>
            <input type="text" name="turnsNum"/><br/>
            <input type="submit" name="Submit" value="Submit"/>
        </form>
    </body>
</html>
