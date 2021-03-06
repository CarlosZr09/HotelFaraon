/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentación;

import Lógica.ImagenFondo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import java.sql.Connection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import Lógica.conexion;
import Lógica.fCentrarVentana;
import javax.swing.JInternalFrame;

/**
 *
 * @author CARLOS
 */
public class frminicio extends javax.swing.JFrame {

    /**
     * Creates new form frminicio
     */
    public frminicio() {
        initComponents();
        
        escritorio.setBorder(new ImagenFondo());
        this.setExtendedState(frminicio.MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblnombre = new javax.swing.JLabel();
        lblamaterno = new javax.swing.JLabel();
        lblapaterno = new javax.swing.JLabel();
        lblidpersona = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        lblestado = new javax.swing.JLabel();
        btnAcerca = new javax.swing.JButton();
        btnGestion = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblacceso = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblcompleto = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblnombre.setText("jLabel2");

        lblamaterno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblamaterno.setText("jLabel4");

        lblapaterno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblapaterno.setText("jLabel3");

        lblidpersona.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblidpersona.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/CamelloVeryBig.png")).getImage());
        setUndecorated(true);

        escritorio.setBackground(new java.awt.Color(204, 204, 255));
        escritorio.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        escritorio.add(lblestado);
        lblestado.setBounds(130, 180, 120, 0);

        btnAcerca.setBackground(new java.awt.Color(51, 1, 8));
        btnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/acerca.png"))); // NOI18N
        btnAcerca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        btnAcerca.setBorderPainted(false);
        escritorio.add(btnAcerca);
        btnAcerca.setBounds(590, 250, 160, 150);

        btnGestion.setBackground(new java.awt.Color(51, 1, 8));
        btnGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/hotelBig.png"))); // NOI18N
        btnGestion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        btnGestion.setBorderPainted(false);
        btnGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionActionPerformed(evt);
            }
        });
        escritorio.add(btnGestion);
        btnGestion.setBounds(60, 50, 160, 150);

        btnRegistro.setBackground(new java.awt.Color(51, 1, 8));
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/registroBig.png"))); // NOI18N
        btnRegistro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        btnRegistro.setBorderPainted(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        escritorio.add(btnRegistro);
        btnRegistro.setBounds(320, 50, 160, 150);

        btnConsultas.setBackground(new java.awt.Color(51, 1, 8));
        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/consultar.png"))); // NOI18N
        btnConsultas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        btnConsultas.setBorderPainted(false);
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        escritorio.add(btnConsultas);
        btnConsultas.setBounds(590, 50, 160, 150);

        btnAñadir.setBackground(new java.awt.Color(51, 1, 8));
        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/añadir.png"))); // NOI18N
        btnAñadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        btnAñadir.setBorderPainted(false);
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        escritorio.add(btnAñadir);
        btnAñadir.setBounds(60, 250, 160, 150);

        btnReportes.setBackground(new java.awt.Color(51, 1, 8));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reportes.png"))); // NOI18N
        btnReportes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        btnReportes.setBorderPainted(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        escritorio.add(btnReportes);
        btnReportes.setBounds(330, 250, 160, 150);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACERCA D'");
        escritorio.add(jLabel1);
        jLabel1.setBounds(600, 410, 160, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GESTION");
        escritorio.add(jLabel2);
        jLabel2.setBounds(70, 210, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTROS");
        escritorio.add(jLabel3);
        jLabel3.setBounds(320, 210, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONSULTAS");
        escritorio.add(jLabel4);
        jLabel4.setBounds(590, 210, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AÑADIR");
        escritorio.add(jLabel5);
        jLabel5.setBounds(80, 410, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("REPORTES");
        escritorio.add(jLabel6);
        jLabel6.setBounds(340, 410, 149, 30);

        jPanel1.setBackground(new java.awt.Color(153, 238, 145));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setOpaque(false);

        lblacceso.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblacceso.setForeground(new java.awt.Color(255, 255, 255));
        lblacceso.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        escritorio.add(jPanel1);
        jPanel1.setBounds(50, 480, 420, 40);

        jPanel2.setBackground(new java.awt.Color(149, 219, 197));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setOpaque(false);

        lblcompleto.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblcompleto.setForeground(new java.awt.Color(255, 255, 255));
        lblcompleto.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblcompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblcompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        escritorio.add(jPanel2);
        jPanel2.setBounds(50, 516, 420, 34);

        btnSalir.setBackground(new java.awt.Color(51, 1, 8));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salir_2.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        escritorio.add(btnSalir);
        btnSalir.setBounds(480, 480, 70, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private Connection connection=new conexion().conectar();
        //METODO PARA CENTRAR VENTANA
        public void CentrarVentana(JInternalFrame internalFrame){
        int x =(escritorio.getWidth()/2-internalFrame.getWidth()/2);
        int y =(escritorio.getHeight()/2-internalFrame.getHeight()/2);
        if(internalFrame.isShowing()){
            internalFrame.setLocation(x,y);
            
        }else{
            escritorio.add(internalFrame);
            internalFrame.setLocation(x,y);
            internalFrame.show();
           
        }
        }
    private void btnGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionActionPerformed
        frmvistaGestion form = new frmvistaGestion();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnGestionActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        frmvistaRegistro form = new frmvistaRegistro();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        frmvistaConsulta form = new frmvistaConsulta();
        form.toFront(); 
        form.setVisible(true);
        

    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        frmtrabajador form = new frmtrabajador();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        CentrarVentana(form);
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
   frmvistaReporte form = new frmvistaReporte();
  // escritorio.add(form);
   //form.toFront();
   form.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
     frmusuariologin form  = new frmusuariologin();
     form.setVisible(true);
     dispose();
     
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frminicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcerca;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnGestion;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblamaterno;
    public static javax.swing.JLabel lblapaterno;
    public static javax.swing.JLabel lblcompleto;
    private javax.swing.JLabel lblestado;
    public static javax.swing.JLabel lblidpersona;
    public static javax.swing.JLabel lblnombre;
    // End of variables declaration//GEN-END:variables

}
