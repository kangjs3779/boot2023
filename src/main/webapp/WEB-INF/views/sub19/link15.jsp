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

	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Tile</th>
					<th>Published Date</th>
					<th>Price</th>
					<th>Updated Date</th>
					<th>Weight</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${lists }" var="list">
					<tr>
						<td>${list.title }</td>
						<td>${list.published }</td>
						<td>${list.price }</td>
						<td>${list.updated }</td>
						<td>${list.weight }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>