<%-- 
    Document   : materielDashboard
    Created on : 11 mars 2022, 12:22:44
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
                width: 98%;
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
            <h2>Matériel</h2>
            <a href="createMateriel.jsp" class="m-left">Nouveau Materiel</a>
            <a href="${pageContext.request.contextPath}/" class="m-left">Retourner</a>
        </header>
        <section class="flex flex-column">
            <center><c:if test="${message != null}">${message}</c:if></center>
            <table>
                <thead>
                    <tr>
                        <th>Matériel</th>
                        <th>Marque</th>
                        <th>Modèle</th>
                        <th>Code</th>
                        <th>Date d'achat</th>
                        <th>Prix d'achat</th>
                        <th>Durée d'ammortis</th>
                        <th>K. Social</th>
                        <th>Nombre d'adhérents</th>
                        <th>Engagements</th>
                        <th>Unité de facturation</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listMatos}" var="matos">
                        <tr>
                            <td>${matos.getMateriel()}</td>    
                            <c:choose>
                                <c:when test="${matos.getMarque() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${matos.getMarque()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${matos.getModel() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${matos.getModel()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${matos.getCode() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${matos.getCode()}</td>
                                </c:otherwise>
                            </c:choose>

                            <td>${matos.getDateAchat()}</td>
                            <td>${matos.getPrixAchat()}</td>
                            <td>${matos.getDureeAmortis()}</td>
                            <td>${matos.getkSocial()}</td>
                            <td>${matos.getNbAdherents()}</td>
                            <td>${matos.getEngagements()}</td>
                            <td>${matos.getUniteFacturation()}</td>
                            <td>
                                <a class="actions" href="${pageContext.request.contextPath}/Editer-Materiel?code=${matos.getCode()}">Modifier</a><!-- Edit -->
                            </td>
                            <td>
                                <a class="actions" href="${pageContext.request.contextPath}/Delete-Materiel?code=${matos.getCode()}">Supprimer</a><!-- Delete -->
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </section>
    </body>
</html>
