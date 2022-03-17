<%-- 
    Document   : index
    Created on : 10 mars 2022, 17:27:16
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
                width: 30vw;
                text-align: justify;
                padding: 1%;
                margin-right: auto;
                margin-left: auto;
                background-color: #aca69f6b;
                margin-top: 8%;
            }
            a{
                text-decoration: none;
                padding: 2%;
                margin: 1%;
                border: 1px solid #adab7;
                border-radius: 5px;
                text-align: center;
                color: #0f211a;
                background-color: #adab76;
                width: 20vw;
                   

            }
            a:hover{
                background-color: #0f211a;
                color: rgb(173,171,118);
            }
            .flex{
                display: flex;
            }
            .column{
                flex-direction: column;
                align-items:  center;
                
            }
            h1, p{
                background-color: #aca69f00; 
                color:#0f211a;
            }
            
         
            
        </style>
    </head>
    <body>
        <div class="outterBox flex column">
            <h1 class="flex">Bienvenue</h1>
            <p>Tableaux a dispositrion:</p>
            <div class="flex column ">
                <a href="${pageContext.request.contextPath}/Materiel">Matériel</a>
                <a href="${pageContext.request.contextPath}/Adherents">Adhérents</a>
                <a href="${pageContext.request.contextPath}/Engagements">Engagements</a>
                <a href="${pageContext.request.contextPath}/Activite-Materiel-Adherent">Activité par Matériel par Adhérent</a>
            </div>
        </div>
    </body>
</html>
