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
            .outterBox{
                border:1px solid black;
                border-radius: 5px;
                width: 60vw;
                text-align: justify;
                padding: 1%;
                margin-right: auto;
                margin-left: auto;
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
                width: 40vw;
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
            }
          

        </style>
    </head>
    <body>
   
        <div class="outterBox">
            
                <h1> Nouveau Adhérent </h1>
           
                <br/><!-- comment -->

                <form action="post">
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
            
        </div>
  
    </body>
</html>
