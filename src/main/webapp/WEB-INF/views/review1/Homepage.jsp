<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>jisookkang</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<div class="container text-center">
		<h1>Jisookkang</h1>
	</div>

	<!-- nav bar -->
	<div class="mx-auto w-25 p-3">
		<ul class="nav nav-tabs">
			<li class="nav-item">
				<a class="nav-link active" aria-current="page" href="#">Home</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="makeGamePage">Make Game</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="makeToDoListPage">Make To do list</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="#">게시판</a>
			</li>

		</ul>
	</div>

	<!-- 본문 카드  -->
	<div class="card container text-center" style="width: 25rem;">
		<br>
		<img src=https://www.pngplay.com/wp-content/uploads/4/Moon-Transparent-Free-PNG.png class="card-img-top" alt="달 사진">
		<div class="card-body">
			<h5 class="card-title"></h5>
			<p class="card-text">
				내가 좋아하는 것만 있는
				<br>
				내가 관심있는 것만 있는
				<br>
				홈페이지~
				<br>
				

			</p>
			<form action="SuppliersINFO" method="get">
				<div class="input-group flex-nowrap">
					<span class="input-group-text"> <label for="id">IDnumber </label>
					</span>
					<input id="id" type="number" placeholder="IDnumber" name="id" />
					<button class="btn btn-outline-secondary" type="submit">submit</button>
				</div>
			</form>
		</div>
		<form action="join">
			<button class="btn btn-outline-secondary" type="submit" style="width: 100px">join</button>
		</form>
		<br>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>