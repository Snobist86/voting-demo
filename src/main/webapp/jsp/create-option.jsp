<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create vote</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/createOption" method="post">
    <input type="hidden" name="id" value="${currentVote.id}"><br>
        <label for="textOption">Option: </label>
        <input type="text" name="textOption" id="textOption">
    <input type="submit" value="CREATE">
</form>
<form action="${pageContext.request.contextPath}/finish" method="get">
    <button type="submit">Finish creation</button>
</form>
</body>
</html>