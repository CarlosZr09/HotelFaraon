/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lógica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author CARLOS
 */
public class conexion {
    /*public String db="sql10226286";
    public String url="jdbc:mysql://sql10.freemysqlhosting.net/" +db;
    public String user="sql10226286";
    public String pass="RklyLfkHDY";*/
    //Connection connect= null;
     //public String db="bdddd";
      public String db="basereservanew";
    public String url="jdbc:mysql://127.0.0.1/" +db;
    public String user="root";
    public String pass="";

    public Connection conectar() {
       Connection link=null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            link=DriverManager.getConnection(this.url, this.user, this.pass);
          Class.forName("com.mysql.jdbc.Driver");
          //onnect = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10226286", "sql10226286", "RklyLfkHDY");
       
         //connect =DriverManager.getConnection("jdbc:mysql:////sql10226286/RklyLfkHDY");
         //JOptionPane.showMessageDialog(null,"Conectado");
          
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null,"Error"+ e);
            
        }
        return link;

    
   
        /*    
        Connection link=null;
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
        
        return link;*/
    }
}
