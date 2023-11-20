/**
 * 
 */

 $(document).ready(function(){
	 /** 관리자 상영관 영화 설정 */
	 
	 
	 $("#movieSelectForm").on("submit", function(e){	
				
				e.preventDefault();
				
				let theaterNumber = $("input[name=theater]:checked").val();
 				let movieNumber = $("select[name=movieList]").val();
 				
 				
 				
 			 	$.ajax({
 					type:"post"
 					, url:"/movie/screen"
 					, data:{"theaterNumber":theaterNumber,"movieNumber":movieNumber}
 					, success:function(data){
 						if(data.result == "success"){
 							location.href = "/admin/theater-view";
 						}else{
 							alert("여기까진 옴");
 						}
 					}
 					, error:function(){
 						alert("에러");
 					}
 				});
				
			});
	 
	 
	 
	/** 관리자 영화 등록*/
	 $("#movieSaveBtn").on("click",function(){
		 

		 let movieName = $("#movieNameInput").val();
		 let thumb = $("#thumbInput")[0];
		 let visual = $("#visualInput")[0];
		 let banner = $("#bannerInput")[0];
		 let genre = $("#genreInput").val();
		 let diretor = $("#diretorInput").val();
		 
		 
		 let movieStar = new Array();
		 for(i = 0; $(".star-wrap").length > i; i++ ){
			 movieStar.push($("#starInput"+ i).val());
		 }
		 let star = movieStar.toString();
		 

		 
 		 let story = $("#storyInput").val();
		 let runningTime = $("#runningTimeInput").val();
		 let openDay =  $.datepicker.formatDate("yy-mm-dd",$("#openDayInput").datepicker("getDate")); 
		 let exposure = $("input[name=exposure]:checked").val();
	     let screening = $("input[name=screening]:checked").val();
			

	 	 let formData = new FormData();
				formData.append("movieName", movieName);
				formData.append("thumbImage", thumb.files[0]);
				formData.append("visualImage", visual.files[0]);
				formData.append("bannerImage", banner.files[0]);
				formData.append("genre", genre);
				formData.append("director", diretor);
				formData.append("star", star);
				formData.append("story", story);
				formData.append("runningTime", runningTime);
				formData.append("openDay", openDay);
				formData.append("exposure", exposure);
				formData.append("screening", screening);
		
		$.ajax({
				type:"post"
				, url:"/movie/create"
				, data:formData
				, enctype:"multipart/form-data"  // 파일 업로드 필수 옵션
				, processData:false  // 파일 업로드 필수 옵션
				, contentType:false   // 파일 업로드 필수 옵션
				, success:function(data){
					if(data.result == "success"){
						location.href = "/admin/main-view";
					}else{
						alert("되긴함");
					}
				}
				, error:function(){
					alert("어림도없다");
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
					location.href = "/admin/main-view";
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