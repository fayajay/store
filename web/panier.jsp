<%-- 
    Document   : _TEMPLATES
    Created on : 24 juin 2016, 14:51:47
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>QUIZZ</title>
        <c:import url="_STYLESHEET.jsp"/>
    </head>
    <body>
        <div class="titre">
            <c:import url="_TITRE.jsp"/>
        </div>
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        <div class="contenu">
            <h2>PANIER</h2>  
            
            <c:forEach items="${article}" var="a">
                ${a.nom}  ${a.prix} ${a.stock}
                
            </c:forEach>
            
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
        
    </body>
</html>
