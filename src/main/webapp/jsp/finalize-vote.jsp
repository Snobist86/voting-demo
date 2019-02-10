<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Finalize vote</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/finalizeVote" method="post">
    <label>select topic:</label> <br>

    <select name="voting_topic">
        <c:forEach var="voting_topic" items="${topics}">
            <c:if test="${voting_topic.activity eq 'ENABLE'}">
                <option value="${voting_topic.id}">${voting_topic.name}</option>
            </c:if>
        </c:forEach>
    </select><br>

    <input type="submit" value="FINALIZE VOTE">
</form>
</body>
</html>