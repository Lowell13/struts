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
	<h3>Editer un client</h3>
	<s:form method="post" action="Modify_Client">
		<s:hidden key="client.idClient"/>
		<s:textfield name="client.name" id="client.name" label="Identifiant" labelposition="top" cssClass="input"/>
		<s:textfield name="client.password" id="client.password" label="Mot de passe" labelposition="top" cssClass="input"/>
		<s:submit value="Modifier un client"/>
	</s:form>		
</div>
</body>
</html>
