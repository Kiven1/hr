<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>edit</title>
<style type="text/css">
input{
	display: block;
}
</style>
</head>
<body>
	<h1>edit: ${todo.id }</h1>
	<form action="./${staff.id }/update" >
		<input type="hidden" name = "id" value = "${todo.id }">
		<div>
			<label>姓名</label><br>
			<input name = "content" value="${todo.content }" readonly="readonly">
		</div>
		<div>
			<label>电话号码</label><br>
			<input name = "time" value="${todo.time }">
		</div>
		<div>
		<label></label><br>
			<input type="submit" value="更新">
		</div>
		</form>
</body>
</html>