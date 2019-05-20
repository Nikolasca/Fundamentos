/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Dao.Conexion;
import Dao.ReporteDao;
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
@WebServlet(name = "AgregarReporte", urlPatterns = {"/AgregarReporte"})
public class AgregarReporte extends HttpServlet {
     RequestDispatcher rd;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String des = request.getParameter("Des");
        int totales = Integer.parseInt(request.getParameter("T"));
        int aceptadas = Integer.parseInt(request.getParameter("A"));
        int rechazadas = Integer.parseInt(request.getParameter("R"));
        int idmaquina = Integer.parseInt(request.getParameter("idmaquina"));
        Reporte r = new Reporte();
        r.setDescripcion(des);
        r.setTotales(totales);
        r.setAceptadas(aceptadas);
        r.setId_maquina(idmaquina);
        r.setRechazadas(rechazadas);
        Conexion c = new Conexion();
         Connection con = c.connect();
         ReporteDao re = new ReporteDao(con);
         re.AñadirReporte(des, totales, aceptadas, rechazadas, idmaquina);
         
  ArrayList<Reporte> Lista= re.TraerReportes(r.getId_maquina());
         request.setAttribute("reportes", Lista);
        rd = request.getRequestDispatcher("/Final.jsp");
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
