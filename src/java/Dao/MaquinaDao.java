/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelos.LineaProduccion;
import Modelos.Maquina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nikolasca
 */
public class MaquinaDao {

    Connection c;

    public MaquinaDao(Connection c) {
        this.c = c;
    }

    public void InsertarMaquina(String name, String ref, String desc, int tpt, int tr, int id_linea, int TE, int TiempoE,int TiempoEst, int TiempoPro) {
        try {
            String consulta = "insert into Maquina (Nombre,Referencia,Descrip,id_linea,TPT,TR,TE,TiempoE,TiempoEst,TiempoPro) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = c.prepareStatement(consulta);
            pst.setString(1, name);
            pst.setString(2, ref);
            pst.setString(3, desc);
            pst.setInt(4, id_linea);
            pst.setInt(5, tpt);
            pst.setInt(6, tr);
            pst.setInt(7, TE);
            pst.setInt(8, TiempoE);
            pst.setInt(9, TiempoEst);
            pst.setInt(10, TiempoPro);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);

        }
    }

    public ArrayList<Maquina> TraerListas(int id) {
        ArrayList<Maquina> Lista = new ArrayList();
        try {
            String consulta = "select * from Maquina where id_linea =?";
            PreparedStatement pst = c.prepareStatement(consulta);
           pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            Maquina linea;
            System.out.println("toma tu lista");

            while (rs.next()) {
                linea = new Maquina();
                linea.setId(rs.getInt("id_maquina"));
                linea.setNombre(rs.getString("Nombre"));
                linea.setReferencia(rs.getString("Referencia"));
                linea.setDesc(rs.getString("Descrip"));
                linea.setId_linea(rs.getInt("id_linea"));
                linea.setTPT(rs.getInt("TPT"));
                linea.setTR(rs.getInt("TR"));
                linea.setTE(rs.getInt("TE"));
                linea.setTiempoE(rs.getInt("TiempoE"));
                linea.setTiempoEst(rs.getInt("TiempoEst"));
                linea.setTiempoPro(rs.getInt("TiempoPro"));
                Lista.add(linea);
                System.out.println("Linea5");

            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        return Lista;
    }
}
