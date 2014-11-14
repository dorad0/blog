<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03.11.2014
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login page</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>


<form name="login" action="/Controller" method="post">
    <input type="hidden" name="command" value="login">
    Login:<br/>
    <input type="text" name="login" value=""/>
    <br/>Password:<br/>
    <input type="password" name="password" value=""/>
    <br/>
    ${errorLoginPassMessage}
    <br/>
    ${wrongAction}
    <br/>
    ${nullPage}
    <br/>
    <c:out value=""/>
    <input type="submit" value="Log in"/>
</form>
<form name="join" action="/Controller" method="post">
    <input type="hidden" name="command" value="REGISTERPAGE">
    <input type="submit" value="Join"/>
</form>
</body>
</html>
