$(document).ready(function(){
    
    $("#search_btn").click(function(event){
        showSearch();
        event.preventDefault();
      });
    
    $("#search_by_zip_btn").click(function(event){
    	//alert("Searching...");
    	$.ajax({url: 'findEvents/findByZip', data:'zipCode=55123', success: function(data){ $("#event-list").html(data);}})
    });
 });

function showSearch(){
	$("#search_box").slideToggle("slow");	
}