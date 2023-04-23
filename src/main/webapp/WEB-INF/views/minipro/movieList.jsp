<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Movie List</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>

	<h1 class="text-center"><a href="movieDiaryHomePage" class="link-secondary link-offset-2 link-underline-opacity-0 link-underline-opacity-100-hover">Movie</a> List</h1>
	<br />
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Index</th>
					<th>Title</th>
					<th>Released Date</th>
					<th>Direct</th>
					<th>Note</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${lists }" var="list">
					<tr>					
						<td>${list.movieIndex }</td>
						<td>${list.title }</td>
						<td>${list.releaseDate }</td>
						<td>${list.director }</td>
						<td>${list.note }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="btn-group btn-group-sm" role="group" aria-label="Small button group">
			<div class="p-2">
				<button type="submit" class="btn btn-outline-secondary" onclick="location.href='change'">change</button>
				<button type="submit" class="btn btn-outline-secondary" onclick="location.href='delete'">Delete</button>
			</div>
		</div>
	</div>




	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>