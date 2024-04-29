<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="es-mx">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java EE Demo</title>
</head>
<body>
    <h2>Hello World!</h2>
    <h3>Lic. en informática...</h3>
    <h4>Tecnologías Web I</h4>

   <!--<a href="DemoServlet">Demo Servlet</a> -->

    <form method="get" action="DemoServlet">
        <label for="nombre"> Nombre: </label><br>
        <input type="text" name="nombre"/>
        <br>
        <br>
        <label for="nombre"> Apellido: </label><br>
        <input type="text" name="apellido"/>
        <input type="submit"/>
        <br>
        <br>
    <br>
    </form>

    <a href="calculadora.html">
    
    <button>Ir a la calculadora</button></a>

</body>
</html>
