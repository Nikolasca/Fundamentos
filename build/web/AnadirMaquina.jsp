<%-- 
    Document   : AnadirMaquina
    Created on : 19/05/2019, 03:29:15 PM
    Author     : nikolasca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Añadir Máquina a la Linea: ${linea.nombre}</h1>
        <form action="RegistrarMaquina" method="GET">
    
             <input type="text"   placeholder="Nombre" name="name">
            <input type="text"  placeholder="Desc" name="descrip">
             <input type="text"   placeholder="Referencia" name="ref">
            <input type="text"   placeholder="Tasa de producción teórica" name="Tpt">
             <input type="text"   placeholder="Tasa rendimiento" name="TR">
             <input type="text"  placeholder="Tasa eficiencia" name="TE">
             <input type="text"   placeholder="Tiempo E" name="tiempoE"> 
              <input type="hidden" value="${linea.id}"  placeholder="Tasa eficiencia" name="idlinea"> 
             <button type="submit" class="btn btn-primary">Añadir Máquina</button>
        </form>
    </body>
</html>
