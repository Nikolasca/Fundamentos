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
public class Produccion {
    int id;
    String Desc;
    String fecha;
    int produccion;
    int prodef;
    int proacep;
    int id_maquina;

    public Produccion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    public int getProdef() {
        return prodef;
    }

    public void setProdef(int prodef) {
        this.prodef = prodef;
    }

    public int getProacep() {
        return proacep;
    }

    public void setProacep(int proacep) {
        this.proacep = proacep;
    }

    public int getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(int id_maquina) {
        this.id_maquina = id_maquina;
    }
    
}
