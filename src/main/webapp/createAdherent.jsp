<%-- 
    Document   : createAdherent
    Created on : 4 mars 2022, 14:44:26
    Author     : jessi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            html,
            body * {
                box-sizing: border-box;
                font-family: 'Open Sans', sans-serif;
            }
            body{
                background-image: url('https://wallpaperaccess.com/full/803470.jpg');
                background-repeat: no-repeat;
            }
            .outterBox{
                border:1px solid #aca69f6b;
                border-radius: 5px;
                width:40%;
                text-align: justify;
                padding: 1%;
                margin-right: auto;
                margin-left: auto;
                margin-top: 8%;
                background-color: #aca69f6b;
            }
            .formBox{
                display: table-row-group;

            }
            form{
                display: table;
            }
            label{
                text-align: left;
                display: table-cell;

            }
            input{
                display: table-cell;
                width: 100%;
                margin: 1%;
            }
            button{
                display: table-caption;
                margin-left: auto;
                margin-right: auto;
                caption-side: bottom;

            }
            h1{
                text-align: center;
                font-family: monospace;
                font-weight: bold;
                font-size: 6vh;
            }
            button{
                text-decoration: none;
                padding: 2%;
                margin: 1%;
                border: 1px solid #adab7;
                border-radius: 5px;
                text-align: center;
                color: #0f211a;
                background-color: #adab76;
            }
            a{
                text-decoration: none;
                padding: 0.5%;
                border: 1px solid #adab7;
                border-radius: 5px;
                text-align: center;
                color: #0f211a;
                background-color: #adab76;


            }
            a:hover{
                background-color: #0f211a;
                color: rgb(173,171,118);
            }
            .success {
                background-color: green;
                border-radius: 10px;
                height: 70px;
                padding: 10px;
                text-align: center;
            }


            .successtext {
                color: #ffffff;
                font-size: 16px;
                font-weight: 300;
            }

        </style>
    </head>
    <body>

        <div class="outterBox">

            <h1> Nouveau Adhérent </h1>

            <br/><!-- comment -->
            <center>
                <c:if test="${message != null}">${message}<br/><br/></c:if>
                <form action="${pageContext.request.contextPath}/Ajouter-Adherent">
                    <div class="formBox">
                        <label for="code">Code</label>
                        <input type="text" placeholder="code" name="code"/>
                    </div>
                    <div  class="formBox">
                        <label for="codeClietCER">Code Client CER</label>
                        <input type="text" placeholder="Code client CER" name="codeClientCER"/><br/>         
                    </div>
                    <div  class="formBox">
                        <label for="titre">Titre</label>
                        <input type="text" placeholder="Titre" name="titre"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="nom">Nom</label>
                        <input type="text" placeholder="Nom" name="nom"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="prenom">Prenom</label>
                        <input type="text" placeholder="Prenom" name="prenom"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="adresse1">Adresse 1</label>
                        <input type="text" placeholder="Adresse 1" name="adresse1"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="adresse2">Adresse 2</label>
                        <input type="text" placeholder="Adresse 2" name="adresse2"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="codePostal">Code Postal</label>
                        <input type="number" placeholder="Code Postal" name="codePostal"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="commune">Commune</label>
                        <input type="text" placeholder="Commune" name="commune"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="code">Portable</label>
                        <input type="text" placeholder="Numero portable" name="portable"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="fixe">Fixe</label>
                        <input type="text" placeholder="Numero fixe" name="fixe"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="mail">E-mail</label>
                        <input type="text" placeholder="E-mail" name="mail"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="entreprise">Nom Entite</label>
                        <input type="text" placeholder="Nom de l'entite/ferme/societée/entreprise" name="entrepsise"/><br/>
                    </div>
                    <center>
                        <br/><!-- comment -->
                        <button   type="submit">Ajouter</button>
                    </center>
                </form>
            </center>
                     <br/><br/>
            <a href="${pageContext.request.contextPath}/Adherents">Retourner</a>
        </div>

    </body>
</html>
