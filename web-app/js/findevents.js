$(document).ready(function(){
    
    $("#search_btn").click(function(event){
        showSearch();
        event.preventDefault();
      });
    
    $("#search_by_zip_btn").click(function(event){
    	alert("Searching...");
    });
 });

function showSearch(){
	$("#search_box").slideToggle("slow");	
}