<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create a new voting topic</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/createTopicVote" method="post">
    <label for="name">Topic: </label>
    <input type="text" name="name" id="name"><br>
    <input type="hidden" name="activity" value="${activity}">
    <input type="submit" value="SEND">
</form>
</body>
</html>