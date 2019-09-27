<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<form name="success_league" id="form-1" method="get" action="add_Controller.do">
	<label for="input-1">title</label>
	<input id="input-1" name="title" placeholder="title" type="text"/>
	
<label for="input-3">year</label>
		<input id="input-3" name="year" placeholder="year" type="text"/>
		<select name="season">
		<option value="Unknown">unknown</option>
  <option value="summer">summer</option>
  <option value="winter">winter</option>
  <option value="rainy">rainy</option>
  <option value="autm">autm</option>
</select>
	<input type="submit" value="getview" id="button-1" />
</form>
 			<c:if test="${ERROR == null}">
             <jsp:include page="response.jsp"/>
             </c:if>
<c:if test="${ERROR != null}" >
        
           <c:forEach var="e" items="${ERROR}">
           ${e}
           </c:forEach>
 </c:if>
            
</body>
</html>