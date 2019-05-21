<%-- 
    Document   : DetallesR
    Created on : 20/05/2019, 11:44:13 PM
    Author     : nikolasca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles Reporte</title>
    </head>
    <body>
        <h1>Reporte</h1>
        Id:  <a>${reporte.id}</a><br>
        Descripción:  <a>${reporte.descripcion}</a><br>
        Unidades Aceptadas:  <a>${reporte.aceptadas}</a><br>
        Unidades Rechazadas:  <a>${reporte.rechazadas}</a><br>
        Unidades Totales:  <a>${reporte.totales }</a><br>
        
        <a href="${pageContext.request.contextPath}" > Volver a inicio</a>
    </body>
</html>
