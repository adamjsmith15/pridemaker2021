<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company Results</title>
</head>
<body>
<h1>Organization Results</h1>
<div class="container">
		<table class="table" border=3>
			<thead>
				<tr class="table-primary">
					<td></td>
					<th scope="col">Org Name</th>
					<th scope="col">Ord ID</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ root }" var="o" varStatus="loop">
					<tr>
						<th scope="row"><a href="searchorgsummary?id=${ root[loop.index].attributes.orgid }">Search</a> </th>
						<td>${ root[loop.index].attributes.orgname }</td>
						<td>${ root[loop.index].attributes.orgid }</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
		</div>
		<br>
</div>
</body>
</html>