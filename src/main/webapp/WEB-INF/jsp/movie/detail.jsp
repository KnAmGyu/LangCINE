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
<link rel="stylesheet" href="/static/css/style.css" type="text/css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
</head>
<body>
	<div id="wrap">
		<c:import url="/WEB-INF/jsp/include/header.jsp" />
		
		<div id="content-section">
			<div class="content-wrap">
				<div class="detail-top">
					<div class="poster-wrap">
						<img src="${infoList.thumbImage }">
					</div>
					<div class="detail-ifno">
						<div class="movie-tit">
							<strong>${infoList.movieName }</strong>
						</div>
						<div class="movie-info">
							<span>${infoList.openDay } 개봉</span>
							<span> ${infoList.runningTime }분</span>
						</div>
						<div class="like-info">
							<i class="bi bi-heart like-icon" data-post-id="${infoList.id }"></i><span>314</span>
						</div>
						<div class="story-info">
							<div class="story-box">
								${infoList.story }
							</div>
						</div>
					</div>		
				</div>
				<div class="detail-bottom">
					<ul class="detail-tab-wrap">
						<li>
						    <button type="button" id="detailTabBtn" data-tab="detailTab" class="tab-tit active"><span>상세정보</span></button>
					    </li>
						<li>
					    	<button type="button" id="reviewTabBtn" data-tab="reviewTab" class="tab-tit"><span>한줄평</span></button>
						</li>
					</ul>
					<div class="tab-content">
						<div class="detail-tab bg-gray active" id="detailTab">
							<h3>영화 정보</h3>
							<div class="info-box">
								<div class="info-con">
									<em class="tit">장르</em> <span class="con">${infoList.genre }</span>
								</div>
								<div class="info-con">
									<em class="tit">감독</em> <span class="con">${infoList.director }</span>
								</div>
								<div class="info-con">
									<em class="tit">출연</em> 
									<div class="con-wrap">
										<c:forEach var="movieInfo" items="${infoList.star }">
										<span class="con">${movieInfo }</span>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
						<div class="detail-tab bg-gray" id="reviewTab">
							<div class="review-top">
								<input type="text" class="form-control review-input" id="reiviewInput" >
								<button type="button" class="btn btn-secondary">작성</button>
							</div>
							<div class="review-bottom">
								<div class="review">
									<div>
										 <strong></strong>
									</div>
								</div>
							</div>
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
<script src="/static/js/queryscript.js"></script>
<script src="/static/js/tab-motion.js"></script>
</body>
</html>