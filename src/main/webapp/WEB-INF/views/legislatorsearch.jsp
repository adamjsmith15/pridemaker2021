<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Legislator Search</title>
</head>
<body>
		<div class="container">
			<table class="table" border=3>
				<thead>
					<tr class="table-primary">
						<td></td>
						<th scope="col">Legislator</th>
						<th scope="col">Party</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ legislator }" var="o" varStatus="loop">
						<tr>
							<th scope="row"><a href="getlegislatordetails?id=${ legislator[loop.index].attributes.cid }">Search</a> </th>
							<td>${ legislator[loop.index].attributes.firstlast } </td>
							<td>${ legislator[loop.index].attributes.party }</td>
						</tr>
					</c:forEach>
				</tbody>
	
			</table>
		</div>
</body>
</html>