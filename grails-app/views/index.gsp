<!DOCTYPE html> 
<html> 
	<head> 
	<title>Grails Mobile App on CloudFoundry</title> 
	<meta name="viewport" content="width=device-width, initial-scale=1"> 
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.0b3/jquery.mobile-1.0b3.min.css" />
	<link rel="stylesheet" href="css/findevents.css" />
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.3.min.js"></script>
	<script type="text/javascript" src="http://code.jquery.com/mobile/1.0b3/jquery.mobile-1.0b3.min.js"></script>
	<script type="text/javascript" src="js/findevents.js"></script>
	
</head> 

<body> 
<div data-role="page" id="dashboard">

	<div data-role="header">
		<h1>Find Events</h1>
		<img id="search_btn" src="images/search_default_btn.png" class="ui-btn-right"/>
	</div><!-- /header -->

	<div data-role="content">
		<div id="search_box">	
		   <input type="text" /><button id="search_by_zip_btn" data-theme="b">Search</button>
		</div>
		
		<div id="event-list">
		</div>	
	</div><!-- /content -->
</div><!-- /page -->

</body>
</html>