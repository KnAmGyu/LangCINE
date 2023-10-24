
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
			<div class="input-box">
			
			</div>
			<table class="input-table">
				<tbody>
					<tr>
						<th>영화제목<th>
						<td>
							<div>
								<input type="text" id="movieNameInput" class=" mt-3" placeholder="영화제목" >
							</div>
						</td>
					</tr>
					<tr>
						<th>썸네일이미지<th>
						<td>
							<div>
								<input type="file" id="thumbInput" class=" mt-3">
							</div>
						</td>
					</tr>
					<tr>
						<th>영화설명이미지<th>
						<td>
							<div>
								<input type="file" id="movieInfoInput" class=" mt-3">
							</div>
						</td>
					</tr>
					<tr>
						<th>비주얼이미지<th>
						<td>
							<div>
								<input type="file" id="visualInput" class=" mt-3">
							</div>
						</td>
					</tr>
					<tr>
						<th>영화배너이미지<th>
						<td>
							<div>
								<input type="file" id="bannerInput" class=" mt-3">
							</div>
						</td>
					</tr>
					<tr>
						<th>장르<th>
						<td>
							<div>
								<input type="text" id="genreInput" class=" mt-3" placeholder="영화장르" >
							</div>
						</td>
					</tr>
					<tr>
						<th>감독<th>
						<td>
							<div>
								<input type="text" id="diretorInput" class=" mt-3" placeholder="감독" >
							</div>
						</td>
					</tr>
					<tr>
						<th>출연<th>
						<td>
							<div>
								<input type="text" id="starInput" class=" mt-3" placeholder="출연" >
								<input type="text" id="starInput" class=" mt-3" placeholder="출연" >
								<input type="text" id="starInput" class=" mt-3" placeholder="출연" >
							</div>
						</td>
					</tr>
					<tr>
						<th>줄거리<th>
						<td>
							<div>
								<textarea class="contents-input  mt-3" row="10" id="storyInput"></textarea>
							</div>
						</td>
					</tr>
					<tr>
						<th>러닝타임<th>
						<td>
							<div>
								<input type="text" id="runningTimeInput" class=" mt-3" placeholder="러닝타임" >
							</div>
						</td>
					</tr>
					<tr>
						<th>개봉일<th>
						<td>
							<div>
								<input type="text" id="openDayInput" class=" mt-3" placeholder="개봉일" >
							</div>
						</td>
					</tr>
				</tbody>
			</table>
			<div>
				<button type="button" id="movieSaveBtn">저장하기</button>
			</div>
			

			
		</div>
		<c:import url="/WEB-INF/jsp/admin/include/footer.jsp" />
	</div>
	
	
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
</body>
</html>