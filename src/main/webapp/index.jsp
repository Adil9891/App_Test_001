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

<div class="bdy">
    <div >
        <button class="btn2" type="button" href="index.jsp">Création</button>
        <button class="btn2" type="button" href="index.jsp">Modification</button>
        <button class="btn2" type="button" href="index.jsp">Suppression</button>
        <button class="btn2" type="button" href="index.jsp">Rechercher</button>
    </div>

<form action="addClient" method="post" >
           <fieldset class="fld">
            <legend>Créer une fiche client</legend>
                        <table >
                            <tr><td><label>Nom :</label></td><td>
                                <input type="text" name="nom" size="40" maxlength="256" placeholder="votre nom" /></td></tr>
                                 <tr><td><label>Pr&eacute;nom :</label></td><td>
                                <input type="text" name="prenom" size="40" maxlength="256" placeholder="votre prénom" /></td></tr>
                                        <tr><td><label> CIN :</label></td><td>
                                <input type="text" name="cin" size="40" maxlength="256" placeholder="votre CIN" /></td></tr>
                                        <tr><td><label> Date de naissance :</label></td><td>
                                <input type="date" name="dateNaissance" /></td></tr>
                        </table>
            </fieldset>

<div>
                <input class="btn" type="reset" value="Effacer les champs" />
                <input class="btn" type="submit" value="Valider la création" /><br/>
</div>
</form>
</div>

<!-- 4ème groupe de composants -->

</body>
</html>