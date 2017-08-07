<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>show</title>
<style type="text/css">
lable{
	display: block;
}
tr{
	text-align: center;
}
</style>
</head>
<body>
	<h1>显示所有数据</h1>
	<table width="60%" align="center" cellspacing="0"  border="1">
		<caption>Todo列表</caption>
		<tr>
			<th>编号</th>
			<th>内容</th>
			<th>时间</th>
			<th>操作</th>	
		</tr>
		<c:forEach items="${todos }" var = "t">
		<tr>
			<td>${t.id }</td>
			<td>${t.content }</td>
			<td>${t.time }</td>
			<td><a href="./${t.id }/edit" method="post">编辑</a>
				<form action="./${t.id }/delete">
				<input type="submit" value="删除">
			</form>
			</td>
			
		</tr>
		</c:forEach>
	</table>
	<form action="./add">
		<div>
			<label>编号：</label>
			<input name = "id">
		</div>
		<div>
			<label>内容：</label>
			<input name = "content">
		</div>
		<div>
			<label>时间：</label>
			<input name = "time">
		</div>
		<div>
			<label></label>
			<input type="submit" value="创建">
		</div>
	</form>
</body>
</html>