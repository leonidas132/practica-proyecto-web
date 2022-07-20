<%@ page import="com.protalento.entidades.DatosBusqueda" %>
<%@ page import="com.protalento.implementacion.ImpDatosBusqueda" %><%--
  Created by IntelliJ IDEA.
  User: Luis Nuñez
  Date: 18/07/2022
  Time: 11:24 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>resultados</title>
    <link rel="stylesheet" href=Css/tabla.css>
</head>
<body>
<%
    ImpDatosBusqueda impDatosBusqueda = new ImpDatosBusqueda();
    DatosBusqueda datosBusqueda = new DatosBusqueda();

%>

<table>
    <thead>
    <th>Texto</th> <!--los th se utilizan para los encabezado de las columnas-->
    <th>URL</th>
    <th>Fecha</th>

    </thead>
    <tbody>
    <tr>
        <td>${texto1}</td> <!--los td se utilizan para el valor de la fila-->
        <td>${ur}</td>
        <td>${fecha}</td>

    </tr>
    </tbody>
</table>


</body>
</html>

