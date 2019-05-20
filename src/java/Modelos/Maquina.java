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
public class Maquina {
    int id;
    String Nombre;
    String Referencia;
    int id_linea;
    String Desc;
    int TPT;
    int TR;
    int TE;
    int TiempoE;

    public Maquina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId_linea() {
        return id_linea;
    }

    public void setId_linea(int id_linea) {
        this.id_linea = id_linea;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public int getTPT() {
        return TPT;
    }

    public void setTPT(int TPT) {
        this.TPT = TPT;
    }

    public int getTR() {
        return TR;
    }

    public void setTR(int TR) {
        this.TR = TR;
    }

    public int getTE() {
        return TE;
    }

    public void setTE(int TE) {
        this.TE = TE;
    }

    public int getTiempoE() {
        return TiempoE;
    }

    public void setTiempoE(int TiempoE) {
        this.TiempoE = TiempoE;
    }

    @Override
    public String toString() {
        return "Maquina{" + "id=" + id + ", Nombre=" + Nombre + ", Referencia=" + Referencia + ", id_linea=" + id_linea + ", Desc=" + Desc + ", TPT=" + TPT + ", TR=" + TR + ", TE=" + TE + ", TiempoE=" + TiempoE + '}';
    }
    
    
    
}
