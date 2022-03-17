<%-- 
    Document   : createActMatAdh
    Created on : 17 mars 2022, 20:18:23
    Author     : jessi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajouter Activite par materiel par Adherent</title>
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
            input, select{
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

            <h1> Nouvelle Activité </h1>

            <br/><!-- comment -->
            <center>
                <c:if test="${message != null}">${message}<br/><br/></c:if>
                <form action="${pageContext.request.contextPath}/Ajouter-Activite" method="post">
                    <div class="formBox">                                               
                        <label for="codeMatos">Code du Materiel</label>
                        <select name='codeMatos'>
                            <optiongroup label="Matériel">                            
                                <c:forEach items="${listMateriel}" var="mat" >
                                    <option value="${mat.getCode()}">${mat.getCode()} - ${mat.getMateriel()}</option>
                                </c:forEach>
                            </optiongroup>
                        </select>
                    </div>
                    <div  class="formBox">
                        <label for="codeFacturation">Code Facturation</label>
                        <input type="text" placeholder="Code Facturation" name="codeFacturation"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="valeurFixe">Valeur Fixe</label>
                        <input type="text" placeholder="Valeur Fixe" name="valeurFixe"/><br/>
                    </div>
                    <div  class="formBox">
                        <label for="codeAdh">Code de l'Adhérenmt</label>

                        <select  name="codeAdh">
                            <optgroup label="Adhérent">
                            <c:forEach items="${listAdherents}" var="adherent">
                                <option value="${adherent.getCode()}">${adherent.getCode()} - ${adherent.getNomEntreprise()}</option>
                            </c:forEach>
                            </optgroup>
                        </select>

                    </div>
                    <div  class="formBox">
                        <label for="pf">PF</label>
                        <input type="number" placeholder="PF" name="pf"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="unite">Unité</label>
                        <input type="text" name="unite" placeholder="Unité"/><br/>
                    </div>
                    <center>
                        <br/><!-- comment -->
                        <button   type="submit">Ajouter</button>
                    </center>
                </form>
            </center>
            <br/><br/>
            <a href="${pageContext.request.contextPath}/Activite-Materiel-Adherent">Retourner</a>
        </div>
    </body>
</html>
