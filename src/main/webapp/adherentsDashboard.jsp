<%-- 
    Document   : adherentsDashboard
    Created on : 15 mars 2022, 11:10:56
    Author     : jessi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adherents Dashboard</title>
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
            <h2>Adherent</h2>
            <a href="createAdherent.jsp" class="m-left">Nouveau Adhérent</a>
            <a href="${pageContext.request.contextPath}/" class="m-left">Retourner</a>
        </header>
        <section class="flex flex-column">
            <center><c:if test="${message != null}">${message}</c:if></center>
            <table>
                <thead>
                    <tr>
                        <th>Code</th>
                        <th>Code Client CER</th>
                        <th>Titre</th>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>Adresse 1</th>
                        <th>Adresse 2</th>
                        <th>Code Postal</th>
                        <th>Commune</th>
                        <th>Portable</th>
                        <th>Fixe</th>
                        <th>Mail</th>
                        <th>Nom societé</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listAdherents}" var="adherent">
                        <tr>
                            <td>${adherent.getCode()}</td> 
                            <td>${adherent.getCodeClient()}</td>
                            <td>${adherent.getTitre()}</td>
                            <td>${adherent.getNom()}</td>

                            <c:choose>
                                <c:when test="${adherent.getPrenom() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adherent.getPrenom()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${adherent.getAdresse1() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adherent.getAdresse1()}</td>
                                </c:otherwise>
                            </c:choose> 
                            <c:choose>
                                <c:when test="${adherent.getAdresse2() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adherent.getAdresse2()}</td>
                                </c:otherwise>
                            </c:choose>  
                            <c:choose>
                                <c:when test="${adherent.getCodePostal() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adherent.getCodePostal()}</td>
                                </c:otherwise>
                            </c:choose> 
                            <c:choose>
                                <c:when test="${adherent.getCommune() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adherent.getCommune()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${adherent.getPortable() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adherent.getPortable()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${adherent.getFixe() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adherent.getFixe()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${adherent.getMail() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adherent.getMail()}</td>
                                </c:otherwise>
                            </c:choose>

                            <td>${adherent.getNomEntreprise()}</td>
                            <td>
                                <a class="actions" href="${pageContext.request.contextPath}/Editer-Adherent?id=${adherent.getId()}">Modifier</a><!-- Edit -->
                            </td> 
                            <td>
                                <a class="actions" href="${pageContext.request.contextPath}/Delete-Adherent?id=${adherent.getId()}">Supprimer</a><!-- Delete -->
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </section>
    </body>
</html>
