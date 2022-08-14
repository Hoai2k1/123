<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="/ctrl/ok" method="post">
 <button>OK 1</button>
 <button formmethod="get">OK 2</button>
 <button formaction="/ctrl/ok?x">OK 3</button>
 </form>
 <div>Kết quả: ${kq}</div>
</body>
</html>