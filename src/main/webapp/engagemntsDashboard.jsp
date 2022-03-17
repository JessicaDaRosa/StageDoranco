<%-- 
    Document   : engagemntsDashboard
    Created on : 15 mars 2022, 17:32:29
    Author     : jessi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Engagements Dashboard</title>
        <style>
            .flex{
                display: flex;
            }
            .flex-row{
                flex-direction: row;
                align-items: baseline;
            }
            .flex-column{
                flex-direction: column;
            }
            .flex-end{
                align-content: flex-end;
            }
            .m-left{
                margin-left: auto;
            }

            header{
                background-color: #aca69f6b;
                padding: 0;
                margin: 0;
                color:#0f211a;
            }
            body{
                background-image: url('https://wallpaperaccess.com/full/803470.jpg');
                background-repeat: no-repeat;
                background-attachment: fixed;
                color: black;
                font-family: 'Open Sans', sans-serif;
            }
            h2, a{
                padding: 0.5%;
            }
            table, th, td{
                border: 1px solid black;
                border-collapse: collapse;
            }
            table{
                margin-top: 1%;
                
                margin-left: auto;
                margin-right: auto;
            }
            td{
                text-align: center;
            }
            th{
                font-family: sans-serif;
                white-space: pre-wrap;
                color:#0f211a;
                background-color: #adab76bf;
            }
            section{
                justify-content: center;
                background-color: #adab76bf;
            }
            a{
                text-decoration: none;
                padding: 0.5%;
                margin: 1%;
                border: 1px solid #adab7;
                border-radius: 5px;
                text-align: center;
                color: #0f211a;
                background-color: #adab76;
                width: auto;

            }
            a:hover{
                background-color: #0f211a;
                color: rgb(173,171,118);
            }


        </style>
    </head>
    <body>
         <header class="flex flex-row">
            <h2>Engagements</h2>
            <a href="${pageContext.request.contextPath}/Ajouter-Engagment" class="m-left">Nouveau Engagement</a>
            <a href="${pageContext.request.contextPath}/" class="m-left">Retourner</a>
        </header>
        <section class="flex flex-column">
            <center><c:if test="${message != null}">${message}</c:if></center>
            <table>
                <thead>
                    <tr>
                        <th>Code Matériel</th>
                        <th>Description</th>
                        <th>Code Adhérent</th>
                        <th>PF</th>
                        <th>volume</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listEngagements}" var="eng">
                        <tr>
                            <td>${eng.getIdMateriel()}</td>    
                            <td>${eng.getDescriptionMateriel()}</td>
                            <td>${eng.getCodeAdherent()}</td>
                            <td>${eng.getPf()}</td>
                            <td>${eng.getVolume()}</td>
                            <td>
                                <a class="actions" href="${pageContext.request.contextPath}/Editer-Engagement?id=${eng.getId()}">Modifier</a><!-- Edit -->
                            </td>
                            <td>
                                <a class="actions" href="${pageContext.request.contextPath}/Delete-Engagement?id=${eng.getId()}">Supprimer</a><!-- Delete -->
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </section>
    </body>
</html>
