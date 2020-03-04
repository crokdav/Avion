<%@ page language="java" contentType="text/html; charset=ISO-8859-1;charset=uft-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="uft-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%>;</style>
<title>Insert title here</title>
</head>
<body>
<%@ include file="navbar.jsp"%>
<h1>Voici la liste de pilotes</h1>
<c:forEach items="${pilot}" var="pilote">
<h3>${pilote.nom}</h3>
<h3>${pilote.prenom}</h3>
<h3>${pilote.tel}</h3>
<br>
</c:forEach>
</body>
</html>