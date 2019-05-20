/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author nikolasca
 */
public class Reporte {
    int id;
    String Descripcion;
    int Aceptadas;
    int Rechazadas;
    int Totales;
    int id_maquina;
    String Fecha;

    public Reporte() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getAceptadas() {
        return Aceptadas;
    }

    public void setAceptadas(int Aceptadas) {
        this.Aceptadas = Aceptadas;
    }

    public int getRechazadas() {
        return Rechazadas;
    }

    public void setRechazadas(int Rechazadas) {
        this.Rechazadas = Rechazadas;
    }

    public int getTotales() {
        return Totales;
    }

    public void setTotales(int Totales) {
        this.Totales = Totales;
    }

    public int getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(int id_maquina) {
        this.id_maquina = id_maquina;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
