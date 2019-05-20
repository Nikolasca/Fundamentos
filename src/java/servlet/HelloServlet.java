package servlet;

import Dao.Conexion;
import Dao.LineaDao;
import Modelos.LineaProduccion;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "Registar", 
        urlPatterns = {"/Registrar"}
    )
public class HelloServlet extends HttpServlet {
    
    RequestDispatcher rd;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String nombre = req.getParameter("name");
        String desc = req.getParameter("desc");
        Conexion c = new Conexion();
    Connection cc = c.connect();
    LineaDao linea = new LineaDao(cc);
    linea.InsertarLinea(nombre, desc);
    ArrayList<LineaProduccion> Lista= linea.TraerListas();
    req.setAttribute("lineas", Lista);
    rd = req.getRequestDispatcher("/Mensaje.jsp");
            rd.forward(req, resp);
      
    }  

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Conexion c = new Conexion();
    Connection cc = c.connect();
    LineaDao linea = new LineaDao(cc);
    ArrayList<LineaProduccion> Lista= linea.TraerListas();
    req.setAttribute("lineas", Lista);
    rd = req.getRequestDispatcher("/Mensaje.jsp");
            rd.forward(req, resp);
      
    }
    
}
