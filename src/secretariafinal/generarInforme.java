/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretariafinal;

import secretariafinal.menu;
import secretariafinal.metodos;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import secretariafinal.ExportarExcel;

/**
 *
 * @author Familia Hernandez
 */
public class generarInforme extends javax.swing.JFrame {

    ResultSet rs = null;
    /**
     * Creates new form generarInforme
     */
    DefaultComboBoxModel modelotema = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloalumno = new DefaultComboBoxModel();
    metodos metod = new metodos();

    DefaultTableModel modelotabla = new DefaultTableModel();
    metodos mos = new metodos();
 ExportarExcel obj;
    public generarInforme() {

        initComponents();

   this.setLocationRelativeTo(rootPane);

        setTitle(" Departamento de Economia");

        modelotabla.addColumn("N. de carnet");
        modelotabla.addColumn("Nombre");
        modelotabla.addColumn("Tema");
        modelotabla.addColumn("Fecha Inicio");
        modelotabla.addColumn("Fecha Final");
        modelotabla.addColumn("Docente Director");
        tblmostrar.setModel(modelotabla);

        rs = metod.llenarTema();

        modelotema.addElement("seleccione");

        try {
            while (rs.next()) {
                modelotema.addElement(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
        cmbtemas.setModel(modelotema);

    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbtemas = new javax.swing.JComboBox<>();
        btnbuscarpersonas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmostrar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        dfg = new javax.swing.JLabel();
        txtciclo = new javax.swing.JLabel();
        txtanio = new javax.swing.JLabel();
        txtcarrera = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcoordinador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Temas:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        cmbtemas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(cmbtemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 640, -1));

        btnbuscarpersonas.setBackground(new java.awt.Color(51, 51, 51));
        btnbuscarpersonas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscarpersonas.setForeground(new java.awt.Color(240, 240, 240));
        btnbuscarpersonas.setText("Añadir");
        btnbuscarpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarpersonasActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscarpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 120, 40));

        tblmostrar.setModel(modelotabla);
        jScrollPane1.setViewportView(tblmostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1340, 210));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Convertir a Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 180, 40));

        btnregresar.setBackground(new java.awt.Color(51, 51, 51));
        btnregresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregresar.setForeground(new java.awt.Color(240, 240, 240));
        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 120, 40));

        dfg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dfg.setForeground(new java.awt.Color(240, 240, 240));
        dfg.setText("INSCRIPCIÓN DE PROCESO DE GRADO");
        getContentPane().add(dfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 400, 40));

        txtciclo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtciclo.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(txtciclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 90, 40));

        txtanio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtanio.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(txtanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 90, 40));

        txtcarrera.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcarrera.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(txtcarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 530, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Coordinador General:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        txtcoordinador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcoordinador.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(txtcoordinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 350, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Ciclo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/red-backgrounds-wallpaper-1280x1024.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 830));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/red-backgrounds-wallpaper-1280x1024.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -110, 1290, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarpersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarpersonasActionPerformed
        // TODO add your handling code here:
     
        modeloalumno.removeAllElements();

        String tem = String.valueOf(this.cmbtemas.getSelectedItem());
        
        rs=metod.traerCarrera(tem);
        try {
            while (rs.next()) {
                
              txtcarrera.setText(rs.getString(1));
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);

        }
        if(txtcarrera.getText().equals("1")){
        
        txtcarrera.setText("LICENCIATURA EN MERCADEO INTERNACIONAL");
        }
        else if(txtcarrera.getText().equals("L30802")){
        
        txtcarrera.setText("LICENCIATURA EN CONTADURIA PÚBLICA");
        
        }
        else{
           txtcarrera.setText("LICENCIATURA EN ADMINISTRACION DE EMPRESAS");
        }
        
        
        
       rs = metod.traerciclo(tem);
        try {
            while (rs.next()) {
                txtciclo.setText(rs.getString(1));
                txtanio.setText(rs.getString(2));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);

        }
        
        
       rs = metod.traercoordinador(tem);
        try {
            while (rs.next()) {
                txtcoordinador.setText(rs.getString(1));
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);

        
        }
        String c=txtcoordinador.getText();
 rs = metod.traernombreC(c);
        try {
            while (rs.next()) {
                txtcoordinador.setText(rs.getString(1));
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);

        
        }
        
        
        
        rs = metod.traerDatos(tem);
        
        modeloalumno.addElement("seleccione");

        modelotabla.setRowCount(0);
        try {
            while (rs.next()) {
                String carnet = rs.getString(1);
                String nombrealumno = rs.getString(2);
                String tema = rs.getString(3);
                String fechainicio = rs.getString(4);
                String fechafinal = rs.getString(5);
                String director = rs.getString(6);

                Object datos[] = new Object[6];
                datos[0] = carnet;
                datos[1] = nombrealumno;
                datos[2] = tema;
                datos[3] = fechainicio;
                datos[4] = fechafinal;
                datos[5] = director;
                modelotabla.addRow(datos);
                tblmostrar.setModel(modelotabla);
            
            }
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
         }
        
        


    }//GEN-LAST:event_btnbuscarpersonasActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
       menu  regresar=new  menu();
    regresar.setVisible(true);
    dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            obj = new  ExportarExcel();
            obj.exportarExcel(tblmostrar);
        } catch (IOException ex) {
            Logger.getLogger(generarInforme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(generarInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generarInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generarInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generarInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generarInforme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarpersonas;
    private javax.swing.JButton btnregresar;
    private javax.swing.JComboBox<String> cmbtemas;
    private javax.swing.JLabel dfg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmostrar;
    private javax.swing.JLabel txtanio;
    private javax.swing.JLabel txtcarrera;
    private javax.swing.JLabel txtciclo;
    private javax.swing.JLabel txtcoordinador;
    // End of variables declaration//GEN-END:variables
}
