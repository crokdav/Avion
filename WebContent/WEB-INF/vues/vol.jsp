<%@ page language="java" contentType="text/html; charset=ISO-8859-1; charset=uft-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="uft-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%>;</style>
<title>Nouveau Vol</title>
</head>
<body>
<%@ include file="navbar.jsp"%>
<form action="/avion/ajoutvol"method ="post">
<div>
<label>Date</label>
<input type="date" name ="date" placeholder="ajoutez une date">
</div>
<div>
<label>Pilote</label>
<select name="idPilote">
<c:forEach items="${listep}" var="pilote" >
<option value="${pilote.idPilote}">${pilote.nom}</option>

</c:forEach>
</select>
</div>

<input type="submit" value="soumettre">
</form>

</body>
</html>