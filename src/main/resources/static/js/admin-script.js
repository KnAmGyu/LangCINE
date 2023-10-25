/**
 * 
 */

 $(document).ready(function(){
	 $("#movieSaveBtn").on("click",function(){
		 
		 let movieName = $("#movieNameInput").val();
		 let thumb = $("thumbInput")[0];
		 let movieInfo = $("movieInfoInput")[0];
		 let visual = $("visualInput")[0];
		 let banner = $("bannerInput")[0];
		 let genre = $("#genreInput").val();
		 let diretor = $("#diretorInput").val();
		 
		 let movieStar = new Array();
		 for(i = 0; $(".star-wrap").length > i; i++ ){
			 movieStar.push($("#starInput"+ i).val());
		 }
		 let story = $("#storyInput").val();
		 let runningTime = $("#runningTimeInput").val();
		 let openDay =  $.datepicker.formatDate("yy-mm-dd",$("#openDayInput").datepicker("getDate")); 
		 
		 console.log(thumb);

			

		 
	 	 let formData = new FormData();
				formData.append("movieName", movieName);
				formData.append("thumbImage", thumb.files[0]);
				formData.append("movieInfoImage", movieInfo.files[0]);
				formData.append("visualImage", visual.files[0]);
				formData.append("bannerImage", banner.files[0]);
				formData.append("genre", genre);
				formData.append("diretor", diretor);
				formData.append("star", movieStar);
				formData.append("story", story);
				formData.append("runningTime", runningTime);
				formData.append("openDay", openDay);
		
		$.ajax({
				type:"post"
				, url:"/admin/create"
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
	 
	 
 });