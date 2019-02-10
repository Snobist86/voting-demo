<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
Hello ${currentVoter.e_mail}!

<form action="${pageContext.request.contextPath}/startVote" method="get">
    <label>select a topic to start vote:</label> <br>

    <select name="voting_topic">
        <c:forEach var="voting_topic" items="${topics}">
            <c:if test="${voting_topic.activity eq 'ENABLE'}">
                <option value="${voting_topic.id}">${voting_topic.name}</option>
            </c:if>
        </c:forEach>
    </select><br>

    <input type="submit" value="START VOTE">
</form>

<form action="${pageContext.request.contextPath}/getResult" method="get">
    <label>select a topic to get voting results:</label> <br>

    <select name="voting_topic">
        <c:forEach var="voting_topic" items="${topics}">
            <c:if test="${voting_topic.activity eq 'DISABLE'}">
                <option value="${voting_topic.id}">${voting_topic.name}</option>
            </c:if>
        </c:forEach>
    </select><br>

    <input type="submit" value="GET RESULT">
</form>

<c:if test="${currentVoter.role eq 'ADMIN'}">
    <form action="${pageContext.request.contextPath}/createVote" method="get">
        <label>Or create a new vote </label>
        <input type="submit" value="CREATE">
    </form>

    <form action="${pageContext.request.contextPath}/finalizeVote" method="get">
        <label>Or finalize the vote</label>
        <input type="submit" value="FINALIZE">
    </form>
</c:if>
</body>
</html>
