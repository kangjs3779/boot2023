<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sign Up</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>

	<div class="container text-center">
		<h1>Sign Up</h1>
	</div>

	<div class="card container" style="width: 30rem;">
		<br>
		<!-- 이메일 입력  -->
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label"> Email address </label>
			<input type="email" class="form-control joinInfo" id="exampleFormControlInput1" placeholder="name@example.com">

			<div id="passwordHelpBlock" class="form-text">이메일 형태로 적어주세요.</div>
		</div>
		<!-- 이메일 중복 확인 버튼  -->
		<button type="button" class="btn btn-outline-secondary" data-bs-toggle="modal" data-bs-target="#emailCheck">ID check!</button>
		<div id="passwordHelpBlock" class="form-text">아이디 중복확인을 하였습니다.</div>

		<!-- 이메일 중복 확인 modal -->
		<div class="modal fade" id="emailCheck" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h1 class="modal-title fs-5" id="staticBackdropLabel">아이디 중복 확인!</h1>
						<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
					</div>
					<div class="modal-body">아이디를 사용할 수 있습니다.</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-outline-secondary" data-bs-dismiss="modal">Again</button>
						<button type="button" class="btn btn-outline-primary">Use</button>
					</div>
				</div>
			</div>
		</div>
		<!-- 비밀번호 입력  -->
		<label for="inputPassword5" class="form-label">Password</label>
		<input type="password" id="inputPassword5" class="form-control joinInfo" aria-labelledby="passwordHelpBlock">
		<div id="passwordHelpBlock" class="form-text">비밀번호는 8-10자리 사이로 영어와 숫자, 특수기호를 섞어 만들어주세요.</div>
		<br>
		<!-- 비밀번호 확인  -->
		<label for="inputPassword6" class="form-label"> Confirm Password </label>
		<input type="password" id="inputPassword6" class="form-control joinInfo" aria-labelledby="passwordHelpBlock">
		<!-- 비밀번로 확인 modal 버튼  -->
		<button type="button" class="btn btn-outline-secondary" data-bs-toggle="modal" data-bs-target="#passwordCheck">password check!</button>
		<div id="passwordHelpBlock" class="form-text">비밀번호를 확인해주세요.</div>

		<!-- 비밀번호 Modal 내용  -->
		<!-- 비밀번호 틀리면 비밀번호가 틀립니다,
		조건에 안맞으면 비밀번호는 영어와 숫자, 특수기호를 모두 포함한 8-10자리 사이로 입력해주세요  -->
		<!-- check버튼을 누르면 비밀번호 설정 완료! 라고 문구 띄우기  -->
		<div class="modal fade" id="passwordCheck" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h1 class="modal-title fs-5" id="staticBackdropLabel">비밀번호 확인!</h1>
						<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
					</div>
					<div class="modal-body">비밀번호가 바르게 입력되었습니다.</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-outline-secondary" data-bs-dismiss="modal">Again</button>
						<button type="button" class="btn btn-outline-primary">Check</button>
					</div>
				</div>
			</div>
		</div>


		<br>
		<div class="row">
			<div class="col">
				<label for="firstName" class="form-label"> First Name </label>
				<input type="text" class="form-control joinInfo" placeholder="First name" aria-label="First name" id="firstName">
			</div>
			<div class="col">
				<label for="lastName" class="form-label"> Last Name </label>
				<input type="text" class="form-control joinInfo" placeholder="Last name" aria-label="Last name" id="lastName">
			</div>
			<div id="passwordHelpBlock" class="form-text">이름은 영어로 입력해주세요.</div>

		</div>
		<br>
		<div class="col-12">
			<label for="inputAddress" class="form-label">Phone Number</label>
			<input type="text" class="form-control joinInfo" id="inputAddress" placeholder="번호 입력">
		</div>
		<div id="passwordHelpBlock" class="form-text">입력할 때, -를 빼고 적어주세요.</div>
		<br>
		<div class="col-12">
			<label for="inputAddress" class="form-label">Address</label>
			<input type="number" class="form-control joinInfo" id="inputAddress" placeholder="주소 입력">
		</div>
		<div class="col-12">
			<label for="inputAddress2" class="form-label">Address 2</label>
			<input type="text" class="form-control joinInfo" id="inputAddress2" placeholder="상세 주소 입력">
		</div>

		<div class="col-md-6">
			<label for="inputState" class="form-label">Country</label>
			<select id="inputState" class="form-select joinInfo">
				<option selected>Choose...</option>
				<option>Korea</option>
				<option>USA</option>
				<option>UK</option>
				<option>Spain</option>
				<option>Germany</option>
			</select>
		</div>
		<div class="col-md-6">
			<label for="inputZip" class="form-label">Zip</label>
			<input type="text" class="form-control joinInfo" id="inputZip">
		</div>
		<div class="card-body">
			<p class="card-text">정보를 모두 입력해주세요.</p>
		</div>

		<!-- 회원가입 버튼  -->
		<div class="container text-center ">
			<button class="btn btn btn-outline-primary" data-bs-toggle="modal" data-bs-target="#joinCompleteModal1">sign up</button>
			<a href="Homepage" class="btn btn-outline-secondary">back</a>
		</div>

		<!-- join Modal -->
		<div class="modal fade" id="joinCompleteModal1" tabindex="-1" aria-labelledby="joinCompleteModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h1 class="modal-title fs-5" id="joinCompleteModalLabel">회원가입 완료!</h1>
						<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
					</div>
					<div class="modal-body">회원가입이 완료되었습니다.</div>
					<div class="modal-footer">
						<a href="Homepage" class="btn btn-outline-secondary"> Close </a>
					</div>
				</div>
			</div>
		</div>
		<br>
	</div>
	<br>


	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous">
		let
	</script>
</body>
</html>