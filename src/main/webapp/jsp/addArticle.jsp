<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 13.11.2014
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add article</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
    <form name="SaveArticleForm" action="/Controller" method="post">
        <input type="hidden" name="command" value="SAVEARTICLE"/>
        <input type="hidden" name="userName" value="${userName}"/>
        <p><b>Enter title</b></p>
        <input type="text" name="title"/>
        <p><b>Enter your article:</b></p>
        <p><textarea rows="10" cols="45" name="articleData"></textarea></p>
        <input type="submit" name="SaveArticle" value="Save"/>
    </form>
</body>
</html>
