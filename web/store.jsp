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
            <a class="menu" href="ajouterArticle">Ajouter Article</a>
            <a class="menu" href="listeArticle">Modifier Stock</a>
            <a class="menu" href="panier">Panier</a>
        </div>
        <div class="contenu">
            <table>
                <tr>
                    <th>ARTICLE</th>
                    <th>PRIX</th>
                    <th>STOCK</th>
                    <th></th>
                </tr>
                <c:forEach items="${article}" var="a">
                    <tr>
                        <td>${a.nom}</td>
                        <td>${a.prix}€</td>
                        <td>${a.stock}</td>
                    <form method="POST">
                        <td><input type="hidden" name="id" value="${a.id}"/><input type="number" name="ajouterPanier"/><input type="submit" value="Ajouter au Panier"</p></td>
                    </form>
                    </tr>
                </c:forEach> 
            </table>  
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>

    </body>
</html>
