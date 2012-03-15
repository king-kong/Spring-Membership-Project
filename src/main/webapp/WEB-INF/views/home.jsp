<%@ taglib uri="http://java.sun.com/jstl/core"  prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P> The time on the server is ${serverTime}. </P>
<p> Your country is ${country.country_name} </p>

<p><a href="/AuthorizationTest/login">Login</a></p>


</body>
</html>
