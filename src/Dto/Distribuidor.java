/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;

/**
 *
 * @author pauloherrera
 */
public class Distribuidor {
    
    String nombre_distribuidor,giro_distribuidor,direccion_distribuidor;
    int id_distribuidor,añoAfiliacion,telefono;

    public Distribuidor(String nombre_distribuidor, String giro_distribuidor, String direccion_distribuidor, int id_distribuidor, int añoAfiliacion, int telefono) {
        this.nombre_distribuidor = nombre_distribuidor;
        this.giro_distribuidor = giro_distribuidor;
        this.direccion_distribuidor = direccion_distribuidor;
        this.id_distribuidor = id_distribuidor;
        this.añoAfiliacion = añoAfiliacion;
        this.telefono = telefono;
    }

    public String getNombre_distribuidor() {
        return nombre_distribuidor;
    }

    public void setNombre_distribuidor(String nombre_distribuidor) {
        this.nombre_distribuidor = nombre_distribuidor;
    }

    public String getGiro_distribuidor() {
        return giro_distribuidor;
    }

    public void setGiro_distribuidor(String giro_distribuidor) {
        this.giro_distribuidor = giro_distribuidor;
    }

    public String getDireccion_distribuidor() {
        return direccion_distribuidor;
    }

    public void setDireccion_distribuidor(String direccion_distribuidor) {
        this.direccion_distribuidor = direccion_distribuidor;
    }

    public int getId_distribuidor() {
        return id_distribuidor;
    }

    public void setId_distribuidor(int id_distribuidor) {
        this.id_distribuidor = id_distribuidor;
    }

    public int getAñoAfiliacion() {
        return añoAfiliacion;
    }

    public void setAñoAfiliacion(int añoAfiliacion) {
        this.añoAfiliacion = añoAfiliacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
