/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Modelos.Reporte;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "DetalleReporte", urlPatterns = {"/DetalleReporte"})
public class DetalleReporte extends HttpServlet {
 RequestDispatcher rd;
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String des = request.getParameter("desc");
        String fecha = request.getParameter("fecha");
        int totales = Integer.parseInt(request.getParameter("totales"));
        int aceptadas = Integer.parseInt(request.getParameter("aceptadas"));
        int rechazadas = Integer.parseInt(request.getParameter("rechazadas"));
        int idmaquina = Integer.parseInt(request.getParameter("idmaquina"));
        Reporte reporte = new Reporte();
        reporte.setAceptadas(aceptadas);
        reporte.setDescripcion(des);
        reporte.setRechazadas(rechazadas);
        reporte.setId_maquina(idmaquina);
        request.setAttribute("reporte", reporte);
    rd = request.getRequestDispatcher("/DetallesR.jsp");
            rd.forward(request, response);
        
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
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
