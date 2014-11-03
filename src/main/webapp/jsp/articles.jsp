<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03.11.2014
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:forEach var="article" items="${lst}">
    <h2><c:out value="${article.title}"/></h2>
    <p><c:out value="${article.data}"/></p>
    By <c:out value="${article.user.name}"/>
</c:forEach>

</body>
</html>
