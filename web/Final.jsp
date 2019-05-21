<%-- 
    Document   : Final
    Created on : 20/05/2019, 02:15:16 AM
    Author     : nikolasca
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reportes</title>
    <h1> Listado de reportes </h1>
    </head>
    <body>


        <c:forEach items="${reportes}" var="reporte" varStatus="status"> 
            Reporte: <a href="DetalleReporte?id=${reporte.id}&desc=${reporte.descripcion}&aceptadas=${reporte.aceptadas}&rechazadas=${reporte.rechazadas}&totales=${reporte.totales}&fecha=${reporte.fecha}&idmaquina=${reporte.id_maquina}"> ${reporte.fecha}</a><br><br>
                


        </c:forEach>

            <br>
        <a href="${pageContext.request.contextPath}" > Inicio</a>
    </body>
</html>
