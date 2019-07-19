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
public class Personas {
    
    String nombre,ape_partern, ape_matern,direccion,correo;
    int rut,telefono,fecha_nacimiento;

    public Personas(String nombre, String ape_partern, String ape_matern, String direccion, String correo, int rut, int telefono, int fecha_nacimiento) {
        this.nombre = nombre;
        this.ape_partern = ape_partern;
        this.ape_matern = ape_matern;
        this.direccion = direccion;
        this.correo = correo;
        this.rut = rut;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe_partern() {
        return ape_partern;
    }

    public void setApe_partern(String ape_partern) {
        this.ape_partern = ape_partern;
    }

    public String getApe_matern() {
        return ape_matern;
    }

    public void setApe_matern(String ape_matern) {
        this.ape_matern = ape_matern;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(int fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    
}
