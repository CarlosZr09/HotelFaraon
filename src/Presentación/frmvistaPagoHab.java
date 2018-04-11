/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentación;

import Lógica.fhabitacion;
import Lógica.freserva;
import static Presentación.frminicio.escritorio;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author CARLOS
 */
public class frmvistaPagoHab extends javax.swing.JInternalFrame {
    public static String idreserva;
    public static String cliente;
    private String accion = "guardar";
    public static int idusuario;
   
    
    /**
     * Creates new form frmvistahabitacion
     */
    public frmvistaPagoHab() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        
        //inhabilitar();
         mostrar("");
         mostrar2("");
        obtenerEstado();
        //inhabilitar2();
        
        
    }
    void mostrar2 (String buscar){
        try {
            DefaultTableModel modelo;
            fhabitacion func = new fhabitacion();
            modelo = func.mostrar(buscar);

            tablalistado1.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            freserva func = new freserva();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    void obtenerEstado(){
        //PARA EL 2DO PISO
        try {
             if("Alquiler".equals(tablalistado.getValueAt(0,14).toString()))
            {
            btnh201.setText(tablalistado.getValueAt(0,2).toString());
            jlb201.setText("Ocupado");
            btnh201.setBackground(Color.red);
            }
                    
        } catch (Exception e) {
        btnh201.setEnabled(false);
        }
    
      try {
        if("Alquiler".equals(tablalistado.getValueAt(1,14).toString()))
            {
            btnh202.setText(tablalistado.getValueAt(1,2).toString());
            jlb202.setText("Ocupado");
            btnh202.setBackground(Color.red);
            }}catch (Exception e){
                    btnh202.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(2,14).toString()))
            {
            btnh203.setText(tablalistado.getValueAt(2,2).toString());
            jlb203.setText("Ocupado");
            btnh203.setBackground(Color.red);
            }}catch (Exception e){
                    btnh203.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(3,14).toString()))
            {
            btnh204.setText(tablalistado.getValueAt(3,2).toString());
            jlb204.setText("Ocupado");
            btnh204.setBackground(Color.red);
            }}catch (Exception e){
                    btnh204.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(4,14).toString()))
            {
            btnh205.setText(tablalistado.getValueAt(4,2).toString());
            jlb205.setText("Ocupado");
            btnh205.setBackground(Color.red);
            }}catch (Exception e){
                    btnh205.setEnabled(false);
                 }
        
       //PARA EL 3ER PISO
        try {
        if("Alquiler".equals(tablalistado.getValueAt(5,14).toString()))
            {
            btnh301.setText(tablalistado.getValueAt(5,2).toString());
            jlb301.setText("Ocupado");
            btnh301.setBackground(Color.red);
            }}catch (Exception e){
                    btnh301.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(6,14).toString()))
            {
            btnh302.setText(tablalistado.getValueAt(6,2).toString());
            jlb302.setText("Ocupado");
            btnh302.setBackground(Color.red);
            }}catch (Exception e){
                    btnh302.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(7,14).toString()))
            {
            btnh303.setText(tablalistado.getValueAt(7,2).toString());
            jlb303.setText("Ocupado");
            btnh303.setBackground(Color.red);
            }}catch (Exception e){
                    btnh303.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(8,14).toString()))
            {
            btnh304.setText(tablalistado.getValueAt(8,2).toString());
            jlb304.setText("Ocupado");
            btnh304.setBackground(Color.red);
            }}catch (Exception e){
                    btnh304.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(9,14).toString()))
            {
            btnh305.setText(tablalistado.getValueAt(9,2).toString());
            jlb305.setText("Ocupado");
            btnh305.setBackground(Color.red);
            }}catch (Exception e){
                    btnh305.setEnabled(false);
                 }      
        //PARA 4TO PISO
        try {
        if("Alquiler".equals(tablalistado.getValueAt(10,14).toString()))
            {
            btnh401.setText(tablalistado.getValueAt(10,2).toString());
            jlb401.setText("Ocupado");
            btnh401.setBackground(Color.red);
            }}catch (Exception e){
                    btnh401.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(10,14).toString()))
            {
            btnh402.setText(tablalistado.getValueAt(10,2).toString());
            jlb402.setText("Ocupado");
            btnh402.setBackground(Color.red);
            }}catch (Exception e){
                    btnh402.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(11,14).toString()))
            {
            btnh403.setText(tablalistado.getValueAt(11,2).toString());
            jlb403.setText("Ocupado");
            btnh403.setBackground(Color.red);
            }}catch (Exception e){
                    btnh403.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(12,14).toString()))
            {
            btnh404.setText(tablalistado.getValueAt(12,2).toString());
            jlb404.setText("Ocupado");
            btnh404.setBackground(Color.red);
            }}catch (Exception e){
                    btnh404.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(13,14).toString()))
            {
            btnh405.setText(tablalistado.getValueAt(13,2).toString());
            jlb405.setText("Ocupado");
            btnh405.setBackground(Color.red);
            }}catch (Exception e){
                    btnh405.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(14,14).toString()))
            {
            btnh406.setText(tablalistado.getValueAt(14,2).toString());
            jlb406.setText("Ocupado");
            btnh406.setBackground(Color.red);
            }}catch (Exception e){
                    btnh406.setEnabled(false);
                 }      
        //PARA 4TO PISO
        try {
        if("Alquiler".equals(tablalistado.getValueAt(15,14).toString()))
            {
            btnh501.setText(tablalistado.getValueAt(15,2).toString());
            jlb501.setText("Ocupado");
            btnh501.setBackground(Color.red);
            }}catch (Exception e){
                    btnh501.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(16,14).toString()))
            {
            btnh502.setText(tablalistado.getValueAt(16,2).toString());
            jlb502.setText("Ocupado");
            btnh502.setBackground(Color.red);
            }}catch (Exception e){
                    btnh502.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(17,14).toString()))
            {
            btnh503.setText(tablalistado.getValueAt(17,2).toString());
            jlb503.setText("Ocupado");
            btnh503.setBackground(Color.red);
            }}catch (Exception e){
                    btnh503.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(18,14).toString()))
            {
            btnh504.setText(tablalistado.getValueAt(18,2).toString());
            jlb504.setText("Ocupado");
            btnh504.setBackground(Color.red);
            }}catch (Exception e){
                    btnh504.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(19,14).toString()))
            {
            btnh505.setText(tablalistado.getValueAt(19,2).toString());
            jlb505.setText("Ocupado");
            btnh505.setBackground(Color.red);
            }}catch (Exception e){
                    btnh505.setEnabled(false);
                 }
        try {
        if("Alquiler".equals(tablalistado.getValueAt(20,14).toString()))
            {
            btnh506.setText(tablalistado.getValueAt(20,2).toString());
            jlb506.setText("Ocupado");
            btnh506.setBackground(Color.red);
            }}catch (Exception e){
                    btnh506.setEnabled(false);
                 }     
    }
   
   

 
   void inhabilitar()   {
      if(Integer.parseInt(idreserva)!=1){
          btnh201.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=2){
          btnh201.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=3){
          btnh203.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=4){
          btnh204.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=5){
          btnh205.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=6){
          btnh301.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=7){
          btnh302.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=8){
          btnh303.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=9){
          btnh304.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=10){
          btnh305.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=11){
          btnh401.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=12){
          btnh402.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=13){
          btnh403.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=14){
          btnh404.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=15){
          btnh405.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=16){
          btnh406.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=17){
          btnh501.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=18){
          btnh502.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=19){
          btnh503.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=20){
          btnh504.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=21){
          btnh505.setEnabled(false);
      }
      if(Integer.parseInt(idreserva)!=22){
          btnh506.setEnabled(false);
      }
      
  }
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
   public void abrirVentana(){
        frmvistaConsumoPago form = new frmvistaConsumoPago();
        form.toFront();
        form.setVisible(true);
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidtrabajador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado1 = new javax.swing.JTable();
        jpnlListaHab = new javax.swing.JPanel();
        btnh305 = new javax.swing.JButton();
        jlb301 = new javax.swing.JLabel();
        btnh301 = new javax.swing.JButton();
        btnh302 = new javax.swing.JButton();
        jlb302 = new javax.swing.JLabel();
        jlb303 = new javax.swing.JLabel();
        btnh303 = new javax.swing.JButton();
        jlb304 = new javax.swing.JLabel();
        btnh304 = new javax.swing.JButton();
        jlb305 = new javax.swing.JLabel();
        btnh405 = new javax.swing.JButton();
        jlb501 = new javax.swing.JLabel();
        btnh401 = new javax.swing.JButton();
        jlb502 = new javax.swing.JLabel();
        btnh402 = new javax.swing.JButton();
        jlb503 = new javax.swing.JLabel();
        btnh403 = new javax.swing.JButton();
        jlb504 = new javax.swing.JLabel();
        btnh404 = new javax.swing.JButton();
        jlb505 = new javax.swing.JLabel();
        btnh406 = new javax.swing.JButton();
        jlb506 = new javax.swing.JLabel();
        btnh504 = new javax.swing.JButton();
        btnh506 = new javax.swing.JButton();
        jlb401 = new javax.swing.JLabel();
        jlb402 = new javax.swing.JLabel();
        btnh505 = new javax.swing.JButton();
        jlb403 = new javax.swing.JLabel();
        btnh501 = new javax.swing.JButton();
        jlb404 = new javax.swing.JLabel();
        btnh502 = new javax.swing.JButton();
        jlb405 = new javax.swing.JLabel();
        btnh503 = new javax.swing.JButton();
        jlb406 = new javax.swing.JLabel();
        jlb201 = new javax.swing.JLabel();
        btnh201 = new javax.swing.JButton();
        jlb202 = new javax.swing.JLabel();
        btnh203 = new javax.swing.JButton();
        jlb203 = new javax.swing.JLabel();
        btnh204 = new javax.swing.JButton();
        jlb204 = new javax.swing.JLabel();
        btnh205 = new javax.swing.JButton();
        jlb205 = new javax.swing.JLabel();
        jlblIcon = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        btnh202 = new javax.swing.JButton();

        txtidtrabajador.setEditable(false);
        txtidtrabajador.setEnabled(false);

        tablalistado1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablalistado1);

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jpnlListaHab.setBackground(new java.awt.Color(153, 204, 255));
        jpnlListaHab.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)), "HABITACIONES GESTION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jpnlListaHab.setFocusable(false);
        jpnlListaHab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpnlListaHabKeyPressed(evt);
            }
        });

        btnh305.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh305.setFocusable(false);
        btnh305.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh305ActionPerformed(evt);
            }
        });

        jlb301.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb301.setText(" ");
        jlb301.setFocusable(false);

        btnh301.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh301.setFocusable(false);
        btnh301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh301ActionPerformed(evt);
            }
        });

        btnh302.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh302.setFocusable(false);
        btnh302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh302ActionPerformed(evt);
            }
        });

        jlb302.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb302.setText(" ");
        jlb302.setFocusable(false);

        jlb303.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb303.setText(" ");
        jlb303.setFocusable(false);

        btnh303.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh303.setFocusable(false);
        btnh303.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh303ActionPerformed(evt);
            }
        });

        jlb304.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb304.setText(" ");
        jlb304.setFocusable(false);

        btnh304.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh304.setFocusable(false);
        btnh304.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh304ActionPerformed(evt);
            }
        });

        jlb305.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb305.setText(" ");
        jlb305.setFocusable(false);

        btnh405.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh405.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh405ActionPerformed(evt);
            }
        });

        jlb501.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb501.setText(" ");

        btnh401.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh401.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh401MousePressed(evt);
            }
        });
        btnh401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh401ActionPerformed(evt);
            }
        });

        jlb502.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb502.setText(" ");

        btnh402.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh402.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh402ActionPerformed(evt);
            }
        });

        jlb503.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb503.setText(" ");

        btnh403.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh403.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh403ActionPerformed(evt);
            }
        });

        jlb504.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb504.setText(" ");

        btnh404.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh404.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh404ActionPerformed(evt);
            }
        });

        jlb505.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb505.setText(" ");

        btnh406.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh406.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh406ActionPerformed(evt);
            }
        });

        jlb506.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb506.setText(" ");

        btnh504.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh504.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh504ActionPerformed(evt);
            }
        });

        btnh506.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh506.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh506ActionPerformed(evt);
            }
        });

        jlb401.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb401.setText(" ");

        jlb402.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb402.setText(" ");

        btnh505.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh505.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh505ActionPerformed(evt);
            }
        });

        jlb403.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb403.setText(" ");

        btnh501.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh501ActionPerformed(evt);
            }
        });

        jlb404.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb404.setText(" ");

        btnh502.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh502.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh502ActionPerformed(evt);
            }
        });

        jlb405.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb405.setText(" ");

        btnh503.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh503.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh503ActionPerformed(evt);
            }
        });

        jlb406.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb406.setText(" ");

        jlb201.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb201.setText(" ");
        jlb201.setFocusable(false);

        btnh201.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh201.setFocusable(false);
        btnh201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh201ActionPerformed(evt);
            }
        });

        jlb202.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb202.setText(" ");
        jlb202.setFocusable(false);

        btnh203.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh203.setFocusable(false);
        btnh203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh203ActionPerformed(evt);
            }
        });

        jlb203.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb203.setText(" ");
        jlb203.setFocusable(false);

        btnh204.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh204.setFocusable(false);
        btnh204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh204ActionPerformed(evt);
            }
        });

        jlb204.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb204.setText(" ");
        jlb204.setFocusable(false);

        btnh205.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh205.setFocusable(false);
        btnh205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh205ActionPerformed(evt);
            }
        });

        jlb205.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jlb205.setText(" ");
        jlb205.setFocusable(false);

        jlblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logoFaraonSmall.png"))); // NOI18N
        jlblIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblIconMousePressed(evt);
            }
        });
        jlblIcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jlblIconKeyPressed(evt);
            }
        });

        tablalistado.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));
        tablalistado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Habitación", "Cliente", "Trabajador", "Fecha", "H Ingreso", "H Salida", "H Extra", "Día Hot", "Precio", "Estado"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistado);

        btnh202.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh202.setFocusable(false);
        btnh202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh202ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlListaHabLayout = new javax.swing.GroupLayout(jpnlListaHab);
        jpnlListaHab.setLayout(jpnlListaHabLayout);
        jpnlListaHabLayout.setHorizontalGroup(
            jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpnlListaHabLayout.createSequentialGroup()
                            .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb201, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnh301, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlb301, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnh201, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnh202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnh302, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlb302, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlb202, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(btnh203, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jlb203, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(btnh303, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jlb303, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnh204, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(jlb204, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(btnh304, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jlb304, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(btnh205, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jlb205, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnh305, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jlb305, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(10, 10, 10)
                            .addComponent(jlblIcon))
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(btnh401, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnh402, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnh403, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnh404, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btnh405, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btnh406, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(jlb401, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jlb402, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jlb403, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jlb404, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jlb405, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jlb406, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlListaHabLayout.createSequentialGroup()
                            .addComponent(btnh501, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btnh502, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btnh503, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(btnh504, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(btnh505, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(btnh506, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jlb501, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jlb502, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jlb503, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jlb504, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jlb505, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jlb506, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlListaHabLayout.setVerticalGroup(
            jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jlb506))
                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(btnh203, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jlb203)
                                .addGap(0, 0, 0)
                                .addComponent(btnh303, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jlb303))
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(btnh204, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jlb204)
                                .addGap(0, 0, 0)
                                .addComponent(btnh304, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jlb304))
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(btnh205, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jlb205)
                                .addGap(0, 0, 0)
                                .addComponent(btnh305, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jlb305))
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(btnh201, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jlb201)
                                .addGap(0, 0, 0)
                                .addComponent(btnh301, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jlb301))
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(btnh202, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jlb202)
                                .addGap(0, 0, 0)
                                .addComponent(btnh302, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jlb302))
                            .addComponent(jlblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnh403, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnh404, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnh405, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnh406, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnh401, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnh402, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb401)
                            .addComponent(jlb402)
                            .addComponent(jlb403)
                            .addComponent(jlb404)
                            .addComponent(jlb405)
                            .addComponent(jlb406))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnh503, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnh504, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnh505, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnh506, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnh501, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnh502, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb503)
                            .addComponent(jlb504)
                            .addComponent(jlb505)
                            .addComponent(jlb501)
                            .addComponent(jlb502))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlListaHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlListaHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnh401MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh401MousePressed
   if (evt.getClickCount() == 1) {
            frmreserva.txtidhabitacion.setText("11");
            frmreserva.txtnumero.setText("401");
       }
    }//GEN-LAST:event_btnh401MousePressed
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
     
    }//GEN-LAST:event_formKeyPressed

    private void jpnlListaHabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpnlListaHabKeyPressed
     //  if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){ 
       // this.dispose();
//} 
    }//GEN-LAST:event_jpnlListaHabKeyPressed

    private void jlblIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblIconMousePressed
    dispose();
    }//GEN-LAST:event_jlblIconMousePressed

    private void jlblIconKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlblIconKeyPressed

    }//GEN-LAST:event_jlblIconKeyPressed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
      
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnh201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh201ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(0, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(0, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble( tablalistado.getValueAt(0, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(0, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(0, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh201ActionPerformed

    private void btnh202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh202ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(1, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(1, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(1, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(1, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(1, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh202ActionPerformed

    private void btnh203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh203ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(2, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(2, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(2, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(2, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(2, 2).toString();
        abrirVentana();
    }//GEN-LAST:event_btnh203ActionPerformed

    private void btnh204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh204ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(3, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(3, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(3, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(3, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(3, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh204ActionPerformed

    private void btnh205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh205ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(4, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(4, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(4, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(4, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(4, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh205ActionPerformed

    private void btnh301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh301ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(5, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(5, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(5, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(5, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(5, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh301ActionPerformed

    private void btnh302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh302ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(6, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(6, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(6, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(6, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(6, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh302ActionPerformed

    private void btnh303ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh303ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(7, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(7, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(7, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(7, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(7, 2).toString();
        abrirVentana();
    }//GEN-LAST:event_btnh303ActionPerformed

    private void btnh304ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh304ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(8, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(8, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(8, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(8, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(8, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh304ActionPerformed

    private void btnh305ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh305ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(9, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(9, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(9, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(9, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(9, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh305ActionPerformed

    private void btnh501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh501ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(15, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(15, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(15, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(15, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(15, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh501ActionPerformed

    private void btnh502ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh502ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(16, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(16, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(16, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(16, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(16, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh502ActionPerformed

    private void btnh503ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh503ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(17, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(17, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(17, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(17, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(17, 2).toString();
        abrirVentana();
        dispose();        
    }//GEN-LAST:event_btnh503ActionPerformed

    private void btnh504ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh504ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(18, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(18, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(18, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(18, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(18, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh504ActionPerformed

    private void btnh505ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh505ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(19, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(19, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(19, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(19, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(19, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh505ActionPerformed

    private void btnh506ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh506ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(20, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(20, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(20, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(20, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(20, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh506ActionPerformed

    private void btnh401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh401ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(9, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(9, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(9, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(9, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(9, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh401ActionPerformed

    private void btnh402ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh402ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(10, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(10, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(10, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(10, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(10, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh402ActionPerformed

    private void btnh403ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh403ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(11, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(11, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(11, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(11, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(11, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh403ActionPerformed

    private void btnh404ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh404ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(12, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(12, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(12, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(12, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(12, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh404ActionPerformed

    private void btnh405ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh405ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(13, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(13, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(13, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(13, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(13, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh405ActionPerformed

    private void btnh406ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh406ActionPerformed
        frmvistaConsumoPago.idreservaC= tablalistado.getValueAt(14, 0).toString();
        frmvistaConsumoPago.clienteC=tablalistado.getValueAt(14, 4).toString();
        frmvistaConsumoPago.totalreservaP =Double.parseDouble(tablalistado.getValueAt(14, 13).toString());
        frmvistaConsumoPago.idhabitacionP = tablalistado.getValueAt(14, 1).toString();
        frmvistaConsumoPago.habitacionP = tablalistado.getValueAt(14, 2).toString();
        abrirVentana();
        dispose();
    }//GEN-LAST:event_btnh406ActionPerformed
/*void mostrarr(String buscar) {
        try {
            DefaultTableModel modelo;
            fhabitacion func = new fhabitacion();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            ocultar_columnas();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }}
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
            java.util.logging.Logger.getLogger(frmvistaPagoHab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmvistaPagoHab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmvistaPagoHab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmvistaPagoHab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmvistaPagoHab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnh201;
    private javax.swing.JButton btnh202;
    private javax.swing.JButton btnh203;
    private javax.swing.JButton btnh204;
    private javax.swing.JButton btnh205;
    private javax.swing.JButton btnh301;
    private javax.swing.JButton btnh302;
    private javax.swing.JButton btnh303;
    private javax.swing.JButton btnh304;
    private javax.swing.JButton btnh305;
    private javax.swing.JButton btnh401;
    private javax.swing.JButton btnh402;
    private javax.swing.JButton btnh403;
    private javax.swing.JButton btnh404;
    private javax.swing.JButton btnh405;
    private javax.swing.JButton btnh406;
    private javax.swing.JButton btnh501;
    private javax.swing.JButton btnh502;
    private javax.swing.JButton btnh503;
    private javax.swing.JButton btnh504;
    private javax.swing.JButton btnh505;
    private javax.swing.JButton btnh506;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel jlb201;
    private javax.swing.JLabel jlb202;
    private javax.swing.JLabel jlb203;
    private javax.swing.JLabel jlb204;
    private javax.swing.JLabel jlb205;
    private javax.swing.JLabel jlb301;
    private javax.swing.JLabel jlb302;
    private javax.swing.JLabel jlb303;
    private javax.swing.JLabel jlb304;
    private javax.swing.JLabel jlb305;
    private javax.swing.JLabel jlb401;
    private javax.swing.JLabel jlb402;
    private javax.swing.JLabel jlb403;
    private javax.swing.JLabel jlb404;
    private javax.swing.JLabel jlb405;
    private javax.swing.JLabel jlb406;
    private javax.swing.JLabel jlb501;
    private javax.swing.JLabel jlb502;
    private javax.swing.JLabel jlb503;
    private javax.swing.JLabel jlb504;
    private javax.swing.JLabel jlb505;
    private javax.swing.JLabel jlb506;
    private javax.swing.JLabel jlblIcon;
    private javax.swing.JPanel jpnlListaHab;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTable tablalistado1;
    public static javax.swing.JTextField txtidtrabajador;
    // End of variables declaration//GEN-END:variables
}
