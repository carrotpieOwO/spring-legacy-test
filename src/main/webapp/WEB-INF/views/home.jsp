<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">

	<title>Home</title>
</head>
<body>
<h1>
	${username}님 홈에 오신 것을 환영합니다.
</h1>
	<form action="/springlegacy/hello" method="post" >
	아이디: <input name = "id" value="ssar"><br>
	패스워드: <input name ="pw" value="1234"><br>

	<input type ="submit" value="입력하기">
	
	</form>
	
	<a href="/springlegacy/hello?id=ssar&pw=1234">헬로이동</a>
	
</body>
</html>
