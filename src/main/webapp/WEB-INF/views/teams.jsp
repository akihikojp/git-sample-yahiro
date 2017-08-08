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

<form:form action="" method="post">
<c:forEach var="teams" items="${teams}">
<a href="/index?id=1"><c:out value="${teams.teamName}"/></a>
<a href="/index?id=2"><c:out value="${teams.teamName}"/></a>
<a href="/index?id=3"><c:out value="${teams.teamName}"/></a>
<a href="/index?id=4"><c:out value="${teams.teamName}"/></a>
<a href="/index?id=5"><c:out value="${teams.teamName}"/></a>
<a href="/index?id=6"><c:out value="${teams.teamName}"/></a>
</c:forEach>
</form:form>
</body>
</html>