<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<label>Your vote has been counted</label>
<form action="${pageContext.request.contextPath}/finish" method="get">
    <input type="submit" value="To the choice of topics">
</form>
</body>
</html>