<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/yeti/bootstrap.min.css"
	integrity="undefined" crossorigin="anonymous">
<link rel="stylesheet" href="styles.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Pride Makers 2021</title>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="/"><span class="multicolortext"><strong>PrideMakers
					2021</strong></span></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarColor01" aria-controls="navbarColor01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav me-auto">
				<li class="nav-item"><a class="nav-link active" href="/">Home
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#"
					role="button" aria-haspopup="true" aria-expanded="true">Donate</a>
					<div class="dropdown-menu">
						<a class="dropdown-item"
							href="https://give.thetrevorproject.org/give/330001/#!/donation/checkout?c_src=pride2021&c_src2=headerDonate">Trevor
							Project</a> <a class="dropdown-item"
							href="https://www.thehrcfoundation.org/support">HRC
							Foundation</a> <a class="dropdown-item"
							href="https://donate.amnestyusa.org/page/54178/donate/1?ac=W21WEBDBUTTON">Amnesty
							International</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item"
							href="https://secure.givelively.org/donate/pride-foundation">Pride
							Foundation</a>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#"
					role="button" aria-haspopup="true" aria-expanded="false">Learn
						More</a>
					<div class="dropdown-menu">
						<a class="dropdown-item"
							href="https://www.washingtonpost.com/video-games/2021/03/23/lgbtq-representation-video-games/">LGBTQ+
							In Games</a> <a class="dropdown-item" href="https://anykey.org/">AnyKey</a>
						<a class="dropdown-item"
							href="https://lgbtq.unc.edu/resources/qualities-ally/">How to
							be an ally</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="https://pridefoundation.org/">Pride
							Foundation</a>
					</div></li>
				<li class="nav-item"><a class="nav-link"
					href="https://www.opensecrets.org/about/">About the API</a></li>
			</ul>
		</div>
	</div>
</nav>
</head>
<body>
	<h1>
		<a href="https://www.teamliquid.com/"> <img
			src="monolight_horiz.png" width="10%" height="10%" alt="Team Liquid">
		</a>
		<!-- 		example of how you can use the team liquid font -->
		<!-- 		<span class="teamliquidblue">Team</span> -->
		<!-- 		<span class="teamliquidwhite">Liquid</span> -->
		<span class="multicolortext"><strong>PrideMakers 2021</strong></span>
	</h1>
	<p>I wanted to be a part of this event to do what I can for this
		community. This last couple of years, I have had a lot of time for reflecting and I kept finding that I was asking what can I do to leave this world a
		better place for my son in the future.</p>

	<p>I wanted to help but didn't feel it was right for me given my
		privilege to give advice or provide a blog on the topic. What I could
		do is provide the tools and facts to allow everyone to make an
		educated decision on their political choices and their consumer
		choices. To me the first step is to just provide transparency, the
		facts, no opinion or bias added to them. My hope with this website was to begin that journey</p>

	<div style="display: flex">
		<div class="card border-warning mb-3" style="max-width: 30rem;">
			<div class="card-header">Company</div>
			<div class="card-body">
				<h4 class="card-title">What company would you like to know more
					about?</h4>
				<p class="card-text">You may be seeing your favorite company
					support pride but where is their money actually going?</p>
				<form action="companyresults" id="companysearch">
					<div class="form-group">
						<input type="text" class="form-control" name="org"
							placeholder="Company e.g. amazon" id="inputDefault">
					</div>
					<button type="submit" form="companysearch" class="btn btn-warning">Search</button>
				</form>
			</div>
		</div>

		<div class="card border-warning mb-3" style="max-width: 30rem;">
			<div class="card-header">Legislator by State</div>
			<div class="card-body">
				<h4 class="card-title">Which state's legislator are you looking
					for?</h4>
				<p class="card-text">Look up your state's legislators and find
					out their top 10 donors.</p>
				<form action="legislatorsearch" id="leginfo">
					<div class="form-group">
						<label for="exampleSelect1" class="form-label mt-4">State</label>
						<select class="form-select" id="stateSelect1" name="state"
							form=leginfo>
							<option>AL</option>
							<option>AS</option>
							<option>AZ</option>
							<option>AR</option>
							<option>CA</option>
							<option>CO</option>
							<option>CT</option>
							<option>DE</option>
							<option>DC</option>
							<option>FL</option>
							<option>GA</option>
							<option>GU</option>
							<option>HI</option>
							<option>ID</option>
							<option>IL</option>
							<option>IN</option>
							<option>IA</option>
							<option>KS</option>
							<option>KY</option>
							<option>LA</option>
							<option>ME</option>
							<option>MD</option>
							<option>MA</option>
							<option>MI</option>
							<option>MN</option>
							<option>MS</option>
							<option>MO</option>
							<option>MT</option>
							<option>NE</option>
							<option>NV</option>
							<option>NH</option>
							<option>NJ</option>
							<option>NM</option>
							<option>NY</option>
							<option>NC</option>
							<option>ND</option>
							<option>MP</option>
							<option>OH</option>
							<option>OK</option>
							<option>OR</option>
							<option>PA</option>
							<option>PR</option>
							<option>RI</option>
							<option>SC</option>
							<option>SD</option>
							<option>TN</option>
							<option>TX</option>
							<option>UT</option>
							<option>VT</option>
							<option>VA</option>
							<option>VI</option>
							<option>WA</option>
							<option>WV</option>
							<option>WI</option>
							<option>WY</option>
						</select>
					</div>
					<button type="submit" form=leginfo class="btn btn-warning">Search</button>
				</form>
			</div>
		</div>
	</div>
</body>
<footer>
<h1> <span class="teamliquidwhite">Special Thanks to</span> <span class="teamliquidgold">Team Liquid</span></h1>
<p><small><abbr title="Team Liquid">TL</abbr> and E sports have given me a place where my passion and love
		for competitive gaming are welcomed and expressed in a safe place.
		From the early days when I was commenting on Jinro's retirement to being given opportunities
		such as this to push myself to become a better person.  I appreciate the space you have given me to feel valid and I hope that everyone can find that. To join this community, come on down to <a href="https://liquidplus.com/">Liquid Plus</a>.</small></p></footer>
</html>