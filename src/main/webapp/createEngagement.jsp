<%-- 
    Document   : createEngagement
    Created on : 5 mars 2022, 15:34:45
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
            }
        </style>
    </head>
    <body>
         
        <div class="outterBox">
            
                <h1> Nouveau Engagement </h1>
           
                <br/><!-- comment -->

                <form action="post">
                    <div class="formBox">                                               
                        <label for="code_matos">Code du Materiel</label>
                        <select id='code_matos'>
                            <c:forEach items="mat_list" var="mat" >
                                <option value="${mat.getCode()}">${mat.getCode()} - ${mat.getMateriel()}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div  class="formBox">
                        <label for="code_adh">Code de l'Adhérenmt</label>
                        <select  id="code_adh">
                            <c:forEach items="adh_list" var="adherent">
                                <option value="${adherent.getCode()}">${adherent.getCode()} - ${adherent.getNomEntreprise()}</option>
                            </c:forEach>
                        </select>
                        
                    </div>
                    <div  class="formBox">
                        <label for="pf">PF</label>
                        <input type="number" placeholder="PF" name="pf"/><br/>
                    </div>
                    <div class="formBox">
                        <label for="volume">Volume</label>
                        <input type="text" name="volume" placeholder="Volume"/><br/>
                    </div>
                    <center>
                        <br/><!-- comment -->
                        <button   type="submit">Ajouter</button>
                    </center>
                </form>
            
        </div>
  
    </body>
</html>
