<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>图片上传</title>
</head>
<body>
	<form action="UpLoadPic" method="post" ENCTYPE="multipart/form-data">
		<!-- <input type="text" name="name" />
		<input type="text" name="nicname" /> -->
		<INPUT type="FILE" name="picpath" size="38"/>
		<input type="submit" value="上传"/>
	</form>
</body>
</html>