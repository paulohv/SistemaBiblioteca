/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pauloherrera
 */
public class Conexion {

    public static String user = "root";
    public static String password = "root";
    public static String db = "Sistema_Biblioteca";
    public static String url = "jdbc:mysql://localhost:3306/" + db;
    public static Connection con = null;

    public static Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static String IniciarSesion(String usuario, String contraseña) {
        String busqueda_usuario = null;
        Connection conexion = null;
        try {
            conexion = getConexion();
            String sentencia_buscar = ("SELECT rut,clave FROM usuario WHERE rut = '" + usuario + "' && clave = '" + contraseña + "'");
            login.sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            login.resultado = login.sentencia_preparada.executeQuery();
            if (login.resultado.next()) {
                busqueda_usuario = "usuario encontrado";

            } else {
                busqueda_usuario = "usuario no encontrado";

            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return busqueda_usuario;

    }

    public int Guardar(String rut, String nombre, String apellidos, String nacimiento, String telefono, String direccion, String clave, String tipo) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO usuario (rut,nombre,apellidos,nacimiento,telefono,direccion,clave,tipo) VALUES (?,?,?,?,?,?,?,?)");

        try {
            conexion = getConexion();
            login.sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            login.sentencia_preparada.setString(1, rut);
            login.sentencia_preparada.setString(2, nombre);
            login.sentencia_preparada.setString(3, apellidos);
            login.sentencia_preparada.setString(4, nacimiento);
            login.sentencia_preparada.setString(5, telefono);
            login.sentencia_preparada.setString(6, direccion);
            login.sentencia_preparada.setString(7, clave);
            login.sentencia_preparada.setString(8, tipo);
            
            resultado = login.sentencia_preparada.executeUpdate();
            login.sentencia_preparada.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;

    }

    public int GuardarAutor(String seudonimo, String nombre, String apellidos, String nacimiento) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO autores (seudonimo,nombre,apellidos,nacimiento) VALUES (?,?,?,?)");

        try {
            conexion = getConexion();
            login.sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            login.sentencia_preparada.setString(1, seudonimo);
            login.sentencia_preparada.setString(2, nombre);
            login.sentencia_preparada.setString(3, apellidos);
            login.sentencia_preparada.setString(4, nacimiento);
            resultado = login.sentencia_preparada.executeUpdate();
            login.sentencia_preparada.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;

    }

    public int GuardarCliente(String rut, String nombre, String apellidos, String nacimiento, String direccion,String telefono, String correo) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO cliente (rut,nombre,apellidos,nacimiento,direccion,telefono,correo) VALUES (?,?,?,?,?,?,?)");

        try {
            conexion = getConexion();
            login.sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            login.sentencia_preparada.setString(1, rut);
            login.sentencia_preparada.setString(2, nombre);
            login.sentencia_preparada.setString(3, apellidos);
            login.sentencia_preparada.setString(4, nacimiento);
            login.sentencia_preparada.setString(6, direccion);
            login.sentencia_preparada.setString(5, telefono);
            login.sentencia_preparada.setString(7, correo);
            resultado = login.sentencia_preparada.executeUpdate();
            login.sentencia_preparada.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;

    }
    
    public int GuardarLibro(String codigo, String nombre, String editorial, String autor, String idioma) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO libros (codigo,nombre,editorial,autor,idioma) VALUES (?,?,?,?,?)");

        try {
            conexion = getConexion();
            login.sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            login.sentencia_preparada.setString(1, codigo);
            login.sentencia_preparada.setString(2, nombre);
            login.sentencia_preparada.setString(3, editorial);
            login.sentencia_preparada.setString(4, autor);
            login.sentencia_preparada.setString(5, idioma);
            
            
            resultado = login.sentencia_preparada.executeUpdate();
            login.sentencia_preparada.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;

    }
    
}
