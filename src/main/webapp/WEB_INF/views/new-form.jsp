<%--
  Created by IntelliJ IDEA.
  User: sung_woo
  Date: 2022/03/14
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<!-- 상대경로 사용, [현재 URL이 속한 계층 경로 + /save.. /로 시작하지 않는다면 상대경로다. 맨 뒤에 것만 바꿔줌] -->
<form action="save" method="post">
  username: <input type="text" name="username" />
  age: <input type="text" name="age" />
  <button type="submit">전송</button>
  <p> 여기 맞아요 </p>
</form>
</body>
</html>