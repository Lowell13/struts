<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Romain MATTEO
  Date: 06/09/2019
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Voir produit</title>
</head>
<body>
    <h3>Visualisation d'un produit</h3>
    <p>
        Image : Insérez ici une image super classe<br />
        Nom du produit : <s:property value="product.name"/><br />
        Prix du produit : <s:property value="product.price"/><br />
    </p>
</body>
</html>
