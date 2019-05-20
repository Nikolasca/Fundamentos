/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Dao.Conexion;
import Dao.MaquinaDao;
import Modelos.LineaProduccion;
import Modelos.Maquina;
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
@WebServlet(name = "AñadirMaquina", urlPatterns = {"/AnadirMaquina"})
public class AñadirMaquina extends HttpServlet {
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
        Conexion cc = new Conexion();
        cc.connect();
        Connection con = cc.connect();
        MaquinaDao maquina = new MaquinaDao(con);
        ArrayList<Maquina> maquinitas= maquina.TraerListas(Integer.parseInt(request.getParameter("id")));
        System.out.print(maquinitas.size());
        request.setAttribute("lineas", maquinitas);
        rd = request.getRequestDispatcher("/DetalleM.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String a = request.getParameter("nombre");
        String b = request.getParameter("descri");
        String c = request.getParameter("id");
        LineaProduccion l = new LineaProduccion();
        l.setNombre(a);
        l.setId(Integer.parseInt(c));
        l.setDescrip(b);
         request.setAttribute("linea",l);
        rd = request.getRequestDispatcher("/AnadirMaquina.jsp");
            rd.forward(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
