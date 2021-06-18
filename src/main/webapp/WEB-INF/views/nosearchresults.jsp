<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/yeti/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
<link rel="stylesheet" href="styles.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>No Search Results</title>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="/"><span class="multicolortext"><strong>PrideMakers 2021</strong></span></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarColor01" aria-controls="navbarColor01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>	

		<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav me-auto">
				<li class="nav-item"><a class="nav-link active" href="/">Home
				</a></li>
				<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="true">Donate</a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="https://give.thetrevorproject.org/give/330001/#!/donation/checkout?c_src=pride2021&c_src2=headerDonate">Trevor Project</a> 
						<a class="dropdown-item" href="https://www.thehrcfoundation.org/support">HRC Foundation</a> 
						<a class="dropdown-item" href="https://donate.amnestyusa.org/page/54178/donate/1?ac=W21WEBDBUTTON">Amnesty International</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="https://secure.givelively.org/donate/pride-foundation">Pride Foundation</a>
					</div>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#"
					role="button" aria-haspopup="true" aria-expanded="false">Learn More</a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="https://www.washingtonpost.com/video-games/2021/03/23/lgbtq-representation-video-games/">LGBTQ+ In Games</a> 
						<a class="dropdown-item" href="https://anykey.org/">AnyKey</a> 
						<a class="dropdown-item" href="https://lgbtq.unc.edu/resources/qualities-ally/">How to be an ally</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="https://pridefoundation.org/">Pride Foundation</a>
					</div></li>
				<li class="nav-item"><a class="nav-link" href="https://www.opensecrets.org/about/">About the API</a></li>
			</ul>
		</div>
	</div>
</nav>
<body>
<h1>No Results for ${ search }</h1>
	<p>
		<span class="multicolortext"><a href="/">Try Again</a></span> 
	</p>

</body>
</html>