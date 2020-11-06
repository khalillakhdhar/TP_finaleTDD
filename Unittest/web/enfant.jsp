<%-- 
    Document   : enfant
    Created on : 6 nov. 2020, 15:46:11
    Author     : TPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            td
            {
                text-align: center;
            }
            
        </style>
              <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<!-- jQuery and JS bundle w/ Popper.js -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="EnfantServlet" method="post">
            <table width="30%" align="center">
                <tr><td colspan="2"><h1>Ajout d'enfant</h1>
                        <br><%
                        if(session.getAttribute("message")!=null)
                        { %>
                        <h2>Ajouté avec succés</h2> <% } %>
                    </td>
                    </td></tr>
                <tr><td>Nom complet</td><td><input type="text" name="nc" class="form-control"></td><td><%
                        if(session.getAttribute("nom")!=null)
                        { %><span class="badge badge-danger"><%= session.getAttribute("nom") %> <% } %></span></td></tr>
                <tr><td>Classe:</td><td><input type="text" name="cl" class="form-control"></td><td><%
                        if(session.getAttribute("classe")!=null) {
                        %><span class="badge badge-danger"><%= session.getAttribute("classe") %></span> <% } %> </td></tr>
                <tr><td>note précédente</td><td><input type="text" name="np" class="form-control"></td><td><%
                        if(session.getAttribute("note")!=null) {
                        %><span class="badge badge-danger"><%= session.getAttribute("note") %><% } %></span></td></tr>
                <tr><td><input type="submit" class="btn btn-primary" value="ajouter"></td><td><input type="reset" class="btn btn-warning" value="annuler"></td></tr>


            </table>
            
        </form>
    </body>
</html>
