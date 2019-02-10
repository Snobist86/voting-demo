<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
Hello, voter!
<form action="${pageContext.request.contextPath}/login" method="get">
    <button type="submit">Log in</button>
</form>
<form action="${pageContext.request.contextPath}/registration" method="get">
    <button type="submit">Registration</button>
</form>
</body>
</html>