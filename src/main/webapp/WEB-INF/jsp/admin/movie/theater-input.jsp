
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
				<table>
					<tbody>
						<tr>
							<th>상영관 선택</th>
							<td>
								<div>
									<input type="radio" id="teater1" name="teater" value="1" checked />
				    				<label for="teater1">1관</label>
				    				<input type="radio" id="teater2" name="teater" value="2"/>
				    				<label for="teater2">2관</label>
				    				<input type="radio" id="teater3" name="teater" value="3"/>
				    				<label for="teater3">3관</label>
				    				<input type="radio" id="teater4" name="teater" value="4"/>
				    				<label for="teater4">4관</label>
				    				<input type="radio" id="teater5" name="teater" value="5"/>
				    				<label for="teater5">5관</label>
								</div>
							</td>
						</tr>
						<tr>
							<th>영화선택</th>
							<td>
								<div>
									<label for="movieNumber">영화 선택</label>
									<select name="movieList" id="movieNumber">
									    <option value="1">테스트</option>
									    <option value="2">테스트2</option>
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