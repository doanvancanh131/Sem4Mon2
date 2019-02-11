<%-- 
    Document   : login
    Created on : Dec 21, 2018, 8:27:12 AM
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
        <h1>Login form</h1>
        <form action="j_security_check" method="POST">
            Username: <input type="text" name="j_username"><br><br>
            Password: <input type="password" name="j_password"><br><br>
            <input type="submit" value="Sign in">
        </form>
    </body>
</html>
