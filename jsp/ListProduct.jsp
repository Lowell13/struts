<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Romain MATTEO
  Date: 06/09/2019
  Time: 09:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Site e-commerce</title>
    <style type="text/css">@import url(css/styles.css);</style>
</head>
<body>
<!-- Liste des produits -->
<div id="enveloppe">
    <table border="0" id="tableau" cellpadding="0" cellspacing="0">
        <tr>
            <td><strong>ID</strong></td>
            <td><strong>Nom</strong></td>
            <td><strong>Prix</strong></td>
            <td colspan="2" align="center"></td>
        </tr>
        <s:iterator value="listProducts" status="ligne">
            <s:if test="#ligne.odd"><tr class="ligne1"></s:if>
            <s:if test="#ligne.even"><tr class="ligne2"></s:if>
            <td><s:property value="idProduct"/></td>
            <td><s:property value="name"/></td>
            <td><s:property value="price"/></td>
            <td><a href="ViewProduct.action?idCurrentProduct=${idProduct}">Voir Produit</a></td>
            </tr>
        </s:iterator>
    </table>
</div>
</body>
</html>
