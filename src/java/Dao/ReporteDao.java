/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelos.Maquina;
import Modelos.Reporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import servlet.Reportes;

/**
 *
 * @author nikolasca
 */
public class ReporteDao {
    Connection c;

    public ReporteDao(Connection c) {
          this.c = c;
    }
    
    public void AñadirReporte(String Descr, int Producidas, int Aprobadas, int Rechzadas, int idMaquina){
         try {
            String consulta = "insert into Reporte (Descrip,Fecha,UnidadesP,UnidadesA,UnidadesR,id_maquina) values (?,GETDATE(),?,?,?,?)";
            PreparedStatement pst = c.prepareStatement(consulta);
            pst.setString(1, Descr);
            pst.setInt(2, Producidas);
            pst.setInt(3, Aprobadas);
            pst.setInt(4, Rechzadas);
            pst.setInt(5, idMaquina);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);

        }
    }
    public ArrayList <Reporte> TraerReportes(int id){
     ArrayList<Reporte> Lista = new ArrayList();
        try {
            String consulta = "select * from Reporte where id_maquina =?";
            PreparedStatement pst = c.prepareStatement(consulta);
             pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            Reporte reporte;
            System.out.println("toma tu lista de reportes");

            while (rs.next()) {
                reporte = new Reporte();
                reporte.setId(rs.getInt("id_reporte"));
                reporte.setDescripcion(rs.getString("Descrip"));
                reporte.setFecha(rs.getString("Fecha"));
                reporte.setTotales(rs.getInt("UnidadesP"));
               reporte.setAceptadas(rs.getInt("UnidadesA"));
               reporte.setRechazadas(rs.getInt("UnidadesR"));
               reporte.setId_maquina(rs.getInt("id_maquina"));
                Lista.add(reporte);
                System.out.println("LineaReporte");

            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        return Lista;
    
    }
}
