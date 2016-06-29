<%-- 
    Document   : home
    Created on : 29 juin 2016, 15:30:21
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <div class="menu">
            
            <!-- méthode 1-->
            <c:if test="${utilConnecte.identifiant==null}">
                <a class="menu" href="connexion">Connexion</a>
            </c:if>
            <c:if test="${utilConnecte.identifiant!=null}">
                <a href="deconnexion">Déconnexion</a>
            </c:if>

            <!-- méthode 2-->   
            <c:choose>
                <c:when test="${utilConnecte.identifiant==null}">
                    <a href="connexion">Connexion</a>
                </c:when>
                <c:otherwise>
                    <a href="deconnexion">Déconnexion</a>
                </c:otherwise>
            </c:choose>
                    
            <a class="menu" href="inscription">Inscription</a>
        </div>
    </body>
</html>
