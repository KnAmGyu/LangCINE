/**
 * 어드민 페이지 화면 구성 변경 스크립트
 */

$(document).ready(function(){

 	var i=1; 
  $("#inputAdd").on("click",function() {
  	$("#starWrap").append("<div class='star-wrap'><input type='text' id='starInput" + i + "' class=' mt-3' placeholder='출연' ></div>");
    
    i++;
    
    // #starWrap 안에 div 갯수 구하기
    if($(".star-wrap").length > 1 ){
		$("#inputDelete").css("display","block");
	}

    })
    
   $("#inputDelete").on('click',function(){
	$("#starWrap .star-wrap:last").remove();
	
    if($(".star-wrap").length < 2 ){
	$("#inputDelete").css("display","none");
	}
   	
  });
});   