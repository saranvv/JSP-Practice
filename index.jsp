<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="MVCServlet" method="post">
<input type="number" name="num1" ><br><br><br>
<input type="submit" value="submit">
</form>
<%
HttpSession sc=request.getSession();
String str=(String)sc.getAttribute("value");
%>
<%=
str
%>
</body>
</html>