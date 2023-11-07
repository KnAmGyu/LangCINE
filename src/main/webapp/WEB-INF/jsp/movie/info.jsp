<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LangCINE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css" />
<link rel="stylesheet" href="/static/css/style.css" type="text/css">
<link rel="stylesheet" href="/static/css/swiper_style.css" type="text/css">
</head>
<body>
	<div id="wrap">
		<c:import url="/WEB-INF/jsp/include/header.jsp" />
		
		<div id="content-section">
			<div class="swiper mySwiper">
				    <div class="swiper-wrapper">
				    <c:forEach var="movie" items="${movie }"  >
				      <div class="swiper-slide"><img src="${movie.bannerImage }"></div>
			      	</c:forEach>
				    </div>
				    <div class="swiper-button-next"></div>
				    <div class="swiper-button-prev"></div>
				    <div class="swiper-pagination"></div>
				</div>
				<div class="thumb-wrap">
				<div class="info-wrap" >
					<div class="info-part">
						<h3>현재 상영작</h3>
				 	    <div class="info-thumb">
				 	    	<c:forEach var="movie" items="${movie }"  >
					        <div class="item-wrap">
					        	<div class="top-info">
					        		<span class="thumb-info">
					        			<img src="${movie.thumbImage }">	
					        		</span>
					        		<div class="over-box">
						        		<div class="inner">
						        			<a href="#" class="btn-thumb">예매하기</a>
					        				<a href="#" class="btn-thumb">영화정보</a>
						        		</div>
					        			
					        		</div>
					        	</div>
					        	<div class="bottom-info">
					        		<strong>
					        			${fn:substring(movie.movieName, 0 ,8) }
						        		<c:if test="${(fn:length(movie.movieName) ) gt 12 }">
											...
										</c:if>
					        		</strong>
					        		<span>${movie.runningTime } 분</span>
					        	</div>
				        	</div>
				        	</c:forEach>
				        </div>
			    	</div>
			    	
			    	<div class="info-part">
						<h3>상영 예정작</h3>
				 	    <div class="info-thumb">
				 	    	<c:forEach var="movie" items="${movie }"  >
					        <div class="item-wrap">
					        	<div class="top-info">
					        		<span class="thumb-info">
					        			<img src="${movie.thumbImage }">	
					        		</span>
					        		<div class="over-box">
						        		<div class="inner">
						        			<a href="#" class="btn-thumb">예매하기</a>
					        				<a href="#" class="btn-thumb">영화정보</a>
						        		</div>
					        			
					        		</div>
					        	</div>
					        	<div class="bottom-info">
					        		<strong>
					        			${fn:substring(movie.movieName, 0 ,8) }
						        		<c:if test="${(fn:length(movie.movieName) ) gt 12 }">
											...
										</c:if>
					        		</strong>
					        		<span>${movie.runningTime } 분</span>
					        	</div>
				        	</div>
				        	</c:forEach>
				        </div>
			    	</div>
			    	
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