<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>변수 설정 c:set</h3>
	<c:set var="vatName" value="varValue" />
	vatName :
	<c:out value="${vatName}" />
	<br />

	<h3>변수 제거 c:set</h3>
	<c:remove var="vatName" />
	vatName :
	<c:out value="${vatName}" />
	</h3>

	<hr />
	<h3>변수 설정 c:set</h3>
	<c:catch var="error">
		<%=2 / 0%>
	</c:catch>
	<br />
	<h3>예외처리 c:set</h3>
	<c:out value="${error}" />

	<hr />
	<h3>제어문 if c:set</h3>
	<c:if test="${1+2==3}">
		1 + 2 = 3
	</c:if>
	<h3>제어문 if c:set</h3>
	<c:if test="${1+2!=3}">
		1 + 2 != 3
	</c:if>

	<hr />
	<h3>반복문 c:set</h3>
	<c:forEach var="fEach" begin="0" end="30" step="3">
		<h2>${fEach}</h2>
	</c:forEach>

	<% int fori=0;
	
		for ( fori = 0; fori < 30; fori++) {
	%>
	<hr><h1><%= fori %></h1>
	<%
		}
	%>


</body>
</html>