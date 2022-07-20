<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>consultas</title>
    <link rel="stylesheet" href="Css/stylo.css">
</head>

<body>
    <div class="formulario">
        <form action="ServletConsulta" method="post">
            <label for="texto">Texto</label>
            <input type="text" name="texto" id="texto" placeholder="Ingrese texto">
            <br>
            <label for="Url">URL..:</label>
            <input type="url" name="Url" id="Url" placeholder="Ingrese url">
            <br>
            <button type="submit">Consultar</button>
            <button type="reset">Limpiar</button>
        </form>
    </div>


</body>
</html>