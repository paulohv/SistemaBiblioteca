/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabiblioteca;

import Dto.Conexion;

/**
 *
 * @author adminclases
 */
public class SistemaBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heresa
        FmLogin login=new FmLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        Conexion connection = new Conexion();
        
        System.out.println(connection.getConexion());
        
    }
    
}
