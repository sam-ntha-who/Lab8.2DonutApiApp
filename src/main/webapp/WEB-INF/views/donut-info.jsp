<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Donut Info</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<h1>${donut.name} Donut</h1>
<!-- only shows photo if photo exists -->
<c:if test="${not empty donut.photo}">
<!-- hover for attribution -->
<img src="${donut.photo}" title="${donut.photo_attribution}" alt="Photo of a ${donut.name} Donut" width="300" height="300">
</c:if>
<p>Calories: ${donut.calories}</p>
<p>Extras</p>
<ul>
<c:forEach var="extra" items="${donut.extras}">
<li>${extra}</li>
</c:forEach>
</ul>
<a href="/">Back</a>
</body>
</html>