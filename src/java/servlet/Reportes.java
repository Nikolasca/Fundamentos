/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Dao.Conexion;
import Dao.ReporteDao;
import Modelos.LineaProduccion;
import Modelos.Maquina;
import Modelos.Reporte;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nikolasca
 */
@WebServlet(name = "Reportes", urlPatterns = {"/Reportes"})
public class Reportes extends HttpServlet {

    RequestDispatcher rd;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 String Nombre = request.getParameter("nombre");
        String idmaquina = request.getParameter("idmaquina");
        String idlinea = request.getParameter("idlinea");
        Maquina m = new Maquina();
        m.setNombre(Nombre);
        m.setId(Integer.parseInt(idmaquina));
        m.setId_linea(Integer.parseInt(idlinea));
        Conexion c = new Conexion();
    Connection cc = c.connect();
        ReporteDao r = new ReporteDao(cc);
        ArrayList<Reporte> Lista= r.TraerReportes(m.getId());
         request.setAttribute("reportes", Lista);
        rd = request.getRequestDispatcher("/Final.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Nombre = request.getParameter("nombre");
        String idmaquina = request.getParameter("idmaquina");
        String idlinea = request.getParameter("idlinea");
        Maquina m = new Maquina();
        m.setNombre(Nombre);
        m.setId(Integer.parseInt(idmaquina));
        m.setId_linea(Integer.parseInt(idlinea));
        request.setAttribute("maquina", m);
        rd = request.getRequestDispatcher("/AgregarReporte.jsp");
        rd.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
