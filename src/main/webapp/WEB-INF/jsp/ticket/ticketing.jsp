<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ page import="java.util.Date" %>  
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
						<c:set var="today" value="<%=new java.util.Date()%>" />
						<c:set var="day2" value="<%=new Date(new Date().getTime() + 60*60*24*1000*1)%>"/>
						<c:set var="day3" value="<%=new Date(new Date().getTime() + 60*60*24*1000*2)%>"/>
						<c:set var="day4" value="<%=new Date(new Date().getTime() + 60*60*24*1000*3)%>"/>
						<c:set var="day5" value="<%=new Date(new Date().getTime() + 60*60*24*1000*4)%>"/>
						<c:set var="day6" value="<%=new Date(new Date().getTime() + 60*60*24*1000*5)%>"/>
						<c:set var="day7" value="<%=new Date(new Date().getTime() + 60*60*24*1000*6)%>"/>
						<c:set var="month"><fmt:formatDate value="${today}" pattern="MM" /></c:set> 
						<c:set var="date"><fmt:formatDate value="${today}" pattern="dd" /></c:set> 
						<div class="ticket-info">
							<div class="movie-name">물의나라 금의나라</div>
	
							<div id="movieDate" class="movie-date"><fmt:formatDate value="${today}" pattern="YYYY-MM-dd(E)" /></div>
						</div>
						<div class="movie-select">
							<div class="movie-id">
								<div>
									<label>
										<input type="radio" name="radiomoviePick" value="물의 나라 금의 나라">
										<span id="">물의 나라 금의 나라</span>
					         		</label>
			         		    </div>
								<div>
									<label>
										<input type="radio" name="radiomoviePick" value="물의 나라 금의 나라">
										<span id="">물의 나라 금의 나라</span>
					         		</label>
								</div>
								<div>
									<label>
										<input type="radio" name="radiomoviePick" value="물의 나라 금의 나라">
										<span id="">물의 나라 금의 나라</span>
					         		</label>
								</div>
								<div>
									<label>
										<input type="radio" name="radiomoviePick" value="물의 나라 금의 나라">
										<span id="">물의 나라 금의 나라</span>
					         		</label>
								</div>
								<div>
									<label>
										<input type="radio" name="radiomoviePick" value="물의 나라 금의 나라">
										<span id="">물의 나라 금의 나라</span>
					         		</label>
								</div>
							</div>
							<div class="theater-wrap">
							
							
								<div class="date-pick">
									<div id="currentMonth"><c:out value="${month}" /> 월</div>
									<ul>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick" value="<fmt:formatDate value="${today}" pattern="YYYY-MM-dd(E)" />" checked>
												<strong id=""><c:out value="${date}" /></strong>
												<em id="date1"><fmt:formatDate value="${today}" pattern="E" /></em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick" value="<fmt:formatDate value="${day2}" pattern="YYYY-MM-dd(E)" />">
												<strong id=""><c:out value="${date + 1}" /></strong>
												<em id="date2"><fmt:formatDate value="${day2}" pattern="E" /></em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick" value="<fmt:formatDate value="${day3}" pattern="YYYY-MM-dd(E)" />">
												<strong id="day3"><c:out value="${date + 2}" /></strong>
												<em><fmt:formatDate value="${day3}" pattern="E" /></em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick" value="<fmt:formatDate value="${day4}" pattern="YYYY-MM-dd(E)" />">
												<strong id="day4"><c:out value="${date + 3}" /></strong>
												<em><fmt:formatDate value="${day4}" pattern="E" /></em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick" value="<fmt:formatDate value="${day5}" pattern="YYYY-MM-dd(E)" />">
												<strong id="day5"><c:out value="${date + 4}" /></strong>
												<em><fmt:formatDate value="${day5}" pattern="E" /></em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick" value="<fmt:formatDate value="${day6}" pattern="YYYY-MM-dd(E)" />">
												<strong id="day6"><c:out value="${date + 5}" /></strong>
												<em><fmt:formatDate value="${day6}" pattern="E" /></em>
											</label>
										</li>
										<li class="date">
											<label>
												<input type="radio" name="radioDatePick" value="<fmt:formatDate value="${day7}" pattern="YYYY-MM-dd(E)" />">
												<strong id="day7"><c:out value="${date + 6}" /></strong>
												<em><fmt:formatDate value="${day7}" pattern="E" /></em>
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
						<div class="btn-wrap">
							<div class="btn-box">
								<button type="button">인원선택</button>
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
<script>
<%-- 	date = new Date();
	year = date.getFullYear();
	month = date.getMonth() + 1;
	day = date.getDate();
	document.getElementById("day1").innerHTML = day
	document.getElementById("day2").innerHTML = day + 1
	document.getElementById("day3").innerHTML = day + 2
	document.getElementById("day4").innerHTML = day + 3
	document.getElementById("day5").innerHTML = day + 4
	document.getElementById("day6").innerHTML = day + 5
	document.getElementById("day7").innerHTML = day + 6
	
	
	
	const toMonth = { month: 'long' };
    document.getElementById("currentMonth").innerHTML = new Date().toLocaleDateString('ko-KR', toMonth);
    const options = { weekday: 'long'};
    document.getElementById("date1").innerHTML = new Date().toLocaleDateString('ko-KR', options);--%>
    
</script>
</body>
</html>