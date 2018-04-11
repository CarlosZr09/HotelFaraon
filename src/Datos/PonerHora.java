/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author ABENSUR
 */
public class PonerHora implements Runnable{

    final JLabel lblhora;
    
    
    public PonerHora(JLabel lblhora) {
        this.lblhora = lblhora;
    }
    
    @Override
    public void run() {
   while(true) {
       Date d2=new Date();
        lblhora.setText(d2.getHours()+":"+d2.getMinutes()+":"+d2.getSeconds());
   
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PonerHora.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    }

    
    
}
