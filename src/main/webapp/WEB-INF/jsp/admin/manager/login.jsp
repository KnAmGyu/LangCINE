<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/static/css/admin_style.css" type="text/css">
</head>
<body>
	<div id="wrap">
		<h1>LangCINE 관리자 페이지</h1>
		<div class="content d-flex justify-content-center">
			
			<div class="input-box my-5">
				<form id="loginAdminForm">
					<div class="input-form">
						<input type="text" id="loginAdminIdInput" class="form-control mt-5" placeholder="아이디를 입력해주세요." class="">
						<input type="password" id="loginAdminPasswordInput" class="form-control mt-5" placeholder="비밀번호를 입력해주세요." class="">
					</div>
					<div class="btn-form">
						<button type="submit" class="btn btn-secondary btn-block mt-2" id="loginAdminBtn">로그인</button>
					</div>
				</form>
			</div>
		</div>		
	</div>
	

<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<script src="/static/js/admin-script.js"></script>
</body>
</html>