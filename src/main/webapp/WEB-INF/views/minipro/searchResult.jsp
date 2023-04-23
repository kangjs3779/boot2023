<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Movie infomation</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<h1 class="text-center">영화 '${param.title }' 정보입니다.</h1>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Title</th>
					<th>Released Date</th>
					<th>Direct</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${info.title }</td>
					<td>${info.releaseDate }</td>
					<td>${info.director }</td>
				</tr>					
			</tbody>
		</table>
	</div>
	
	<div class="mx-auto p-2" style="width: 200px;">
		<button class="btn btn-outline-dark" onclick="location.href='movieDiaryHomePage'">Home</button>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>