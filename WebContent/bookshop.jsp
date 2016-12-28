<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>도서 주문 페이지</h1>
<form method="post" action="cart.jsp">
	<b>도서 선택 : </b>
	<select name="book">
		<option>어린왕자 / 생떽쥐뻬리 / 15000</option>
		<option>연금술사 / 파올로 코엘료 / 21000</option>
		<option>홍길동전 / 허균 / 30000</option>
		<option>50 Greats Short Stories / Crane, Milton / 9800</option>
	</select>
	<b>수량 : </b>
	<input type="text" name="quantity" size="2" value="1"/>
	<input type="submit" value="장바구니에 담기"/>
</form>
</body>
</html>











