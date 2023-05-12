<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="d" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>

	<h1>JSON -> javaBean</h1>
	<button id="btn1">method1 json전송</button> <br />
	<button id="btn2">method2 json전송</button> <br />
	<button id="btn3">method3 json전송</button> <br />
	<button id="btn4">method4 json전송</button> <br />
	<button id="btn5">method5 json전송</button> <br />
	<button id="btn6">method6 json전송</button> <br />
	<button id="btn7">method7 json전송</button> <br />
	
	<hr />
	
	<input type="text" id="inputName" placeholder="이름"/> <br />
	<input type="number" id="inputAge" placeholder="나이" /> <br />
	<button id="btn8">전송</button>
	<hr />
	<input type="text" id="name2" placeholder="이름"> <br />
	<input type="text" id="email2" placeholder="이메일"> <br />
	<input type="number" id="score2" placeholder="점수"> <br />
	<select id="married2" >
		<option value="false">미혼</option>
		<option value="true">기혼</option>
	</select>
	<!-- 체크박스로 하는 방법 -->
	<button id="btn9">전송</button>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.4/jquery.min.js" integrity="sha512-pumBsjNRGGqkPzKHndZMaAG+bir374sORyzM3uulLV14lN5LyykqNk8eEeUlUkB3U0M4FApyaHraT65ihJhDpQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	
	<script src="/js/sub37/ajax.js"></script>
</body>
</html>