<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Vote</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/success" method="post">
<label>${vote.name}</label><br>
<c:forEach items="${vote.options}" var="option">
    <input type="radio" name="id" value="${option.id}"> <label>${option.textOption}</label><br>
</c:forEach>
<button type="submit">Vote</button>
</form>
</body>
</html>