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
				<table class="theater-list">
				<colgroup>
					<col style="width:20%">
					<col style="width:80%">
					
				</colgroup>
					<thead>
						<tr>
							<th>상영관</th>
							<th>영화제목</th>
							
						</tr>
					</thead>
					<tbody>
					<c:forEach var="admin" items="${admin }" >
						<tr>
							<th>${admin.theaterNumber }</th>
							<td>${admin.movieName }</td>
						</tr>
					</c:forEach>	
					</tbody>
				</table>
				
			</div>
		</div>
		<c:import url="/WEB-INF/jsp/admin/include/footer.jsp" />
	</div>
	
	
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
</body>
</html>