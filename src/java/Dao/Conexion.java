/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nikolasca
 */
public class Conexion {
      public Connection connect() {
        Connection con = null;
        String URL = "jdbc:sqlserver://localhost:1433;databaseName = proceso2";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(URL, "admin", "root");
            System.out.println("Conexion con la base de datos establecida");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error estableciendo conexion con la base de datos");
            System.err.println(e.getMessage());
        }
        return con;
    }
}
