/**
 * 
 */
$(document).ready(function(){
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
	
	
});