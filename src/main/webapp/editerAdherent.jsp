<%-- 
    Document   : editerAdherent
    Created on : 15 mars 2022, 13:50:58
    Author     : jessi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editer Adherent</title>
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
                margin-top: 5%;
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

            <h1> Editer Adhérent </h1>

            <br/><!-- comment -->
            <center>
                <c:if test="${message != null}">${message}<br/><br/></c:if>
                <form action="${pageContext.request.contextPath}/Editer-Adherent" method="post">
                    <input type="hidden" name="id" value="${adherent.getId()}"/>
                    <div class="formBox">
                        <label for="codeDisplay">Code</label>
                        <input type="text" placeholder="code" name="codeDisplay" value="${adherent.getCode()}" disabled="true" />
                        <input type="hidden" name="code" value="${adherent.getCode()}"/>
                    </div>
                    <div  class="formBox">
                        <label for="codeClietCER">Code Client CER</label>
                        <input type="text" placeholder="Code client CER" name="codeClientCER" value="${adherent.getCodeClient()}"/><br/>         
                    </div>
                    <div  class="formBox">
                        <label for="titre">Titre</label>
                        <input type="text" placeholder="Titre" name="titre" value="${adherent.getTitre()}"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="nom">Nom</label>
                        <input type="text" placeholder="Nom" name="nom"value="${adherent.getNom()}"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="prenom">Prenom</label>
                        <input type="text" placeholder="Prenom" name="prenom"value="${adherent.getPrenom()}"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="adresse1">Adresse 1</label>
                        <input type="text" placeholder="Adresse 1" name="adresse1" value="${adherent.getAdresse1()}"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="adresse2">Adresse 2</label>
                        <input type="text" placeholder="Adresse 2" name="adresse2" value="${adherent.getAdresse2()}"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="codePostal">Code Postal</label>
                        <input type="number" placeholder="Code Postal" name="codePostal" value="${adherent.getCodePostal()}"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="commune">Commune</label>
                        <input type="text" placeholder="Commune" name="commune" value="${adherent.getCommune()}"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="code">Portable</label>
                        <input type="text" placeholder="Numero portable" name="portable" value="${adherent.getPortable()}"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="fixe">Fixe</label>
                        <input type="text" placeholder="Numero fixe" name="fixe" value="${adherent.getFixe()}"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="mail">E-mail</label>
                        <input type="text" placeholder="E-mail" name="mail" value="${adherent.getMail()}"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="entreprise">Nom Entite</label>
                        <input type="text" placeholder="Nom de l'entite/ferme/societée/entreprise" name="entrepsise" value="${adherent.getNomEntreprise()}"/><br/>
                    </div>
                    <center>
                        <br/><!-- comment -->
                        <button   type="submit">Modifier</button>
                    </center>
                </form>
            </center>
                     <br/><br/>
            <a href="${pageContext.request.contextPath}/Adherents">Retourner</a>
        </div>
    </body>
</html>
