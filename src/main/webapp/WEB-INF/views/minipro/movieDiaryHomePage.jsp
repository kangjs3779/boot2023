<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="d" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Movie Diary</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<br />
	<div class="mx-auto p-2 card" style="width: 40rem;">
		<div class="card-body">
			<h2 class="text-center card-title">Movie Diary</h2>
			<hr>
			<div class="d-grid gap-2 col-6 mx-auto">
				<button class="btn btn-outline-secondary" onclick="location.href='movieList'">All Movie List</button>
				<button class="btn btn-outline-secondary" onclick="location.href='search'">Search Movie</button>
				<button class="btn btn-outline-secondary" onclick="location.href='add'">Add Movie</button>
			</div>
		</div>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>