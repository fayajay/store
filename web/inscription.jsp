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
        <h2 class="menu">Inscription</h2>
        <div class="contenu">
            <form method="POST">
                <p>Identifiant : <input type="text" name="login"/></p>
                <p>Mot de Passe : <input type="password" name="mdp"/></p>
                <p>Adresse : <input type="text" name="adresse"/></p>
                <select name="select">
                    <option value="ADMIN">ADMIN</option> 
                    <option value="CLIENT" selected>CLIENT</option>
                    <option value="EQUIPEEXP">EQUIPEEXP</option>
                </select>
                <br/>
                <input type="submit" value="connexion"/>
                <input type="reset" value="annuler"/>
            </form> 
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>

    </body>
</html>
