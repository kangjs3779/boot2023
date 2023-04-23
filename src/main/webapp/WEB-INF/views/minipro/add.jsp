<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Movie Add</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<br />
	<div class="mx-auto p-2 card" style="width: 40rem;">
		<div class="card-body">
			<h2 class="text-center card-title">Add <a href="movieDiaryHomePage" class="link-secondary link-offset-2 link-underline-opacity-0 link-underline-opacity-100-hover">Movie</a></h2>
			<hr>
			<form action="addCheck">
				<div class="mb-3">
					<label for="formFile" class="form-label">Movie Picture</label>
					<input class="form-control" type="file" id="formFile">
				</div>
				<div class="mb-3">
					<label for="title" class="form-label">Title</label>
					<input type="text" class="form-control" id="title" name="title">
				</div>
				<div class="mb-3">
					<label for="Director" class="form-label">Director</label>
					<input type="text" class="form-control" id="Director" name="director">
				</div>
				<div class="mb-3">
					<label for="ReleaseDate" class="form-label">Released Date</label>
					<input type="date" class="form-control" id="ReleaseDate" name="releaseDate">
				</div>
				<div class="mb-3">
					<label for="Note" class="form-label">Note</label>
					<textarea class="form-control" id="Note" rows="10" name="note"></textarea>
				</div>
				<input type="submit" class="btn btn-outline-dark" value="Add"> 
			</form>
		</div>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>