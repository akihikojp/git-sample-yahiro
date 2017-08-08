<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h3>プロ野球<br>セントラル・リーグ一覧</h3>

<form action="/5km/execute" method="post">
<c:forEach var="teams" items="${teams}">
<a href="/5km/execute?id=<c:out value="${teams.id}"/>">
<c:out value="${teams.teamName}"/></a><br>
</c:forEach>
</form>
</body>
</html>