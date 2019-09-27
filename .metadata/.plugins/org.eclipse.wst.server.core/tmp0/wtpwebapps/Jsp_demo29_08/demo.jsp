<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head><title>Hello</title></head>
    <body bgcolor="white">
       
        <h2>Hello, my name is Duke. What's yours?</h2>
        <form method="get">
            <input type="text" name="name" size="25">
            <p></p>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </form>

        <c:if test="${fn:length(param.name) > 0}" >
        
           
            <jsp:include page="response.jsp"/>
            
            
        </c:if>
    </body>
</html>