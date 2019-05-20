<%-- 
    Document   : DetalleM
    Created on : 19/05/2019, 11:28:08 PM
    Author     : nikolasca
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Maquinas de la línea!</h1>
    
                        <c:forEach items="${lineas}" var="maquina" varStatus="status"> 
                               <br>  Nombre:<p value="${maquina.nombre}"> ${maquina.nombre}</p>
                                Descripcion <p value="${maquina.nombre}"> ${maquina.desc}</p>
                                Referencia; <p value="${maquina.nombre}"> ${maquina.referencia}</p><br>
                                <form action="Reportes" method="Post">  
                                    <input type="hidden" value="${maquina.id}"  placeholder="id de la maquina" name="idmaquina">
                                     <input type="hidden" value="${maquina.id_linea}"  placeholder="id de la linea" name="idlinea">
                                     <input type="hidden" value="${maquina.nombre}"  placeholder="nombre maquina" name="nombre">
                                     
                                    <button type="submit" class="btn btn-primary">Agregar Reporte</button>
                                </form>
                                     <form action="Reportes" method="GET">
                                    <input type="hidden" value="${maquina.id}"  placeholder="id maquina" name="idmaquina">
                                     <input type="hidden" value="${maquina.id_linea}"  placeholder="id linea" name="idlinea">
                                     <input type="hidden" value="${maquina.nombre}"  placeholder="nombre" name="nombre">
                                    <button type="submit" class="btn btn-primary">Ver reportes</button><br>
                                </form> 
                                
                              
                            </c:forEach>
                                <br>  <a href="index.html" > Volver inicio</a>
    </body>
</html>
