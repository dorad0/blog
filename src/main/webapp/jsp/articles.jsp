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
    <title>Articles</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<jsp:useBean id="factory" scope="request" class="dao.Factory"/>
<p>
<table>
    <tr>
        <td>Hi <c:out value="${userName}"/>.</td>
        <td>
            <form name="UserExitForm" action="/Controller" method="post">
                <input type="hidden" name="command" value="LOGOUT"/>
                <input type="submit" name="Sign_out" value="Sign out"/>
            </form>
        </td>
        <td>
            <form name="UserAddArticleForm" action="/Controller" method="post">
                <input type="hidden" name="command" value="ADDARTICLE"/>
                <input type="hidden" name="userName" value="${userName}"/>
                <input type="submit" name="Add_article" value="Add article"/>
            </form>

        </td>
    </tr>
</table>
</p>

<c:forEach var="article" items="${factory.articleDAO.articles}">
    <h1><c:out value="${article.title}"/></h1>

    <p>
        <c:out value="${article.data}"/>
        <br>
        By <c:out value="${article.user.name}"/>
    </p>

    <c:forEach var="comment" items="${article.comments}">
        <p>
            (<c:out value="${comment.user.name}"/>): <c:out value="${comment.commentData}"/>
        </p>
    </c:forEach>
    <form name="AddCommentForm" action="/Controller" method="post">
        <input type="hidden" name="command" value="ADDCOMMENT"/>
        <input type="hidden" name="userName" value="${userName}"/>
        <input type="hidden" name="articleId" value="${article.id}"/>
        <input type="text" name="commentData"/>
        <input type="submit" value="Write"/>
        <br>
            ${errorCommentDataMessage}
    </form>
</c:forEach>

</body>
</html>
