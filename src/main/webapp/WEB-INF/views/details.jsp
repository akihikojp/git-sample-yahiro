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
<body>
球団名:<br>
<c:out value="${baseball.teamName}"/><br>
本拠地:<br>
<c:out value="${baseball.headquarters}"/><br>
発足:<br>
<c:out value="${baseball.inauguration}"/><br>
歴史:<br>
<pre><c:out value="${baseball.history}"/></pre>

<form action="/5km/index" method="post">
<input type="submit" value="戻る">
</form>
</body>
</html>