<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<body>
	<h2>Hello World!</h2>
	<form action="upload" method="post" enctype="multipart/form-data">
	<input type="file" name="pictureFile" />
	<input type="submit" value="upload"/>
	</form>
	<img style="height: 200px;width: 200px;" src="http://localhost:8080/pic/${url}"/>
</body>
</html>
