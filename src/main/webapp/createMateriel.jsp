<%-- 
    Document   : newjsp
    Created on : 5 mars 2022, 10:31:24
    Author     : jessi
--%>

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

            <h1> Nouveau Matériel </h1>

            <br/><!-- comment -->
            <center>
                 <c:if test="${message != null}">${message}<br/><br/></c:if>
                <form  action="${pageContext.request.contextPath}/Ajouter-Materiel" method="post">
                    <div class="formBox">
                        <label for="materiel">Description</label>
                        <input type="text" placeholder="Description" name="description"/>
                    </div>
                    <div  class="formBox">
                        <label for="marque">Marque</label>
                        <input type="text" placeholder="Marque" name="marque"/><br/>         
                    </div>
                    <div  class="formBox">
                        <label for="modele">Modèle</label>
                        <input type="text" placeholder="Modèle" name="modele"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="dateAchat">Date d'achat</label>
                        <input type="date" name="dateAchat"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="code">Code</label>
                        <input type="text" placeholder="Code" name="code"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="prixAchat">Prix d'achat</label>
                        <input type="number" placeholder="00,00" name="prixAchat"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="dureeAmortis">Durée d'ammortissements</label>
                        <input type="number" placeholder="Durée d'ammortissements" name="dureeAmortis"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="kSocial">K. Social</label>
                        <input type="number" placeholder="K. Social" name="kSocial"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="uniteFacturation">Unité de Facturation</label>
                        <input type="text" placeholder="Unité de Facturation" name="uniteFacturation"/><br/>
                    </div>
                    
                    <center>
                        <br/><!-- comment -->
                        <button   type="submit">Ajouter</button>
                    </center>
                </form>


            </center>
            <br/><br/>
            <a href="${pageContext.request.contextPath}/Materiel">Retourner</a>
        </div>
    </body>
</html>
