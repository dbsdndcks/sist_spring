<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
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
<!--JQUERY CDN 끝-->
<style type="text/css">
	
</style>
<!-- 개발버전, 도움되는 콘솔 경고를 포함. -->
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>

<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			printHello();
		})

		function printHello(){
			//vue 에서 사용할 데이터 생성
			var model = { name : "윤웅찬" , msg:"오늘은 수요일 입니다."};

			new Vue({
				el: "#app",
				data : model

			});
		}
	
	}); //ready
</script>
</head>
<body>
<div id="app">
	<input type="button" value="클릭" id="btn"/>
	안녕하세요 ? {{ name }}
	메시지 {{msg}}
</div>
</body>
</html>