
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LangCINE관리자</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/static/css/admin_style.css" type="text/css">
</head>
<body>
	<div id=wrap>
		<c:import url="/WEB-INF/jsp/admin/include/header.jsp" />
		<div id="content-section">
			<c:import url="/WEB-INF/jsp/admin/include/left-side.jsp" />
			<div class="contents">
				<table class="input-table">
				<colgroup>
					<col style="width:20%">
					<col style="width:80%">
				</colgroup>
					<tbody>
						<tr>
							<th>영화제목</th>
							<td>
								<div>
									<input type="text" id="movieNameInput" placeholder="영화제목" >
								</div>
							</td>
						</tr>
						<tr>
							<th>썸네일이미지</th>
							<td>
								<div>
									<input type="file" id="thumbInput">
								</div>
							</td>
						</tr>
						<tr>
							<th>영화설명이미지</th>
							<td>
								<div>
									<input type="file" id="movieInfoInput">
								</div>
							</td>
						</tr>
						<tr>
							<th>비주얼이미지</th>
							<td>
								<div>
									<input type="file" id="visualInput">
								</div>
							</td>
						</tr>
						<tr>
							<th>영화배너이미지</th>
							<td>
								<div>
									<input type="file" id="bannerInput">
								</div>
							</td>
						</tr>
						<tr>
							<th>장르</th>
							<td>
								<div>
									<input type="text" id="genreInput" placeholder="영화장르" >
								</div>
							</td>
						</tr>
						<tr>
							<th>감독</th>
							<td>
								<div>
									<input type="text" id="diretorInput" placeholder="감독" >
								</div>
							</td>
						</tr>
						<tr>
							<th>출연</th>
							<td>
								<div id="starWrap">
									<div class="star-wrap">
										<input type="text" id="starInput0" placeholder="출연" >
									</div>
										
								</div>
								<div class="btn-wrap">
									<button type="button" id="inputAdd">추가</button>
										<button type="button" id="inputDelete">삭제</button>
								</div>
								
							</td>
						</tr>
						<tr>
							<th>줄거리</th>
							<td>
								<div>
									<textarea class="contents-input " row="10" id="storyInput"></textarea>
								</div>
							</td>
						</tr>
						<tr>
							<th>러닝타임</th>
							<td>
								<div>
									<input type="text" id="runningTimeInput" placeholder="러닝타임" >
								</div>
							</td>
						</tr>
						<tr>
							<th>개봉일</th>
							<td>
								<div>
									<input type="text" id="openDayInput"   placeholder="개봉일" >
								</div>
							</td>
						</tr>
					</tbody>
				</table>
				<div>
					<button type="button" id="movieSaveBtn">저장하기</button>
				</div>
			</div>
			
			
			

			
		</div>
		<c:import url="/WEB-INF/jsp/admin/include/footer.jsp" />
	</div>
	
	
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="/static/js/admin-motion.js"></script>	
<script src="/static/js/admin-script.js"></script>	
</body>
</html>