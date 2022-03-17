<%-- 
    Document   : editerEngagement
    Created on : 16 mars 2022, 21:14:41
    Author     : jessi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editer Engagement</title>
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

            <h1> Editer Engagement </h1>

            <br/><!-- comment -->
            <center>
                <c:if test="${message != null}">${message}<br/><br/></c:if>
                <form action="${pageContext.request.contextPath}/Editer-Engagement" method="post">
                    <input type="hidden" name="id" value="${engagement.getId()}"/>
                    <div class="formBox">                                               
                        <label for="codeMatos">Code du Materiel</label>
                        <select name='codeMatos'>
                            <option value="${engagement.getIdMateriel()}">${engagement.getIdMateriel()}</option>
                        </select>
                    </div>
                    <div  class="formBox">
                        <label for="codeAdh">Code de l'Adhérenmt</label>
                        <select  name="codeAdh">
                            <option value="${engagement.getCodeAdherent()}">${engagement.getCodeAdherent()}</option>
                        </select>

                    </div>
                    <div  class="formBox">
                        <label for="pf">PF</label>
                        <input type="number" placeholder="PF" name="pf" value="${engagement.getPf()}"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="volume">Volume</label>
                        <input type="text" name="volume" placeholder="Volume" value="${engagement.getVolume()}"/><br/>
                    </div>
                    <center>
                        <br/><!-- comment -->
                        <button   type="submit">Modifier</button>
                    </center>
                </form>
            </center>
            <br/><br/>
            <a href="${pageContext.request.contextPath}/Engagements">Retourner</a>
        </div>

    </body>
</html>
