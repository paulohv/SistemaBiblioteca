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
public class Libro extends Autor{
    
    String titulo,editorial,estado,idioma;
    int codigo,fecha_publicacion,precio,ISBN,numero_pag;

    public Libro(String titulo, String editorial, String estado, String idioma, int codigo, int fecha_publicacion, int precio, int ISBN, int numero_pag, String nombre, String apellido, String nacionalidad) {
        super(nombre, apellido, nacionalidad);
        this.titulo = titulo;
        this.editorial = editorial;
        this.estado = estado;
        this.idioma = idioma;
        this.codigo = codigo;
        this.fecha_publicacion = fecha_publicacion;
        this.precio = precio;
        this.ISBN = ISBN;
        this.numero_pag = numero_pag;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(int fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumero_pag() {
        return numero_pag;
    }

    public void setNumero_pag(int numero_pag) {
        this.numero_pag = numero_pag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
}
