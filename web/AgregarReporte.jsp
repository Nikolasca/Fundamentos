<%-- 
    Document   : AgregarReporte
    Created on : 20/05/2019, 01:03:11 AM
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
        <h1>Agregar Reporte a: ${maquina.nombre}</h1
        <form action="AgregarReporte" 
             <input type="text"   placeholder="Descripcion" name="Des">
             <input type="number"   placeholder="Unidades Totales" name="T">
            <input type="number"   placeholder="Unidades Aceptadas" name="A">
             <input type="text"   placeholder="Unidades Rechazadas" name="R">
             <input type="hidden"  value="${maquina.id}" name="idmaquina">
             <button type="submit" class="btn btn-primary">Aceptar</button>
        </form>
    </body>
</html>
