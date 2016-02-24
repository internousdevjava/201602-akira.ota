<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<s:form action="LoginAction">
		<s:textfield name="email" />
		<s:password name="password" />
		<s:submit type="button" />
	</s:form>
</body>
</html>