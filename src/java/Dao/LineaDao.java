/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Modelos.LineaProduccion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nikolasca
 */
public class LineaDao {
    Connection c;

    public LineaDao(Connection c) {
        this.c = c;
    }
    
    
    public void InsertarLinea(String Nombre, String Descrip){
        try {
            String consulta = "insert into Linea (Nombre,Descripcion) values (?,?)";
            
            PreparedStatement pst = c.prepareStatement(consulta);
            pst.setString(1, Nombre);
            pst.setString(2, Descrip);
            pst.executeUpdate();
            System.out.println("Iniciando sesion Empleado");
            
        } catch (SQLException e) {
            System.err.println(e);
        }

    }
    public ArrayList<LineaProduccion> TraerListas(){
        ArrayList<LineaProduccion> Lista= new ArrayList(); 
        try {
            String consulta = "select * from Linea";
            PreparedStatement pst = c.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            LineaProduccion linea;
            System.out.println("toma tu lista");
            

            while (rs.next()) {
                linea = new LineaProduccion();
                linea.setId(rs.getInt("id_linea"));
                linea.setNombre(rs.getString("Nombre"));
                linea.setDescrip(rs.getString("Descripcion"));
                Lista.add(linea);
                System.out.println("Linea");
               
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        return Lista;
    }
   
}
