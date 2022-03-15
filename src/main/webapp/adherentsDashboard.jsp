<%-- 
    Document   : adherentsDashboard
    Created on : 15 mars 2022, 11:10:56
    Author     : jessi
--%>

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
                background-repeat: repeat;
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
            <a href="index.jsp" class="m-left">Retourner</a>
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
                    <c:forEach items="${lisAdherents}" var="adh">
                        <tr>
                            <td>${adh.getCode()}</td>    
                            <c:choose>
                                <c:when test="${adh.getCodeClient() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adh.getCodeClient()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${adh.getTitre() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adh.getTitre()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${adh.getNom() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adh.getNom()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${adh.getPrenom() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adh.getPrenom()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${adh.getAdresse1() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adh.getAdresse1()}</td>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${adh.getAdresse2() == '0'}">
                                    <td>-</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${adh.getAdresse2()}</td>
                                </c:otherwise>
                            </c:choose>
                            
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
