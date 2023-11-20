/**
 * 
 */
$(document).ready(function(){
	
	$(".like-icon").on("click",function(){
			
			let movieId = $(this).data("post-id");
			
			$.ajax({
				type:"post"
				, url:"/detail/like"
				, data:{"movieId":movieId}
				, success:function(data){
					
					if(data.result == "success"){
						location.reload();
					}else{
						alert("좋아요 실패");
					}
					
					
				}
				, error:function(){
					alert("좋아요 에러");
				}
			});
			
		});
	
	
	
	
	$('input[name="radioDatePick"]').change(function() {
		let screenDay = $("input[name=radioDatePick]:checked").val();
		
		$("#movieDate").text(screenDay);
	});
	
	
	
	
	
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
			, error:function(jqXHR){
				if(jqXHR.status == 500){
					alert(jqXHR.responseJSON.message);
				}
				
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
					history.go(-1);
					location.reload;
				}else{
					alert("아이디 비밀번호를 확인해 주세요");
				}
			}
			, error:function(){
				alert("로그인 과정 에러");
			}
		});

		
	});	
	
	
});