<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>당신이 선택한 학과에 대한 정보입니다.</h2>
<%
	ArrayList advice = (ArrayList)request.getAttribute("advice");
	for(int i=0; i<advice.size(); i++){
%>
		<div style="color:blue"><%=advice.get(i)%></div>
<%
	}
%>
</body>
</html>



