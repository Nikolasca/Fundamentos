<%-- 
    Document   : Detalles
    Created on : 19/05/2019, 03:10:19 PM
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
        Nombre: <h1>${linea.nombre}</h1>
        id: <h1>${linea.id}</h1>
        Desc: <h1>${linea.descrip}</h1>
        <form action="AnadirMaquina" method="POST">
             <input type="hidden" value="${linea.nombre}"  placeholder="Tasa eficiencia" name="nombre"> 
              <input type="hidden" value="${linea.id}"  placeholder="Tasa eficiencia" name="id"> 
               <input type="hidden" value="${linea.descrip}"  placeholder="Tasa eficiencia" name="descri"> 
                <button type="submit" class="btn btn-primary">Añadir Maquina</button>
        </form>
        <form action="AnadirMaquina" method="GET">
             <input type="hidden" value="${linea.id}"  placeholder="Tasa eficiencia" name="id"> 
             <button type="submit" class="btn btn-primary">Ver Maquina</button>   
        </form>
    </body>
</html>
