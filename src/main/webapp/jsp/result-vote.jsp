<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<label>Name: ${selected_vote.name}</label><br>
<c:forEach items="${selected_vote.options}" var="option">
    <label>${option.textOption}: ${option.value}</label><br>
</c:forEach>

<form action="${pageContext.request.contextPath}/finish" method="get">
    <input type="submit" value="To the choice of topics">
</form>
</body>
</html>