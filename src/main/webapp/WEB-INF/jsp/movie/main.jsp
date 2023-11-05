<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LangCINE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css" />
<link rel="stylesheet" href="/static/css/style.css" type="text/css">\
<link rel="stylesheet" href="/static/css/swiper_style.css" type="text/css">
</head>
<body>
	<div id="wrap">
		<c:import url="/WEB-INF/jsp/include/header.jsp" />
		
		<div id="content-section">
			<div class="swiper mySwiper">
			    <div class="swiper-wrapper">
			      <div class="swiper-slide">Slide 1</div>
			      <div class="swiper-slide 2">Slide 2</div>
			      <div class="swiper-slide 3">Slide 3</div>
			      <div class="swiper-slide 4">Slide 4</div>
			      <div class="swiper-slide 5">Slide 5</div>
			    </div>
			    <div class="swiper-button-next"></div>
			    <div class="swiper-button-prev"></div>
			    <div class="swiper-pagination"></div>
			</div>
			<div class="thumb-wrap">
				<div id="thumbSwiper" class="swiper" >
			 	    <div class="swiper-wrapper">
				        <div class="swiper-slide">Slide 1</div>
				        <div class="swiper-slide">Slide 2</div>
				        <div class="swiper-slide">Slide 3</div>
				        <div class="swiper-slide">Slide 4</div>
				        <div class="swiper-slide">Slide 5</div>
				        <div class="swiper-slide">Slide 6</div>
				        <div class="swiper-slide">Slide 7</div>
			        </div>
			    </div>
			</div>	
		<c:import url="/WEB-INF/jsp/include/footer.jsp" />
	</div>



<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>
<script src="/static/js/queryscript.js"></script>
<script src="/static/js/motion.js"></script>
</body>
</html>