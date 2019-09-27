<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.entity.CdDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String title=request.getParameter("title");
String author=request.getParameter("author");
String cost=request.getParameter("cost");
String type=request.getParameter("type");
session.setAttribute("I",new CdDetails(title,author,cost,type));

%>
<form action="controller.do" method="post">
region<select name="region" >< option value="unknown">unknown</option>
 <option value="lossangeles">lossangeles</option>
 <option value"uk">uk</option>
 <inpyt type=button name="submit" value="submit">
 </form>
</body>
</html>