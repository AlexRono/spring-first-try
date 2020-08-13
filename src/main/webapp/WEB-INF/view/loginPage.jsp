<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head></head>

<body>

<h3>The login page</h3>

<form:form
action="${pageContext.request.contextPath}/authTheUser"
method="POST">
    <p>
        User name: <input type="text" name ="username"/>
    </p>

    <p>
        Password: <input type="password" name ="password"/>
    </p>

    <input type="submit" name ="Login"/>

</form:form>


</body>


</html>