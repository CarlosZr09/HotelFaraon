/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentación;

import Datos.vhabitacion;
import Datos.vreserva;
import Lógica.fhabitacion;
import Lógica.flimpieza;
import Lógica.freserva;
import static Presentación.frminicio.escritorio;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Locale;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author BryvnPaulCG
 */
public class frmlimpieza extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmreserva
     */
    
    public frmlimpieza() {
        initComponents();
        mostrar("");
        inhabilitar();
       ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
       /* frmreserva m = new frmreserva();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        m.show();*/
      
     //   frmreserva.setUI(null);
    }
    
    private String accion = "guardar";
    public static int idusuario;
    void obtenerEstado(){
        //PARA EL 2DO PISO
        //201
        try {
              if("Limpiar".equals(tablalistado.getValueAt(0,8).toString()))
            {
            btnh201.setText(tablalistado.getValueAt(0,1).toString());
            jlb201.setText(tablalistado.getValueAt(0,8).toString());
            btnh201.setBackground(Color.blue);
            }
              else{
                          btnh201.setText(tablalistado.getValueAt(0,1).toString());
                          btnh201.setEnabled(false);
                          jlb201.setText(tablalistado.getValueAt(0,8).toString());

              }
                    
        } catch (Exception e) {
        }
    //202
      try {
        if("Limpiar".equals(tablalistado.getValueAt(1,8).toString()))
            {
            btnh202.setText(tablalistado.getValueAt(1,1).toString());
            jlb202.setText(tablalistado.getValueAt(1,8).toString());
            btnh202.setBackground(Color.blue);
            
            }
        else {
            btnh202.setText(tablalistado.getValueAt(1,1).toString());
            btnh202.setEnabled(false);
            jlb202.setText(tablalistado.getValueAt(1,8).toString());
        }
          }catch (Exception e){
                    btnh202.setEnabled(false);
                 }
      //203
        try {
        if("Limpiar".equals(tablalistado.getValueAt(2,8).toString()))
            {
            btnh203.setText(tablalistado.getValueAt(2,1).toString());
            jlb203.setText("Limpiar");
            btnh203.setBackground(Color.blue);
            }
        else{
            btnh203.setText(tablalistado.getValueAt(2,1).toString());
            btnh203.setEnabled(false);
            jlb203.setText(tablalistado.getValueAt(2,8).toString());
            }
        }catch (Exception e){
                    btnh203.setEnabled(false);
                 }
        //204
        try {
        if("Limpiar".equals(tablalistado.getValueAt(3,8).toString()))
            {
            btnh204.setText(tablalistado.getValueAt(3,1).toString());
            jlb204.setText("Limpiar");
            btnh204.setBackground(Color.blue);
            }
        else{
            btnh204.setText(tablalistado.getValueAt(3,1).toString());
            jlb204.setText(tablalistado.getValueAt(3,8).toString());
            btnh204.setEnabled(false);
        }
        }catch (Exception e){
                    btnh204.setEnabled(false);
                 }
        //205
        try {
        if("Limpiar".equals(tablalistado.getValueAt(4,8).toString()))
            {
            btnh205.setText(tablalistado.getValueAt(4,1).toString());
            jlb205.setText("Limpiar");
            btnh205.setBackground(Color.blue);
            }
        else{
            btnh205.setText(tablalistado.getValueAt(4,1).toString());
            jlb205.setText(tablalistado.getValueAt(4,1).toString());
            btnh205.setEnabled(false);
        }
            }catch (Exception e){
                    btnh205.setEnabled(false);
                 }
        
       //PARA EL 3ER PISO
        try {
        if("Limpiar".equals(tablalistado.getValueAt(5,8).toString()))
            {
            btnh301.setText(tablalistado.getValueAt(5,1).toString());
            jlb301.setText("Limpiar");
            btnh301.setBackground(Color.blue);
            }
        else{
            btnh301.setText(tablalistado.getValueAt(5,1).toString());
            jlb301.setText(tablalistado.getValueAt(5,8).toString());
            btnh301.setEnabled(false);
            
        }}catch (Exception e){
                    btnh301.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(6,8).toString()))
            {
            btnh302.setText(tablalistado.getValueAt(6,1).toString());
            jlb302.setText("Limpiar");
            btnh302.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh302.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(7,8).toString()))
            {
            btnh303.setText(tablalistado.getValueAt(7,1).toString());
            jlb303.setText("Limpiar");
            btnh303.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh303.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(8,8).toString()))
            {
            btnh304.setText(tablalistado.getValueAt(8,1).toString());
            jlb304.setText("Limpiar");
            btnh304.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh304.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(9,8).toString()))
            {
            btnh305.setText(tablalistado.getValueAt(9,1).toString());
            jlb305.setText("Limpiar");
            btnh305.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh305.setEnabled(false);
                 }      
        //PARA 4TO PISO
        try {
        if("Limpiar".equals(tablalistado.getValueAt(10,8).toString()))
            {
            btnh401.setText(tablalistado.getValueAt(10,1).toString());
            jlb401.setText("Limpiar");
            btnh401.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh401.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(10,8).toString()))
            {
            btnh402.setText(tablalistado.getValueAt(10,1).toString());
            jlb402.setText("Limpiar");
            btnh402.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh402.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(11,8).toString()))
            {
            btnh403.setText(tablalistado.getValueAt(11,1).toString());
            jlb403.setText("Limpiar");
            btnh403.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh403.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(12,8).toString()))
            {
            btnh404.setText(tablalistado.getValueAt(12,1).toString());
            jlb404.setText("Limpiar");
            btnh404.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh404.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(13,8).toString()))
            {
            btnh405.setText(tablalistado.getValueAt(13,1).toString());
            jlb405.setText("Limpiar");
            btnh405.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh405.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(14,8).toString()))
            {
            btnh406.setText(tablalistado.getValueAt(14,1).toString());
            jlb406.setText("Limpiar");
            btnh406.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh406.setEnabled(false);
                 }      
        //PARA 4TO PISO
        try {
        if("Limpiar".equals(tablalistado.getValueAt(15,8).toString()))
            {
            btnh501.setText(tablalistado.getValueAt(15,1).toString());
            jlb501.setText("Limpiar");
            btnh501.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh501.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(16,8).toString()))
            {
            btnh502.setText(tablalistado.getValueAt(16,1).toString());
            jlb502.setText("Limpiar");
            btnh502.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh502.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(17,8).toString()))
            {
            btnh503.setText(tablalistado.getValueAt(17,1).toString());
            jlb503.setText("Limpiar");
            btnh503.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh503.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(18,8).toString()))
            {
            btnh504.setText(tablalistado.getValueAt(18,1).toString());
            jlb504.setText("Limpiar");
            btnh504.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh504.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(19,8).toString()))
            {
            btnh505.setText(tablalistado.getValueAt(19,1).toString());
            jlb505.setText("Limpiar");
            btnh505.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh505.setEnabled(false);
                 }
        try {
        if("Limpiar".equals(tablalistado.getValueAt(20,8).toString()))
            {
            btnh506.setText(tablalistado.getValueAt(20,1).toString());
            jlb506.setText("Limpiar");
            btnh506.setBackground(Color.blue);
            }}catch (Exception e){
                    btnh506.setEnabled(false);
                 }     
    }
    
    void ocultar_columnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(3).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(3).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(3).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(5).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(5).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(5).setPreferredWidth(0);
    }

    void inhabilitar() {
        txtidreserva.setVisible(false);
        txtidhabitacion.setVisible(false);
        txtidcliente.setVisible(false);
        txtidtrabajador.setVisible(false);
        
        txtnumero.setEnabled(false);
        txtcliente.setEnabled(false);
        txttrabajador.setEnabled(false);
       
        txtfecha.setEnabled(false);
//        dcfecha_reserva.setEnabled(false);
        txtHoraEntrada.setEnabled(false);
        txtHoraSalida.setEnabled(false);
        
        

        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btnbuscacliente.setEnabled(false);
        
        txtfecha.setText("");
        txtidreserva.setText("");
        txtidcliente.setText("");
        txtnumero.setText("");
        txtcliente.setText("");
        txtHoraEntrada.setText("");
        txtHoraSalida.setText("");
        txtidhabitacion.setText("");
        

    }

    void habilitar() {
        
        txtidreserva.setVisible(false);
        txtidhabitacion.setVisible(false);
        txtidcliente.setVisible(false);
        txtidtrabajador.setVisible(false);
        
        txtnumero.setEnabled(false);
        txtcliente.setEnabled(false);
        txttrabajador.setEnabled(false);
        
        
        
//        dcfecha_reserva.setEnabled(true);
        txtHoraEntrada.setEnabled(true);
        txtHoraSalida.setEnabled(true);
        txtfecha.setEnabled(true);
      

        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btnbuscacliente.setEnabled(true);
        
        
        txtidreserva.setText("");
        txtidcliente.setText("");
        txtnumero.setText("");
        txtcliente.setText("");
        txtHoraEntrada.setText("");
        txtfecha.setText("");
        txtHoraSalida.setText("");
        txtidhabitacion.setText("");
        
        txtHoraSalida.setVisible(false);
        jLabel10.setVisible(false);
        txtfecha.setText(fecha());
        btnguardar.setText("Guardar");
        accion = "guardar";

    }
//NOS PERMITE MOSTRAR 
    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fhabitacion func = new fhabitacion();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            ocultar_columnas();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    public String fecha (){
       java.util.Date fecha= new java.util.Date();
       Calendar cal = Calendar.getInstance();
       SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
       return formatofecha.format(fecha);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        txtidreserva = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidhabitacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        txtnumero = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        txtcliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtidtrabajador = new javax.swing.JTextField();
        txttrabajador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnbuscacliente = new javax.swing.JButton();
        txtHoraEntrada = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
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
        btnh201 = new javax.swing.JButton();
        jlb201 = new javax.swing.JLabel();
        btnh202 = new javax.swing.JButton();
        jlb202 = new javax.swing.JLabel();
        btnh203 = new javax.swing.JButton();
        jlb203 = new javax.swing.JLabel();
        btnh204 = new javax.swing.JButton();
        jlb204 = new javax.swing.JLabel();
        btnh205 = new javax.swing.JButton();
        jlb205 = new javax.swing.JLabel();
        jlblIcon = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("RESERVA");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)), "REGISTRO DE INGRESO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
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
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablalistadoMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tablalistado);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("HABITACIÓN :");

        txtidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhabitacionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("OP. DE LIMPIEZA :");

        btnguardar.setBackground(new java.awt.Color(51, 1, 8));
        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/guardar.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setBorder(new javax.swing.border.MatteBorder(null));
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnguardarMousePressed(evt);
            }
        });
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(51, 1, 8));
        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setBorder(new javax.swing.border.MatteBorder(null));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        txtnumero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnumero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        txtcliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TRABAJADOR :");

        txtidtrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtrabajadorActionPerformed(evt);
            }
        });

        txttrabajador.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txttrabajador.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        txttrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrabajadorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("FECHA :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("HORA ENTRADA :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("HORA SALIDAD :");

        btnbuscacliente.setBackground(new java.awt.Color(204, 255, 204));
        btnbuscacliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconmonstr-cloud-32-32.png"))); // NOI18N
        btnbuscacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaclienteActionPerformed(evt);
            }
        });

        txtHoraEntrada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHoraEntrada.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        txtHoraSalida.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHoraSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        txtHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraSalidaActionPerformed(evt);
            }
        });

        txtfecha.setEditable(false);
        txtfecha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtfecha.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel10))
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtfecha, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtHoraEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtidtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(btnbuscacliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jpnlListaHab.setBackground(new java.awt.Color(255, 255, 153));
        jpnlListaHab.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)), "LISTADO DE HABIACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jpnlListaHab.setEnabled(false);
        jpnlListaHab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpnlListaHabKeyPressed(evt);
            }
        });

        btnh305.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh305.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh305MousePressed(evt);
            }
        });
        btnh305.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh305ActionPerformed(evt);
            }
        });

        jlb301.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh301.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh301.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh301MousePressed(evt);
            }
        });
        btnh301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh301ActionPerformed(evt);
            }
        });

        btnh302.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh302.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh302MousePressed(evt);
            }
        });
        btnh302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh302ActionPerformed(evt);
            }
        });

        jlb302.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        jlb303.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh303.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh303.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh303MousePressed(evt);
            }
        });
        btnh303.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh303ActionPerformed(evt);
            }
        });

        jlb304.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh304.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh304.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh304MousePressed(evt);
            }
        });
        btnh304.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh304ActionPerformed(evt);
            }
        });

        jlb305.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh405.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh405.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh405MousePressed(evt);
            }
        });
        btnh405.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh405ActionPerformed(evt);
            }
        });

        jlb501.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

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

        btnh402.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh402.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh402MousePressed(evt);
            }
        });
        btnh402.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh402ActionPerformed(evt);
            }
        });

        jlb503.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh403.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh403.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh403MousePressed(evt);
            }
        });
        btnh403.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh403ActionPerformed(evt);
            }
        });

        jlb504.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh404.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh404.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh404MousePressed(evt);
            }
        });
        btnh404.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh404ActionPerformed(evt);
            }
        });

        jlb505.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh406.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh406.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh406MousePressed(evt);
            }
        });
        btnh406.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh406ActionPerformed(evt);
            }
        });

        jlb506.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh504.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh504.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh504MousePressed(evt);
            }
        });
        btnh504.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh504ActionPerformed(evt);
            }
        });

        btnh506.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh506.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh506MousePressed(evt);
            }
        });
        btnh506.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh506ActionPerformed(evt);
            }
        });

        jlb401.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        jlb402.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh505.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh505.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh505MousePressed(evt);
            }
        });
        btnh505.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh505ActionPerformed(evt);
            }
        });

        jlb403.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh501.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh501.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh501MousePressed(evt);
            }
        });
        btnh501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh501ActionPerformed(evt);
            }
        });

        jlb404.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh502.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh502.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh502MousePressed(evt);
            }
        });
        btnh502.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh502ActionPerformed(evt);
            }
        });

        jlb405.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh503.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh503.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh503MousePressed(evt);
            }
        });
        btnh503.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh503ActionPerformed(evt);
            }
        });

        jlb406.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh201.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh201.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh201MousePressed(evt);
            }
        });
        btnh201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh201ActionPerformed(evt);
            }
        });

        jlb201.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh202.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh202.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh202MousePressed(evt);
            }
        });
        btnh202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh202ActionPerformed(evt);
            }
        });

        jlb202.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh203.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh203.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh203MousePressed(evt);
            }
        });
        btnh203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh203ActionPerformed(evt);
            }
        });

        jlb203.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh204.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh204.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh204MousePressed(evt);
            }
        });
        btnh204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh204ActionPerformed(evt);
            }
        });

        jlb204.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        btnh205.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        btnh205.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnh205MousePressed(evt);
            }
        });
        btnh205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnh205ActionPerformed(evt);
            }
        });

        jlb205.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

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

        javax.swing.GroupLayout jpnlListaHabLayout = new javax.swing.GroupLayout(jpnlListaHab);
        jpnlListaHab.setLayout(jpnlListaHabLayout);
        jpnlListaHabLayout.setHorizontalGroup(
            jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                        .addComponent(btnh201, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                        .addComponent(jlb201, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6)))
                                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnh202, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jlb202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                        .addComponent(btnh203, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnh204, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                        .addComponent(jlb203, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlb204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnh205, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlb205, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnh301, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb301, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnh302, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jlb302, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnh303, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb303, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnh304, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlb304, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnh305, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlb305, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlb501, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnh501, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(btnh502, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnh503, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(jlb502, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlb503, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlb504, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnh504, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlb505, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnh505, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnh506, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlb506, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlListaHabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlb401, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnh401, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(btnh402, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnh403, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlListaHabLayout.createSequentialGroup()
                                .addComponent(jlb402, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlb403, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlb404, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnh404, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlb405, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnh405, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnh406, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlb406, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jpnlListaHabLayout.setVerticalGroup(
            jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlListaHabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlListaHabLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnh201, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnh202, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnh203, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnh204, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnh205, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb201, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb202, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb203, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb204, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb205, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpnlListaHabLayout.createSequentialGroup()
                            .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnh301, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnh302, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnh303, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnh304, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnh305, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlb301, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlb302, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlb303, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlb304, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlb305, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jlblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnh401, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnh402, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnh404, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnh405, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnh406, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnh403, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb401, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb402, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb403, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb404, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb405)
                    .addComponent(jlb406))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnh501, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnh502, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnh503, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnh504, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnh505, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnh506, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlListaHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb501, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb502, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb503, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb504, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb505, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb506, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnlListaHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnlListaHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhabitacionActionPerformed
        // TODO add your handling code here:
        txtidhabitacion.transferFocus();
    }//GEN-LAST:event_txtidhabitacionActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // AQUI ES PARA LA HORA 
        Calendar cal = Calendar.getInstance();
        String hora1= cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        String hora2= cal.get(cal.HOUR_OF_DAY)+3+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        //String fecha1= cal.get(cal.DAY_OF_MONTH)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        int dia=cal.get(Calendar.DAY_OF_MONTH);
        int mes=cal.get(Calendar.MONTH);
        int año=cal.get(Calendar.YEAR);
       
        txtHoraEntrada.setText(hora1);
        txtHoraSalida.setText(hora2);
        txtfecha.setText(fecha());
    
        if (txtidhabitacion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Seleccionar una Habitación");
            txtidhabitacion.requestFocus();
            return;
        }
        if (txtidcliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Seleccionar un Cliente");
            txtidcliente.requestFocus();
            return;


        }
        

        vreserva dts = new vreserva();
        freserva func = new freserva();
        vhabitacion vh = new vhabitacion();
        fhabitacion fh = new fhabitacion();
        //AQUI EMPIEZA A GUARDAR LOS DATOS
        dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        dts.setIdtrabajador(idusuario);
        
        dts.setDia(dia);
        dts.setMes(mes);
        dts.setAno(año);
        dts.setHora_Entrada(txtHoraEntrada.getText());
        dts.setHora_Salida(txtHoraSalida.getText());

        dts.setTotal_consumos(Double.parseDouble(String.valueOf(0)));
        dts.setCosto_extra(Double.parseDouble(String.valueOf(0)));;
        vh.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
        

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) 
                if(fh.ocupar(vh)){
                
                //ocupamos la Habitación alquilada
                inhabilitar();
                mostrar("");
                JOptionPane.showMessageDialog(rootPane, "La reserva fue registrada satisfactoriamente");
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        inhabilitar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtidtrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtrabajadorActionPerformed

    private void txttrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrabajadorActionPerformed

    private void btnbuscaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaclienteActionPerformed
        // TODO add your handling code here:
        frmvistacliente form= new frmvistacliente();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscaclienteActionPerformed

    private void txtHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraSalidaActionPerformed
      
    }//GEN-LAST:event_txtHoraSalidaActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        txtfecha.transferFocus();
    }//GEN-LAST:event_txtfechaActionPerformed

    private void btnguardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarMousePressed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMousePressed
        if (evt.getClickCount() == 2) {
            int fila= tablalistado.getSelectedRow();
            String cod;
            String valor;

            cod=tablalistado.getValueAt(fila, 0).toString();
            valor=tablalistado.getValueAt(fila, 1).toString();

            frmreserva.txtidhabitacion.setText(cod);
            frmreserva.txtnumero.setText(valor);
            this.dispose();

        }
    }//GEN-LAST:event_tablalistadoMousePressed

    private void btnh305MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh305MousePressed

    }//GEN-LAST:event_btnh305MousePressed

    private void btnh305ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh305ActionPerformed
        habilitar();
        txtidhabitacion.setText("10");
        txtnumero.setText("305");
    }//GEN-LAST:event_btnh305ActionPerformed

    private void btnh301MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh301MousePressed

    }//GEN-LAST:event_btnh301MousePressed

    private void btnh301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh301ActionPerformed
        habilitar();
        txtidhabitacion.setText("6");
        txtnumero.setText("301");
    }//GEN-LAST:event_btnh301ActionPerformed

    private void btnh302MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh302MousePressed

    }//GEN-LAST:event_btnh302MousePressed

    private void btnh302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh302ActionPerformed
        habilitar();
        txtidhabitacion.setText("7");
        txtnumero.setText("302");
    }//GEN-LAST:event_btnh302ActionPerformed

    private void btnh303MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh303MousePressed

    }//GEN-LAST:event_btnh303MousePressed

    private void btnh303ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh303ActionPerformed
        habilitar();
        txtidhabitacion.setText("8");
        txtnumero.setText("303");
    }//GEN-LAST:event_btnh303ActionPerformed

    private void btnh304MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh304MousePressed

    }//GEN-LAST:event_btnh304MousePressed

    private void btnh304ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh304ActionPerformed
        habilitar();
        txtidhabitacion.setText("9");
        txtnumero.setText("304");
    }//GEN-LAST:event_btnh304ActionPerformed

    private void btnh405MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh405MousePressed

    }//GEN-LAST:event_btnh405MousePressed

    private void btnh405ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh405ActionPerformed
        habilitar();
        txtidhabitacion.setText("15");
        txtnumero.setText("405");
    }//GEN-LAST:event_btnh405ActionPerformed

    private void btnh401MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh401MousePressed

    }//GEN-LAST:event_btnh401MousePressed

    private void btnh401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh401ActionPerformed
        habilitar();
        txtidhabitacion.setText("11");
        txtnumero.setText("401");
    }//GEN-LAST:event_btnh401ActionPerformed

    private void btnh402MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh402MousePressed

    }//GEN-LAST:event_btnh402MousePressed

    private void btnh402ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh402ActionPerformed
        habilitar();
        txtidhabitacion.setText("12");
        txtnumero.setText("402");
    }//GEN-LAST:event_btnh402ActionPerformed

    private void btnh403MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh403MousePressed

    }//GEN-LAST:event_btnh403MousePressed

    private void btnh403ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh403ActionPerformed
        habilitar();
        txtidhabitacion.setText("13");
        txtnumero.setText("403");
    }//GEN-LAST:event_btnh403ActionPerformed

    private void btnh404MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh404MousePressed

    }//GEN-LAST:event_btnh404MousePressed

    private void btnh404ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh404ActionPerformed
        habilitar();
        txtidhabitacion.setText("14");
        txtnumero.setText("404");
    }//GEN-LAST:event_btnh404ActionPerformed

    private void btnh406MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh406MousePressed

    }//GEN-LAST:event_btnh406MousePressed

    private void btnh406ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh406ActionPerformed
        habilitar();
        txtidhabitacion.setText("16");
        txtnumero.setText("406");
    }//GEN-LAST:event_btnh406ActionPerformed

    private void btnh504MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh504MousePressed

    }//GEN-LAST:event_btnh504MousePressed

    private void btnh504ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh504ActionPerformed
        habilitar();
        txtidhabitacion.setText("20");
        txtnumero.setText("504");
    }//GEN-LAST:event_btnh504ActionPerformed

    private void btnh506MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh506MousePressed

    }//GEN-LAST:event_btnh506MousePressed

    private void btnh506ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh506ActionPerformed
        habilitar();
        txtidhabitacion.setText("22");
        txtnumero.setText("506");
    }//GEN-LAST:event_btnh506ActionPerformed

    private void btnh505MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh505MousePressed

    }//GEN-LAST:event_btnh505MousePressed

    private void btnh505ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh505ActionPerformed
        habilitar();
        txtidhabitacion.setText("21");
        txtnumero.setText("505");
    }//GEN-LAST:event_btnh505ActionPerformed

    private void btnh501MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh501MousePressed

    }//GEN-LAST:event_btnh501MousePressed

    private void btnh501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh501ActionPerformed
        habilitar();
        txtidhabitacion.setText("17");
        txtnumero.setText("501");
    }//GEN-LAST:event_btnh501ActionPerformed

    private void btnh502MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh502MousePressed

    }//GEN-LAST:event_btnh502MousePressed

    private void btnh502ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh502ActionPerformed
        habilitar();
        txtidhabitacion.setText("18");
        txtnumero.setText("502");
    }//GEN-LAST:event_btnh502ActionPerformed

    private void btnh503MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh503MousePressed

    }//GEN-LAST:event_btnh503MousePressed

    private void btnh503ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh503ActionPerformed
        habilitar();
        txtidhabitacion.setText("19");
        txtnumero.setText("503");
    }//GEN-LAST:event_btnh503ActionPerformed

    private void btnh201MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh201MousePressed

    }//GEN-LAST:event_btnh201MousePressed

    private void btnh201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh201ActionPerformed
        habilitar();
        txtidhabitacion.setText("1");
        txtnumero.setText("201");
    }//GEN-LAST:event_btnh201ActionPerformed

    private void btnh202MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh202MousePressed

    }//GEN-LAST:event_btnh202MousePressed

    private void btnh202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh202ActionPerformed
        habilitar();
        txtidhabitacion.setText("2");
        txtnumero.setText("202");
    }//GEN-LAST:event_btnh202ActionPerformed

    private void btnh203MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh203MousePressed

    }//GEN-LAST:event_btnh203MousePressed

    private void btnh203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh203ActionPerformed
        habilitar();
        txtidhabitacion.setText("3");
        txtnumero.setText("203");
    }//GEN-LAST:event_btnh203ActionPerformed

    private void btnh204MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh204MousePressed

    }//GEN-LAST:event_btnh204MousePressed

    private void btnh204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh204ActionPerformed
        habilitar();
        txtidhabitacion.setText("4");
        txtnumero.setText("204");
    }//GEN-LAST:event_btnh204ActionPerformed

    private void btnh205MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnh205MousePressed

    }//GEN-LAST:event_btnh205MousePressed

    private void btnh205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnh205ActionPerformed
        habilitar();
        txtidhabitacion.setText("5");
        txtnumero.setText("205");
    }//GEN-LAST:event_btnh205ActionPerformed

    private void jlblIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblIconMousePressed
        dispose();
    }//GEN-LAST:event_jlblIconMousePressed

    private void jlblIconKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlblIconKeyPressed

    }//GEN-LAST:event_jlblIconKeyPressed

    private void jpnlListaHabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpnlListaHabKeyPressed
        //  if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            // this.dispose();
            //}
    }//GEN-LAST:event_jpnlListaHabKeyPressed

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
            java.util.logging.Logger.getLogger(frmreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmreserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscacliente;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
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
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSalida;
    public static javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtfecha;
    public static javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidreserva;
    public static javax.swing.JTextField txtidtrabajador;
    public static javax.swing.JTextField txtnumero;
    public static javax.swing.JTextField txttrabajador;
    // End of variables declaration//GEN-END:variables
}
