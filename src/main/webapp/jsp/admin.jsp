<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.11.2014
  Time: 8:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Delete user</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<p>Delete user</p>
    <form name="DeleteUserForm" action="/Controller" method="post">
        <input type="hidden" name="command" value="DELETEUSER"/>
        Enter user name:<br/>
        <input type="text" name="userName" value=""/>
        <br/>
        ${errorUserDeleteMessage}
        <br/>
        ${deleteStatus}
        <br/>
        ${nullPage}
        <br/>
        <input type="submit" value="Delete"/>
    </form>
    <p>Delete article</p>
    <form name="DeleteArticleForm" action="/Controller" method="post">
        <input type="hidden" name="command" value="DELETEARTICLE"/>
        Enter article name:<br/>
        <input type="text" name="articleTitle" value=""/>
        <br/>
        ${errorDeleteArticleMessage}
        <br/>
        ${articleDeleteStatus}
        <br/>
        ${nullPage}
        <br/>
        <input type="submit" value="Delete"/>
    </form>
</body>
</html>
