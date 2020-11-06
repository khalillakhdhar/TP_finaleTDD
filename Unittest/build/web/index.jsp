<%-- 
    Document   : index
    Created on : 20 oct. 2020, 09:17:38
    Author     : TPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<!-- jQuery and JS bundle w/ Popper.js -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion</title>
    </head>
    <body>
        <form method="POST" action="AuthServlet">
            
            <table align="center" border="0">
                    <tr>
                        <th align="center" colspan="2"><h1>Connexion</h1>
                            <%
    if(session.getAttribute("erreur")!=null)
{
%>
<span class="badge badge-danger"><%= session.getAttribute("erreur") %></span> <% } %>
                        </th>
                    
                    </tr>
                    <tr>
                        <td>Login</td>
                        <td><input type="text" class="form-control" name="login" required></td>
                    </tr>
                    <tr>
                        <td>Mot de passe</td>
                        <td><input type="password" class="form-control"  name="mdp" required></td>
                    </tr>
                    <tr>
                        <td><input type="submit" class="btn btn-primary" value="se connecter"></td>
                        <td><input type="reset" class="btn btn-warning" value="annuler"></td>
                    </tr>
            </table>

        </form>
    </body>
</html>
