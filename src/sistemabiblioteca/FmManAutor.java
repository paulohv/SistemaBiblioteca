/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabiblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author MatyWais
 */
public class FmManAutor extends javax.swing.JFrame {

    /**
     * Creates new form FmManCliente
     */
    public FmManAutor() {
        initComponents();
        Limpiar();
       bloquear();

    }
    Dto.Conexion metodo = new Dto.Conexion();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSeudonimo = new javax.swing.JTextField();
        lblSeudonimo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblnombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btngua = new javax.swing.JButton();
        btneli = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        txtApellidos = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutor = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(626, 420));
        getContentPane().setLayout(null);

        txtSeudonimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeudonimoActionPerformed(evt);
            }
        });
        txtSeudonimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeudonimoKeyTyped(evt);
            }
        });
        getContentPane().add(txtSeudonimo);
        txtSeudonimo.setBounds(220, 30, 380, 20);

        lblSeudonimo.setBackground(new java.awt.Color(204, 204, 204));
        lblSeudonimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSeudonimo.setForeground(new java.awt.Color(204, 204, 204));
        lblSeudonimo.setText("Ingrese Seudonimo ");
        getContentPane().add(lblSeudonimo);
        lblSeudonimo.setBounds(220, 10, 130, 17);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        lblnombre.setBackground(new java.awt.Color(204, 204, 204));
        lblnombre.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre.setText("Nombre ");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(220, 50, 58, 16);

        lblApellidos.setBackground(new java.awt.Color(204, 204, 204));
        lblApellidos.setForeground(new java.awt.Color(204, 204, 204));
        lblApellidos.setText("Apellidos ");
        getContentPane().add(lblApellidos);
        lblApellidos.setBounds(220, 90, 70, 16);

        lblFecha.setBackground(new java.awt.Color(204, 204, 204));
        lblFecha.setForeground(new java.awt.Color(204, 204, 204));
        lblFecha.setText("Fecha de Nacimiento ");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(220, 130, 150, 20);

        btngua.setText("Guardar");
        btngua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguaActionPerformed(evt);
            }
        });
        getContentPane().add(btngua);
        btngua.setBounds(330, 350, 80, 29);

        btneli.setText("Eliminar");
        getContentPane().add(btneli);
        btneli.setBounds(510, 350, 80, 29);

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar);
        Limpiar.setBounds(420, 350, 80, 29);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(220, 70, 380, 20);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Back.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(10, 10, 30, 30);

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellidos);
        txtApellidos.setBounds(220, 110, 380, 20);

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        getContentPane().add(txtFecha);
        txtFecha.setBounds(220, 150, 130, 20);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("DD/MM/YYYY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 150, 110, 16);

        tablaAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Seudonimo", "Nombre", "Apellido", "F. Nacimiento"
            }
        ));
        jScrollPane1.setViewportView(tablaAutor);
        if (tablaAutor.getColumnModel().getColumnCount() > 0) {
            tablaAutor.getColumnModel().getColumn(0).setHeaderValue("Seudonimo");
            tablaAutor.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            tablaAutor.getColumnModel().getColumn(2).setHeaderValue("Apellido");
            tablaAutor.getColumnModel().getColumn(3).setHeaderValue("F. Nacimiento");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 190, 360, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumno-lugar-trabajo-reserva-efectos-escritorio-tabla-azul-bla-fondo_75163-97.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -20, 640, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSeudonimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeudonimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeudonimoActionPerformed

    private void txtSeudonimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeudonimoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeudonimoKeyTyped

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Limpiar();
        bloquear();
        // TODO add your handling code here:
    }//GEN-LAST:event_LimpiarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FmMenu usuario = new FmMenu();
        usuario.setVisible(true);
        usuario.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguaActionPerformed
        int i = metodo.GuardarAutor(txtSeudonimo.getText(), txtNombre.getText(), txtApellidos.getText(), txtFecha.getText());
        if (i > 0) {
            JOptionPane.showMessageDialog(this, "Datos Guardados");
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "No Guardo");
            Limpiar();
        }
    }//GEN-LAST:event_btnguaActionPerformed

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyTyped

    /**
         * @param args the command line arguments
         */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FmManAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmManAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmManAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmManAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmManAutor().setVisible(true);
            }
        });
    }

    public void Limpiar() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtFecha.setText("");
        
        txtSeudonimo.setText("");
        txtSeudonimo.grabFocus();
    }

    public void Activar() {
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtFecha.setEnabled(true);
        btngua.setEnabled(true);
        btneli.setEnabled(true);
        txtSeudonimo.setEnabled(false);
        txtNombre.grabFocus();
    }

    public void bloquear() {
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtFecha.setEnabled(false);
        btngua.setEnabled(true);
        btneli.setEnabled(false);
        txtSeudonimo.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btneli;
    private javax.swing.JButton btngua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblSeudonimo;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JTable tablaAutor;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSeudonimo;
    // End of variables declaration//GEN-END:variables
}
