/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lógica;

import Datos.vlimpieza;
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
public class flimpieza {
    
   private conexion mysql=new conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Idhabitación","Numero","estado","idtrabajador","Trabajador","dia","mes","ano",
                            "Hora_ingreso","Hora_salida"};
       
       String [] registro =new String [10];
       
       modelo = new DefaultTableModel(null,titulos);
       
           // sSQL="select  from reserva r inner join habitación on r.idhabitacion=h where r.fecha_reserva like '%"+buscar +"%' order by idreserva desc";
            
        sSQL="select l.habitación_idhabitación,h.numero,"+
               "l.trabajador_idpersona,(select nombre from persona where idpersona=l.trabajador_idpersona)as trabajadorn,"+
               "(select apaterno from persona where idpersona=l.trabajador_idpersona)as trabajadorap,"+
               "l.dia,l.mes,l.ano,l.hora_ingreso,l.hora_salida,"+
               "h.estado from limpieza l inner join habitación h on l.habitación_idhabitación=h.idhabitación where l.dia and l.mes and l.ano like '%"+
                buscar + "%'and h.estado='Limpiar' order by l.habitación_idhabitación desc";
       //AQUI MODIFIQUE !
       try {
           Statement st= cn.createStatement(); 
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idliempieza");
               registro [1]=rs.getString("idhabitacion");
               registro [2]=rs.getString("numero");
               registro [3]=rs.getString("idtrabajador") ;
               registro [4]=rs.getString("idtrabajador") ;
               registro [5]=rs.getString("trabajadorn")+ " " + rs.getString("trabajadorap");
               registro [6]=rs.getString("dia");
               registro [7]=rs.getString("mes");
               registro [8]=rs.getString("ano");
               registro [9]=rs.getString("hora_ingreso");
               registro [10]=rs.getString("hora_salida");
               modelo.addRow(registro);
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean insertar (vlimpieza dts){
       sSQL="insert into limpieza (idhabitacion,idtrabajador,idtrabajador2,dia,mes,ano,hora_ingreso,hora_salida)" +
               "values (?,?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdhabitacion());
           pst.setInt(2, dts.getIdtrabajador());
           pst.setInt(3, dts.getIdtrabajador2());
           pst.setInt(4, dts.getDia());
           pst.setInt(5, dts.getMes());
           pst.setInt(6, dts.getAno());
           pst.setString(7, dts.getHora_Entrada());         
           pst.setString(8, dts.getHora_Salida());      
           
           
           
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
