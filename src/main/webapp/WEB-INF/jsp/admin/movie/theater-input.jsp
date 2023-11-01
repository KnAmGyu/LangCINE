
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LangCINE관리자</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<link rel="stylesheet" href="/static/css/admin_style.css" type="text/css">
</head>
<body>
	<div id=wrap>
		<c:import url="/WEB-INF/jsp/admin/include/header.jsp" />
		<div id="content-section">
			<c:import url="/WEB-INF/jsp/admin/include/left-side.jsp" />
			<div class="contents">
				<form id="movieSelectForm">
				<table class="theater-table">
				<colgroup>
					<col style="width:20%">
					<col style="width:80%">
				</colgroup>
					<tbody>
						<tr>
							<th>상영관 선택</th>
							<td>
								<div class="input-box">
									<div class="radio-input">
										<input type="radio" id="theater1" name="theater" value="1"/>
				    					<label for="theater1">1관</label>
									</div>
									<div class="radio-input">
					    				<input type="radio" id="theater2" name="theater" value="2"/>
					    				<label for="theater2">2관</label>
				    				</div>
				    				<div class="radio-input">
					    				<input type="radio" id="theater3" name="theater" value="3"/>
					    				<label for="theater3">3관</label>
				    				</div>
				    				<div class="radio-input">
					    				<input type="radio" id="theater4" name="theater" value="4"/>
					    				<label for="theater4">4관</label>
				    				</div>
				    				<div class="radio-input">
					    				<input type="radio" id="theater5" name="theater" value="5"/>
					    				<label for="theater5">5관</label>
				    				</div>
								</div>
							</td>
						</tr>
						<tr>
							<th>영화선택</th>
							<td>
								<div class="input-box">
									
									<select name="movieList" id="movieNumber">
									<c:forEach var="movie" items="${movie }" >
									    <option value="${movie.id }">${movie.movieName }</option>
									</c:forEach>    
									 </select>
								</div>
							</td>
						</tr>
					</tbody>
				</table>
				<button type="submit" class="btn btn-secondary btn-block mt-4" id="selectBtn">영화설정하기</button>
				</form>
				
				
			</div>
			
			
			

			
		</div>
		<c:import url="/WEB-INF/jsp/admin/include/footer.jsp" />
	</div>
	
	


<script src="/static/js/admin-motion.js"></script>	
<script src="/static/js/admin-script.js"></script>	



</body>
</html>