<%-- 
    Document   : ajax
    Created on : 6 juil. 2016, 09:37:23
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
        <h1>AJAAAAAAAAXXXXX</h1>


        <form>
            <p>Identifiant : <input type="text" name="login"/></p>
            <p>Mot de Passe : <input type="text" name="mdp"/></p>
            <p>Nom : <input type="text" name="nom"/></p>
            <br/>
            <button type="button" onclick="myFunction()">Envoyer</button>
        </form> 

        <p id="message"></p>

        <script>
            
            
            
            
            
            var xhttp; //hors fonction pour ne pas perdre la valeur
            function myFunction() {
                xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (xhttp.readyState == 4 && xhttp.status == 200) {
                        alert(xhttp.responseText);//recupere la reponse du servlet
                    }
                }

                xhttp.open("POST", "ajax_inscription", true);
                xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

                var data = "login=" + document.getElementsByName("login")[0].value;
                data = data + "&mdp=" + document.getElementsByName("mdp")[0].value;
                data = data + "&nom=" + document.getElementsByName("nom")[0].value;
      
                xhttp.send(data);//envoi à la servlet
            }

        </script>
    </body>
</html>
