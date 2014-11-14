<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03.11.2014
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Register page</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<form name="registerForm" action="/Controller" method="post">
    <input type="hidden" name="command" value="REGISTER"/>
    Name:<br>
    <input type="text" name="userName"/>
    <br>
    Password:<br>
    <input type="password" name="password"/>
    <br>
    ${errorRegisterMessage}
    <br/>
    ${wrongAction}
    <br/>
    ${nullPage}
    <br/>
    <input type="submit" value="Register"/>
</form>
</body>
</html>
