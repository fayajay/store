<%-- 
    Document   : home
    Created on : 29 juin 2016, 15:30:21
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_STYLESHEET.jsp"/>
    </head>
    <body>
        <div class="titre">
            <h1>The HEAVEN's Store</h1>
        </div>
        <div class="menu">  
            <c:choose>
                <c:when test="${utilConnecte.login==null}">
                    <a class="menu" href="connexion">Connexion</a>
                </c:when>
                <c:otherwise>
                    <a class="menu" href="deconnexion">Déconnexion</a>
                </c:otherwise>
            </c:choose>

            <a class="menu" href="inscription">Inscription</a>
        </div>
        <div class="contenu">
            Bonjour     
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>

    </body>
</html>

