<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div></div>
	<div>
		<label>선수목록</label>
		<ul>
			<c:forEach items="${list}" var="item" varStatus="status">
				<li id="${status.index}">${item}</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>