<%@page import="model.BookDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>도서 구매 주문 페이지</h1>
<b>주문한 도서</b>
<table border="1">
	<tr>
		<th>도서 제목</th><th>작가</th><th>가격</th><th>수량</th>
	</tr>
<%
try{
	ArrayList bookList = (ArrayList)session.getAttribute("bookList");
	for(int i=0; i<bookList.size(); i++){
		BookDto dto = (BookDto)bookList.get(i);
%>
	<tr>
		<td><%=dto.getTitle()%></td>
		<td><%=dto.getAuthor()%></td>
		<td><%=dto.getPrice()%></td>
		<td><%=dto.getQuantity()%></td>
	</tr>
<%
	}
}
catch(NullPointerException err){}
%>
</table>
<br><br>
<b>전체 구입 액수 : </b><br><br>
<form method="post">
	<input type="submit" value="결제"/>
</form>
</body>
</html>












