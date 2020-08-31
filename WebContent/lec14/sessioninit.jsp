<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>세션 생성</h1>
	<%
		session.setAttribute("mySessionName", "mySessionData");
		session.setAttribute("myNum", 12345);
	%>
	
	
<a href="sessionget.jsp">session 확인</a>
</body>
</html>