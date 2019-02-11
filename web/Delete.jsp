<%-- 
    Document   : Delete
    Created on : Dec 21, 2018, 8:20:24 AM
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
        <h1>Delete Form!</h1>
        <form action="DeleteServlet">
            Student ID: <input type="text" name="id" required=""><br><br>
            <input type="submit" name="action" value="Delete"/>
            <input type="reset" name="action" value="Reset"/>
        </form>
    </body>
</html>
