<!DOCTYPE html>
<html>


<head>
<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png">
<link rel="stylesheet" type="text/css"          

	href="${pageContext.request.contextPath}/resources/css/my-test.css">

<script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>

</head>

<body>

Hello World of Spring!

<br><br>

Student name: ${param.studentName}

<br><br>

The message: ${message}

</body>

</html>