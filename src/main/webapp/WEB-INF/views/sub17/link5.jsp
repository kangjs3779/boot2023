<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="d" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>

	<h1>${attr.customerId }조회하기</h1>
	
	<form action="link6" method="get">
		id        : <input type="number" name="customerId" value="${attr.customerId }" /> <br />
		이름      : <input type="text" name="customerName" value="${attr.customerName }"  /><br />
		계약명    : <input type="text" name="countactName" value="${attr.contactName }" /><br />
		주소      : <input type="text" name="address" value="${attr.address }" /><br />
		도시      : <input type="text" name="city" value="${attr.city }" /><br />
		우편 변호 :<input type="text" name="postalCode" value="${attr.postalCode }" /><br />
		나라      :<input type="text" name="country" value="${attr.country }" /><br />
		
		<input type="submit" value="수정" />
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>