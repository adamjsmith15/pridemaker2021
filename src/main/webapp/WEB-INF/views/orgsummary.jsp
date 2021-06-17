<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/yeti/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
<meta charset="ISO-8859-1">

<title>Organization Summary</title>
</head>
<body>
<h1>${ summary.orgname }</h1>
	<div class="container">
		<table class="table" border=3>
			<thead>
				<tr class="table-primary">
					<td></td>
					<th scope="col">To Dems</th>
					<th scope="col">To Rep</th>
					<th scope="col">Lobbying</th>
					<th scope="col">Gave to Candidates</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row"> Something </th>
					<td>${ summary.dems }</td>
					<td>${ summary.repubs }</td>
					<td>${ summary.lobbying }</td>
					<td>${ summary.gave_to_cand }</td>
				</tr>
			</tbody>

		</table>
	</div>
</body>
</html>