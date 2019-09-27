<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cd details</title>
</head>
<body>
<form action="cd.jsp" method="post">
title<input type="text" name="title"><br/>
author<input type="text" name="author"><br/>
cost<input type="text" name="cost"><br/>
 type <select name="type" >< option value="unknown">unknown</option>
 <option value="specific">specific</option>
 <option value"normal>normal</option>
 
 </select> 
<input type="submit">
</form>
</body>
</html>