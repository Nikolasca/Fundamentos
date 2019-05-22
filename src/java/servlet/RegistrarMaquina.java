/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Dao.Conexion;
import Dao.MaquinaDao;
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
@WebServlet(name = "RegistrarMaquina", urlPatterns = {"/RegistrarMaquina"})
public class RegistrarMaquina extends HttpServlet {
 RequestDispatcher rd;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("name");
        String desc = request.getParameter("descrip");
        String referencia = request.getParameter("ref");
        String d = request.getParameter("Tpt");
        String e = request.getParameter("TR");
        String f = request.getParameter("TE");
        String t = request.getParameter("tiempoE");
        String g = request.getParameter("idlinea");
        String h = request.getParameter("tiempoEst");
        String k = request.getParameter("tiempoPro");
        
        System.out.print(nombre + desc + referencia + d + e + f + t + g+h+k);
        
        Maquina maq = new Maquina();
        
        maq.setDesc(desc);
        maq.setNombre(nombre);
        maq.setReferencia(referencia);
        maq.setTiempoE(Integer.parseInt(t));
        maq.setTPT(Integer.parseInt(d));
        maq.setTR(Integer.parseInt(e));
        maq.setTE(Integer.parseInt(f));
        maq.setId_linea(Integer.parseInt(g));
        maq.setTiempoEst(Integer.parseInt(h));
        maq.setTiempoPro(Integer.parseInt(k));
        System.out.println("FOREIGN"+maq.getId_linea());
        Conexion cc = new Conexion();
        cc.connect();
        Connection con = cc.connect();
        MaquinaDao maquina = new MaquinaDao(con);
        maquina.InsertarMaquina(maq.getNombre(), maq.getReferencia(), maq.getDesc(), maq.getTPT(), maq.getTR(), maq.getId_linea(), maq.getTE(), maq.getTiempoE(),maq.getTiempoEst(),maq.getTiempoPro());
         
        ArrayList<Maquina> maquinitas= maquina.TraerListas(maq.getId_linea());
        System.out.print(maquinitas.size());
        request.setAttribute("lineas", maquinitas);
        rd = request.getRequestDispatcher("/DetalleM.jsp");
        rd.forward(request, response);

         

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
