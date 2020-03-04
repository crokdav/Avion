<%@ page language="java" contentType="text/html; charset=ISO-8859-1; charset=uft-8"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="uft-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%>;</style>
<title>Nouveau Pilote</title>
</head>
<body>
<%@ include file="navbar.jsp"%>
<form action="/avion/ajoutpilote"method ="post">
<div>
<label>Nom</label>
<input type="text" name ="name" placeholder="ajoutez un nom">
</div>
<div>
<label>Prenom</label>
<input type="text" name ="prenom" placeholder="ajoutez un prenom">
</div>
<div>
<label>Telephone</label>
<input type="text" name ="tele" placeholder="ajoutez un numéro de télephone">
</div>
<input type="submit" value="soumettre">
</form>

</body>
</html>