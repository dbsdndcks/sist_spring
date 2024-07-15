<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>
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
		$("#btnSingle").click(function(){
			$("#frmGet")[0].action="single_param.do";
			$("#frmGet").submit();
		})
		
		$("#btnSingle2").click(function(){
			$("#frmPost")[0].action="single_param.do";
			$("#frmPost").submit();
		})
		
		$("#btnVO").click(function(){
			$("#frmGet")[0].action="../day0605/vo_param.do";
			$("#frmGet").submit();
		})
		
		$("#btnVO2").click(function(){
			$("#frmPost")[0].action="../day0605/post_vo_param.do";
			$("#frmPost").submit();
		})
		
		$("#btnHsr").click(function(){
			$("#frmGet")[0].action="../day0605/hsr_param.do";
			$("#frmGet").submit();
		})
		
		$("#btnHsr2").click(function(){
			$("#frmPost")[0].action="../day0605/post_hsr_param.do";
			$("#frmPost").submit();
		})
		
		$("#btnRp").click(function(){
			$("#frmGet")[0].action="../day0605/btn_rp.do";
			$("#frmGet").submit();
		})
		
	
	}); //ready
</script>
</head>
<body>
<div>
<h2>GET방식의 요청</h2>
<form id="frmGet" method="get">
<label>이름</label>
<input type="text" name="name" value="박시현"/><br/>
<label>나이</label>
<input type="text" name="age" value="25"/><br/>
<label>이메일</label>
<input type="text" name="email" value="test@test.com"/><br/>

<input type="button" id="btnSingle"	value="단일형" class="btn btn-info btn-sm"/><br/>
<input type="button" id="btnHsr"	value="HttpServletRequest" class="btn btn-info btn-sm"/><br/>
<input type="button" id="btnVO"	value="VO" class="btn btn-info btn-sm"/><br/>
<input type="button" id="btnRp"	value="RequestParam사용" class="btn btn-info btn-sm"/><br/>
</form>
<br/>
<h2>POST방식의 요청</h2>
<form id="frmPost" method="post">
<label>이름</label>
<input type="text" name="name" value="띵화"/><br/>
<label>나이</label>
<input type="text" name="age" value="17"/><br/>
<label>이메일</label>
<input type="text" name="email" value="test@test.com"/><br/>

<input type="button" id="btnSingle2"	value="단일형" class="btn btn-info btn-sm"/><br/>
<input type="button" id="btnHsr2"	value="HttpServletRequest" class="btn btn-info btn-sm"/><br/>
<input type="button" id="btnVO2"	value="VO" class="btn btn-info btn-sm"/><br/>

</form>
</div>
</body>
</html>