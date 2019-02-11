<%-- 
    Document   : Failes
    Created on : Dec 21, 2018, 8:25:49 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="color: red;"><% out.println(session.getAttribute("setID")); %> is not existed in database!</h1>
    </body>
</html>
