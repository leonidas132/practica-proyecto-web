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
    try {

        for (DatosBusqueda lista:impDatosBusqueda.listar()){

            out.print(lista.getText());
            out.print(lista.getUrl());
            out.print(lista.getContenido_web());
            out.print(lista.getFecha());

        }
    }catch (NullPointerException E) {
        E.getMessage();
    }
%>

<table>
    <thead>
    <th>Texto</th> <!--los th se utilizan para los encabezado de las columnas-->
    <th>URL</th>
    <th>Contenido web</th>
    <th>Fecha</th>

    </thead>
    <tbody>
    <tr>
        <td>value=""</td> <!--los td se utilizan para el valor de la fila-->
        <td>www.gogg.com</td>
        <td>aqui mostremos el contenido web</td>
        <td>2022/02/03</td>

    </tr>
    </tbody>
</table>


</body>
</html>
