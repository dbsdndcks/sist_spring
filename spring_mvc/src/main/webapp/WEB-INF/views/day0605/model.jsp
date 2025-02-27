<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="Controller에서 model을 통해 넘겨준 값 받기"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="http://stu18.sist.co.kr/spring_mvc/common/favicon.ico">
<!-- bootstrap 시작 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!-- bootstrap 끝 -->
<!--sist스타일시트 시작-->
<link rel="stylesheet" href="http://stu18.sist.co.kr/spring_mvc/common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://stu18.sist.co.kr/spring_mbv/common/css/board.css" type="text/css" media="all" />
<!--sist스타일시트 끝-->
<!-- JQUERY CDN 시작-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--JQUERY CDN 끝-->
<style type="text/css">
	
</style>

<script type="text/javascript">
	$(function(){
		
	
	}); //ready
</script>
</head>
<body>
<div>
<h2>Model에 설정된 값</h2>
	requestScope :<c:out value="${ requestScope.id }"/><br>
	sessionScope :<c:out value="${ sessionScope.id }"/>
	<ul>
		<c:if test="${ empty names }">
		<li>검색된 이름이 없습니다.</li>
		</c:if>
		<c:forEach var="name" items="${ names }" varStatus="i">
		<li><c:out value="${ i.count }.${ name }"/></li>
		</c:forEach>
	</ul>
	<a href="http://localhost/spring_mvc/index.html">메인</a>
</div>
</body>
</html>