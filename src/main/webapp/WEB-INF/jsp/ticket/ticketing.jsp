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
			<div class="ticket-wrap">
				<div class="ticket-box">
					<ul class="process-wrap">
						<li><strong>01<br>영화선택</strong></li>
						<li><strong>02<br>인원/좌석</strong></li>
						<li><strong>03<br>결제</strong></li>
						<li><strong>04<br>결제완료</strong></li>
					</ul>
					<div class="select-movie">
						<div class="theater-name">
							LangCINE본점
						</div>
						<div class="ticket-info">
							<div class="movie-name">물의나라 금의나라</div>
							<div class="movie-date">2023-11-11(토)</div>
						</div>
						<div class="movie-select">
							<div class="movie-id">
								<div><button type="button">물의 나라 금의 나라</button></div>
								<div><button type="button">테스트용</button></div>
								<div><button type="button">테스트용1</button></div>
								<div><button type="button">테스트용2</button></div>
								<div><button type="button">테스트용3</button></div>
							</div>
							<div class="theater-wrap">
								<div class="date-pick">
									<div class="current-month">11 월</div>
									<ul>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick" checked>
												<strong>11</strong>
												<em>토</em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick">
												<strong>12</strong>
												<em>일</em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick">
												<strong>13</strong>
												<em>월</em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick">
												<strong>14</strong>
												<em>화</em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick">
												<strong>15</strong>
												<em>수</em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick">
												<strong>16</strong>
												<em>목</em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick">
												<strong>17</strong>
												<em>금</em>
											</label>
										</li>
									</ul>
								</div>
								<div class="theater-id">
									<button type="button" class="movie-box">
										<span>09 : 00</span>
										<span>1관</span>
									</button>
									<button type="button" class="movie-box">
										<span>09 : 00</span>
										<span>1관</span>
									</button>
									<button type="button" class="movie-box">
										<span>09 : 00</span>
										<span>1관</span>
									</button>
									<button type="button" class="movie-box">
										<span>09 : 00</span>
										<span>1관</span>
									</button>
									<button type="button" class="movie-box">
										<span>09 : 00</span>
										<span>1관</span>
									</button>
									<button type="button" class="movie-box">
										<span>09 : 00</span>
										<span>1관</span>
									</button>
								</div>	
							</div>
						</div>
					</div>
					<div class="headcount">
						
					</div>
					<div class="payment">
						
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