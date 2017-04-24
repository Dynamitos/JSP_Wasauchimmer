<%-- 
    Document   : e101_StartView
    Created on : 24.04.2017, 14:10:17
    Author     : Ma He, Freunde, Races san super! Cool, he!
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! int fib1 = 1; int fib2 = 1, fib3; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ein Haufen Zahlen</h1>
        <%
            out.write(fib1 + " " + fib2 + " ");
            for(int i = 0; i < 20; i ++)
            {
                fib3 = fib1 + fib2;
                out.write(fib3 + " ");
                out.write(" ");
                fib1 = fib2;
                fib2 = fib3;
            }
        %>
    </body>
</html>
