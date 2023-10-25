/**
 * 
 */

 $(document).ready(function(){
	 $("#movieSaveBtn").on("click",function(){
		 
		 let movieStar = new Array();
		 for(i = 0; $(".star-wrap").length > i; i++ ){
			 movieStar.push($("#starInput"+ i).val());
		 }
		 
		 console.log(movieStar); 
		 
		 
	 });
	 
	 
 });