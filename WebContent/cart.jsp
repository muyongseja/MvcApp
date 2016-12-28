<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<b>현재 주문한 도서</b>
<table border="1">
	<tr>
		<th>도서 제목</th><th>작가</th><th>가격</th><th>수량</th>
	</tr>
</table>
<br><br>
<form method="post" action="shop">
	<input type="hidden" name="cmd" value="CHKOUT"/>
	<input type="submit" value="체크 아웃"/>
</form>
</body>
</html>












