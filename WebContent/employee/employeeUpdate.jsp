<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 정보 수정</title>
<link href="css/main.css" rel="stylesheet">
<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>정보 수정</h1>
		<form method="post" name="frm" action="employee">
			<input type="hidden" name="command" value="employees_update">
			<table style="width: 600px">
				<tr>
					<th style="width: 60px">아이디</th>
					<td><input type="text" name="id" value="${employee.id }"
						readonly></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" value="${employee.name }">
					</td>
				</tr>
				<tr>
					<th>권한</th>
					<td><select name="lev">
							<c:choose>
								<c:when test="${employee.lev=='A' }">
									<option value="A" selected>관리자</option>
									<option value="B">일반사원</option>
								</c:when>
								<c:otherwise>
									<option value="A">관리자</option>
									<option value="B" selected>일반사원</option>
								</c:otherwise>
							</c:choose>
					</select></td>
				</tr>
				<tr>
					<th>성별</th>
					<td><select name="gender">
							<c:choose>
								<c:when test="${employee.gender==1 }">
									<option value="1" selected>남자</option>
									<option value="2">여자</option>
								</c:when>
								<c:otherwise>
									<option value="1">남자</option>
									<option value="2" selected>여자</option>
								</c:otherwise>
							</c:choose>
					</select></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="phone" value="${employee.phone }">
					</td>
				</tr>
			</table>
			<hr>
			<input type="submit" value="확인" onclick="return employeeCheck()">
			<input type="button" value="목록" 
				onclick="location.href='employee?command=employees_list'">
		</form>
	</div>
</body>
</html>