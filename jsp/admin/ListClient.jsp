<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Site e-commerce</title>
    <style type="text/css">@import url(css/styles.css);</style>
</head>
<body>
<!-- Message d'erreur -->
<s:if test="errors.size()>0">
    <div id="message_erreur">
        <label>Les erreurs suivantes se sont produites : </label>
        <ul><s:fielderror/></ul>
    </div>
</s:if>

<div id="enveloppe">
    <h3>Ajouter un client</h3>
    <s:form method="post" action="Add_Client">
        <s:textfield name="client.name" id="client.name" label="Identifiant" labelposition="top"
                     cssClass="input"/>
        <s:textfield name="client.password" id="client.password" label="Mot de passe" labelposition="top"
                     cssClass="input"/>
        <s:submit value="Ajouter un client"/>
    </s:form>

    <table border="0" id="tableau" cellpadding="0" cellspacing="0">
        <tr>
            <td><b>ID</b></td>
            <td><b>Identifiant</b></td>
            <td><b>Mot de passe</b></td>
            <td colspan="2" align="center"><b>Gestion</b></td>
        </tr>
        <s:iterator value="listClients" status="ligne">
            <s:if test="#ligne.odd"><tr class="ligne1"></s:if>
            <s:if test="#ligne.even"><tr class="ligne2"></s:if>
            <td><s:property value="idClient"/></td>
            <td><s:property value="name"/></td>
            <td><s:property value="password"/></td>
            <td align="center"><a href="Edit_Client.action?idCurrentClient=${idClient}"/><img
                    src="images/editerclient.png" alt="Editer" title="Editer" border="0"/></a></td>
            <td align="center"><a href="Delete_Client.action?idCurrentClient=${idClient}"/><img
                    src="images/supprimerclient.png" alt="Supprimer" title="Supprimer" border="0"/></a></td>
            </tr>
        </s:iterator>
    </table>
</div>
</body>
</html>
