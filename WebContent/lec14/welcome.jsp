<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		Enumeration enumeration = session.getAttributeNames();
		while(enumeration.hasMoreElements()){
			String sName = enumeration.nextElement().toString();
			String sValue = (String)session.getAttribute(sName);
			
			if(sValue.equals("abcde")) out.println(sValue + "님 안녕하세요." + "<br />");
		}
	%>
	
	<a href="logout.jsp">로그아웃</a>
	<hr>
	<a href="sessionget.jsp">세션 얻어오기</a>
	<a href="sessioninit.jsp">세션초기화</a>
	<a href="sessiontest.jsp">세션  테스트</a>
	
</body>
</html>