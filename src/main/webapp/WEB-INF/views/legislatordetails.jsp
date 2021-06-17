<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/yeti/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>${ legdet.cand_name }</title>
</head>
<body>
<h1>${ legdet.cand_name }</h1>
<!-- TODO insert table to display candidate details with links to further donation details? or should we spell it all out here and call a bunch of apis -->

		<div class="container">
			<table class="table" border=3>
				<thead>
					<tr class="table-primary">
						<th scope="row">Something? </th>
						<th scope="col">Organization</th>
						<th scope="col">Contribution</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ contrib }" var="o" varStatus="loop">
						<tr>
							<th scope="row">< </th>
							<td>${ contrib[loop.index].attributes.org_name } </td>
							<td>${ contrib[loop.index].attributes.total }</td>
						</tr>
					</c:forEach>
				</tbody>
	
			</table>
		</div>
</body>
</html>