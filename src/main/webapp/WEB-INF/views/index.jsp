<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pride Makers 2021</title>
</head>
<body>
	<h1>PrideMakers Site</h1>
	<div class="jumbotron">
		<p>What company would you like to know more about?</p>
			<form action="companyresults">
			Company: <input type="text" name="org" required>
			<input type="submit" class="btn btn-primary" value="Go">
		</form>
	</div>
	
	<div class="jumbotron">
		<p>Which state's legislator are you looking for?</p>
			<form action="legislatorsearch">
			State: <input type="text" name="legislator" required>
			<input type="submit" class="btn btn-primary" value="Go">
		</form>
	</div>

</body>
</html>