/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lógica;

import Datos.vhabitacion;
import Datos.vproducto;
import Datos.vreserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CARLOS
 */
public class freserva {
    
   private conexion mysql=new conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Idhabitación","Numero","idcliente","Cliente","idtrabajador","Trabajador","dia","mes","ano","Hora_ingreso","Hora_salida","Salida_real","Costo","Estado","Total_Consumos","Total Extras"};
       
       String [] registro =new String [17];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
           // sSQL="select  from reserva r inner join habitación on r.idhabitacion=h where r.fecha_reserva like '%"+buscar +"%' order by idreserva desc";
            
        sSQL="select r.idreserva,r.idhabitacion,h.numero,r.idcliente,"+
              "(select nombre from persona where idpersona=r.idcliente)as clienten,"+
               "(select apaterno from persona where idpersona=r.idcliente)as clienteap,"+
               "r.idtrabajador,(select nombre from persona where idpersona=r.idtrabajador)as trabajadorn,"+
               "(select apaterno from persona where idpersona=r.idtrabajador)as trabajadorap,"+
               "r.dia,r.mes,r.ano,r.hora_ingreso,r.hora_salida,r.salida_real,"+
               "r.costo_alojamiento,r.estado_reserva,r.total_consumos,"
                + "r.costo_extra from reserva r inner join habitación h on r.idhabitacion=h.idhabitación where r.dia and r.mes and r.ano like '%"+
                buscar + "%'and r.estado_reserva='Alquiler' order by idreserva desc";
       //AQUI MODIFIQUE !
       try {
           Statement st= cn.createStatement(); 
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idreserva");
               registro [1]=rs.getString("idhabitacion");
               registro [2]=rs.getString("numero");
               registro [3]=rs.getString("idcliente");
               registro [4]=rs.getString("clienten") + " " + rs.getString("clienteap") ;
               registro [5]=rs.getString("idtrabajador");
               registro [6]=rs.getString("trabajadorn") + " " + rs.getString("trabajadorap");
               registro [7]=rs.getString("dia");
               registro [8]=rs.getString("mes");
               registro [9]=rs.getString("ano");
               registro [10]=rs.getString("hora_ingreso");
               registro [11]=rs.getString("hora_salida");
               registro [12]=rs.getString("salida_real");
               registro [13]=rs.getString("costo_alojamiento");
               registro [14]=rs.getString("estado_reserva");
               registro [15]=rs.getString("total_consumos");
               registro [16]=rs.getString("costo_extra");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean insertar (vreserva dts){
       sSQL="insert into reserva (idhabitacion,idcliente,idtrabajador,dia,mes,ano,hora_ingreso,hora_salida,salida_real,costo_alojamiento,estado_reserva,total_consumos,costo_extra)" +
               "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdhabitacion());
           pst.setInt(2, dts.getIdcliente());
           pst.setInt(3, dts.getIdtrabajador());
           pst.setInt(4, dts.getDia());
           pst.setInt(5, dts.getMes());
           pst.setInt(6, dts.getAno());
           pst.setString(7, dts.getHora_Entrada());         
           pst.setString(8, dts.getHora_Salida());         
           pst.setString(9, dts.getSalida_Real());         
           pst.setDouble(10, dts.getCosto_alojamiento());
           pst.setString(11, dts.getEstado());         
           pst.setDouble(12, dts.getTotal_consumos());         
           pst.setDouble(13, dts.getCosto_extra());
           
           
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
           
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   public boolean editar (vreserva dts){
       sSQL="update reserva set idhabitacion=?,idcliente=?,idtrabajador=?,estado_reserva=?"+
               " where idreserva=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdhabitacion());
           pst.setInt(2, dts.getIdcliente());
           pst.setInt(3, dts.getIdtrabajador());        
           pst.setString(4, dts.getEstado());
           
           pst.setInt(5, dts.getIdreserva());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   public boolean pagar (vreserva dts){
       sSQL="update reserva set estado_reserva='Pagada',salida_real=?,total_consumos=?"+
               " where idreserva=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
             
           
           pst.setInt(3, dts.getIdreserva());
           pst.setDouble(2, dts.getTotal_consumos());
           pst.setString(1, dts.getSalida_Real());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   public boolean eliminar (vreserva dts){
       sSQL="delete from reserva where idreserva=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdreserva());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
    
    
    
    
    
}
