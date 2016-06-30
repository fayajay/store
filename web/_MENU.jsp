<%-- 
    Document   : _MENU
    Created on : 24 juin 2016, 15:18:14
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<c:if test="${utilConnecte.login==null}">
    <a class="menu" href="connexion">Connexion</a>
</c:if>
<c:if test="${utilConnecte.login!=null}">
    <a class="menu" href="deconnexion">Déconnexion</a>
</c:if>

