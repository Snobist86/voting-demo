<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registration" method="post">
    <label for="email">E-mail: </label>
    <input type="text" name="email" id="email"><br>
    <input type="hidden" name="role" value="${role}"><br>
    <input type="submit" value="SEND">
</form>
</body>
</html>
