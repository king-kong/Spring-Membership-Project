<%@ taglib uri="http://java.sun.com/jstl/core"  prefix="c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello <security:authentication property="principal.username" />!  
</h1>

<P> The time on the server is ${serverTime}. </P>
<p> Your country is ${country.country_name} </p>

<a href="/AuthorizationTest/static/j_spring_security_logout">logout</a>

</body>
</html>
