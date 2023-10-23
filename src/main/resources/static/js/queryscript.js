/**
 * 
 */
$(document).ready(function(){
	
	/** 회원가입  */
	$("#joinBtn").on("click",function(){
		let loginId = $("#idInput").val();
		let loginPassword = $("#passwordInput").val();
		let userName = $("#nameInput").val();
		let userEmail = $("#emailInput").val();
		let userPhoneNumber = $("#phoneNumberInput").val();
		
		if(loginId == ""){
			alert("아이디를 입력하세요");
			return ;
		}
		if(loginPassword == ""){
			alert("비밀번호를 입력하세요");
			return ;
		}
		if(userName == ""){
			alert("이름을 입력하세요");
			return ;
		}
		if(userEmail == ""){
			alert("이메일을 입력하세요");
			return ;
		}
		if(userPhoneNumber == ""){
			alert("전화번호를 입력하세요");
			return ;
		}
		$.ajax({
			type: "post"
			, url:"/user/join"
			, data:{"loginId":loginId, "userPassword":loginPassword, "userName":userName, "email":userEmail, "phoneNumber":userPhoneNumber}
			, success:function(data){
				if(data.result == "success"){
					location.href = "/user/login-view";
				}else{
					alert("회원가입 실패!!")
				}
			}
			, error:function(){
				alert("회원가입 처리 에러");
			}
		});
	});
	
	/** 로그인 */
	
	$("#loginForm").on("submit", function(e){
		
		e.preventDefault();
				
		let loginId = $("#loginIdInput").val();
		let password = $("#loginPasswordInput").val();
		
		if(loginId == ""){
			alert("아이디를 입력하세요");
			return ;
		}
		if(password == ""){
			alert("비밀번호를 입력하세요");
			return ;
		}
		
		$.ajax({
			type:"post"
			, url:"/user/login"
			, data:{"loginId":loginId,"userPassword":password}
			, success:function(data){
				if(data.result == "success"){
					location.href = "/user/join-view";
				}else{
					alert("아이디 비밀번호를 확인해 주세요");
				}
			}
			, error:function(){
				alert("로그인 과정 에러");
			}
		});

		
	});	
	
	/** 관리자 매니저 등록 */
		
	$("#managerJoinBtn").on("click",function(){
		let adminId = $("#adminIdInput").val();
		let adminName = $("#adminNameInput").val();
		let adminPassword = $("#adminPasswordInput").val();
		
		if(adminId == ""){
			alert("아이디를 입력하세요");
			return ;
		}
		if(adminName == ""){
			alert("이름을 입력하세요");
			return ;
		}
		if(adminPassword == ""){
			alert("비밀번호를 입력하세요");
			return ;
		}
		
		$.ajax({
			type: "post"
			, url:"/admin/join"
			, data:{"adminId":adminId, "managerName":adminName, "adminPassword":adminPassword}
			, success:function(data){
				if(data.result == "success"){
					location.href = "/admin/login-view";
				}else{
					alert("등록 실패!!")
				}
			}
			, error:function(){
				alert("등록 에러");
			}
		});
	});
	/** 관리자 매니저 로그인 */
		$("#loginAdminForm").on("submit", function(e){
		
		e.preventDefault();
				
		let loginAdminId = $("#loginAdminIdInput").val();
		let adminPassword = $("#loginAdminPasswordInput").val();
		
		if(loginAdminId == ""){
			alert("아이디를 입력하세요");
			return ;
		}

		if(adminPassword == ""){
			alert("비밀번호를 입력하세요");
			return ;
		}
 				
		$.ajax({
			type:"post"
			, url:"/admin/login"
			, data:{"adminId":loginAdminId,"adminPassword":adminPassword}
			, success:function(data){
				if(data.result == "success"){
					location.href = "/admin/join-view";
				}else{
					alert("관리자 아이디 비밀번호를 확인해 주세요");
				}
			}
			, error:function(){
				alert("관리자 진입 에러");
			}
		});
		
		
	});	
});