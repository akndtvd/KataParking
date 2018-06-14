<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Utilisateurs</title>
        <link href="<c:url value='/static/css/w3.css' />"  rel="stylesheet"></link>
        <link href="<c:url value='/static/css/animate.css' />"  rel="stylesheet"></link>
        <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>	
        <script src="<c:url value='/static/js/jquery-3.3.1.js' />"></script>
		<script>
			$(document).ready(function(){
			});	
		</script>
	</head>
	<body>
		<div class="w3-container" >
			<div class="w3-cell-row" >
				<div class="w3-container w3-blue-grey w3-cell" style="width:20%;text-align:center;">
					<img src="<c:url value='/static/img/logo-wemacity.png' />" class="w3-round-small" alt="Logo" 
					style="border: 1px solid #ddd;width:50%;height: auto;">			
				</div>
				<div class="w3-container w3-black w3-cell" >
					<div class="w3-panel w3-white">
  						<h1 class="w3-text-blue w3-opacity" style="text-shadow:2px 2px 0 cyan">
  							<b>Wemacity</b>
  						</h1>
					</div>
				</div>
			</div>
		</div>
		<div class="w3-container" >
			<div class="w3-cell-row" >
				<div class="w3-container w3-white w3-cell" style="width:50%;height:600px;" >
					<div class="w3-container w3-blue">
						<h2>Parking de Paris</h2>
					</div>	
					<div class="w3-container" style="width:50%">
						<form:form class="w3-card-4" modelAttribute="parking">					
							<p>
								<input id="arrdt" class="w3-input" type="text" value="${parking.arrdt}" readonly>
								<label>Arrondissement</label>
							</p>
							<p></p>
						</form:form>
					</div>
					<table class="w3-table-all">
						<thead>
							<tr class="w3-black">
								<th>PARKINGS</th>
								<th>ACTION</th>
							</tr>
						</thead>	
						<c:forEach items="${parkingsArrdt}" var="parking">
            				<tr>
            					<td>${parking}</td>
            					<td>
									<a href = "<c:url value="/afficher"/>">
            							<button class="w3-button w3-teal"><span>&nbsp;Sélectionner</span></button>
            						</a>
            					</td>
				            </tr>
        				</c:forEach>    					
  					</table>
				</div>
				<div class="w3-container w3-sand w3-cell" style="height:600px;">
					<div class="w3-container">
						<div class="w3-container w3-green">
							<h3>${parkingChercher.NOM_PARC}</h3>
						</div>	
						<p><label>${parkingChercher.ADRESS_SSC}</label></p>
						<p><label>Paris &nbsp;${parkingChercher.Arrdt}</label></p>
						<hr>
						<p><label>${parkingChercher.SITE_DELEG}</label></p>
						<p><label>${parkingChercher.TEL}</label></p>						
					</div>
					<div class="w3-container">
						<iframe frameborder="0"
							style="width: 100%; height: 100%; border: margin: 0px;"
							id="filterIFrame" name="filterIFrame" scrolling="yes"
							src="${urlMap}">
						</iframe>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
