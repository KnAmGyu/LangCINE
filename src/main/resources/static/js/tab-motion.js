/**
 * 
 */

 $(document).ready(function(){
	$(".tab-tit").on("click",function(){
		var activeTab = $(this).attr('data-tab');
		$('.tab-tit').removeClass('active');
		$('.detail-tab').removeClass('active');
		$(this).addClass('active');
		$('#' + activeTab).addClass('active');
	});


});