<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Suppliers Infomation</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<div class="container text-center">
		<h1>Supplier Infomation</h1>
	</div>
	<hr />

	<c:choose>
		<c:when test="${param.id > 0 && param.id < 30 }">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Country</th>
						<th>Address</th>
						<th>Phone Number</th>
						<th>ContactName</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${suppliers }" var="list">

						<tr>
							<td>${list.supplierID }</td>
							<td>${list.supplierName }</td>
							<td>${list.country }</td>
							<td>${list.address }</td>
							<td>${list.phone }</td>
							<td>${list.contactName }</td>
						</tr>

					</c:forEach>

				</tbody>
			</table>
		</c:when>

		<c:otherwise>
			<div class="alert alert-danger text-center vstack gap-2 col-md-5 mx-auto" role="alert" style="width: 500px">
				존재하는 ID가 없습니다.
			</div>

		</c:otherwise>
	</c:choose>

	<div class="container text-center">
		<form action="Homepage">
			<button class="btn btn-outline-secondary" type="submit" style="width: 100px">
				back
			</button>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>