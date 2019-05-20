<%-- 
    Document   : Mensaje
    Created on : 19/05/2019, 03:10:07 AM
    Author     : nikolasca
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lineas</title>
    </head>
    <body>
        <h1>Buena Perro</h1>
              
                            <c:forEach items="${lineas}" var="linea" varStatus="status"> 
                                <p value="${linea.nombre}"> ${linea.nombre}</p>
                               <a class="btn btn-primary" href="Editarlinea?id_linea=${linea.id}&nombre=${linea.nombre}&descri=${linea.descrip}" role="button">Editar</a>
                               
                            </c:forEach>
                       
    </body>
</html>
