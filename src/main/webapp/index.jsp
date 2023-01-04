<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="style001.css">
    <title>Formulaire JSP</title>

</head>
<body>
<div id="menu">
    <a href="index.jsp">Créer fiche client</a>
    <a href="index.jsp">Modifier données client</a>
    <a href="index.jsp">Supprimer fiche client</a>
</div>
<form action="gestFormulaire" method="post" >
    <!-- premier groupe de composants-->
    <fieldset class="fld">
    <legend>Création fiche client</legend>
        <table >
            <tr><td><label>Nom :</label></td><td>
                <input type="text" name="nom" size="40" maxlength="256"
                placeholder="votre nom" /></td></tr>
            <tr><td><label>
                Pr&eacute;nom :</label></td><td>
                <input type="text" name="prenom" size="40" maxlength="256"
                       placeholder="votre prénon" /></td></tr>
                        <tr><td><label>
                Pr&eacute;nom :</label></td><td>
                <input type="text" name="cin" size="40" maxlength="256"
                       placeholder="votre CIN" /></td></tr>
                        <tr><td><label>
                Date de naissance :</label></td><td>
                <input type="date" name="dateNaissance" /></td></tr>
        </table>

    </fieldset>
    </br>

    <!-- Troisième groupe de composants -->
        <fieldset>

                <input type="hidden" name="MAX_FILE_SIZE" value="10000" />
                <input type="reset" value="Effacer" />
                <input type="submit" value="Envoyer" /><br/>

        </fieldset>



</form>

<!-- 4ème groupe de composants -->
<fieldset>
    <form action="CrudClient" method="post" >

    <input type="submit" value="Enregistrer" /><br/>
    </form>

</fieldset>
</body>
</html>