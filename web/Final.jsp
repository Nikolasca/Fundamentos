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
    </head>
    <body>


        <c:forEach items="${reportes}" var="reporte" varStatus="status"> 
            <p value="${reporte.descripcion}"> ${reporte.descripcion}</p>


        </c:forEach>


        <a href="index.html" > Inicio</a>
    </body>
</html>
