/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretariafinal;

import secretariafinal.metodos;
import secretariafinal.EditarDocente;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import secretaria.menu;

/**
 *
 * @author NATANAEL MORENO
 */
public class IngresarDocentes extends javax.swing.JFrame {

    
    // DefaultComboBoxModel<String> modelcodigo=new DefaultComboBoxModel();
    /**
     * Creates new form IngresarDocentes
     */
     ResultSet rs=null;
       int cantidad,mayor;
       private int nombre =150;
        metodos llenar=new metodos();
        boolean encontrado=false;
   
    
    
    public IngresarDocentes() {
        initComponents();
        bloquear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtcodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rbGeneral = new javax.swing.JRadioButton();
        rbAsesor = new javax.swing.JRadioButton();
        btnregresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 123, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 260, -1));

        btnguardar.setBackground(new java.awt.Color(102, 102, 102));
        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(240, 240, 240));
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 140, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Director");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, 20));

        buttonGroup1.add(rbGeneral);
        rbGeneral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbGeneral.setForeground(new java.awt.Color(240, 240, 240));
        rbGeneral.setText("General");
        rbGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGeneralActionPerformed(evt);
            }
        });
        getContentPane().add(rbGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        buttonGroup1.add(rbAsesor);
        rbAsesor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbAsesor.setForeground(new java.awt.Color(240, 240, 240));
        rbAsesor.setText("Asesor");
        rbAsesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAsesorActionPerformed(evt);
            }
        });
        getContentPane().add(rbAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        btnregresar.setBackground(new java.awt.Color(102, 102, 102));
        btnregresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregresar.setForeground(new java.awt.Color(240, 240, 240));
        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 140, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Modificar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 140, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/red-backgrounds-wallpaper-1280x1024.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
      //  modelcodigo.removeAllElements();
       
         if (this.txtnombre.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo nombre", "AVISO DEL SISTEMA", 2);
                this.txtnombre.requestFocus();
                
        } else if (!rbAsesor.isSelected() && !rbGeneral.isSelected()){
                JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una opcion", "AVISO DEL SISTEMA", 2);
         
        
        } else{
            if(rbAsesor.isSelected()){
                llenar.insertarDocente(Integer.parseInt(this.txtcodigo.getText()), this.txtnombre.getText());
                JOptionPane.showMessageDialog(null,"Ingreso exitoso");
            }
            else{ llenar.insertarGeneral(Integer.parseInt(this.txtcodigo.getText()), this.txtnombre.getText());
                JOptionPane.showMessageDialog(null,"Ingreso exitoso");}
        }
         txtcodigo.setText("");
         txtnombre.setText("");
         bloquear();
            
      
         buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
          menu  regresar=new  menu();
    regresar.setVisible(true);
    dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void rbGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGeneralActionPerformed
        // TODO add your handling code here:
         desbloquear();
           rs = llenar.contarRegistros3();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {
                    rs = null;
                    //método en clase Clientes
                    rs = llenar.mayorRegistro3();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;
                        //recuerde que debe completar 5 digitos
                        if (mayor < 10) {
                            txtcodigo.setText("0" + mayor);
                        } else if (mayor < 100) {
                            this.txtcodigo.setText("00" + mayor);
                        } else if (mayor < 1000) {
                            txtcodigo.setText("0" + mayor);
                        } else {
                            txtcodigo.setText("" + mayor);
                        }
                    }
                    txtnombre.requestFocus();
                } else {
                    txtcodigo.setText("0"+1);
                    txtnombre.requestFocus();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
      
      
        
    }//GEN-LAST:event_rbGeneralActionPerformed

    private void rbAsesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAsesorActionPerformed
        // TODO add your handling code here:
      desbloquear();
          rs = null;
        rs = llenar.contarRegistros4();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {
                    rs = null;
                    //método en clase Clientes
                    rs = llenar.mayorRegistro4();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;
                        //recuerde que debe completar 5 digitos
                        if (mayor < 10) {
                            txtcodigo.setText("0" + mayor);
                        } else if (mayor < 100) {
                            this.txtcodigo.setText("00" + mayor);
                        } else if (mayor < 1000) {
                            txtcodigo.setText("0" + mayor);
                        } else {
                            txtcodigo.setText("" + mayor);
                        }
                    }
                    txtnombre.requestFocus();
                } else {
                    txtcodigo.setText("0"+1);
                    txtnombre.requestFocus();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        desbloquear();
    }//GEN-LAST:event_rbAsesorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       EditarDocente  siguiente=new  EditarDocente ();
    siguiente.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
         if (txtnombre.getText().length() == nombre) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

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
            java.util.logging.Logger.getLogger(IngresarDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarDocentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnregresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbAsesor;
    private javax.swing.JRadioButton rbGeneral;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
public void bloquear(){

txtcodigo.setEnabled(false);
txtnombre.setEnabled(false);

}
public void desbloquear(){

txtcodigo.setEnabled(true);
txtnombre.setEnabled(true);
;
}


}
