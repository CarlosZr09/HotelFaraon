/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica;

import static Presentación.frminicio.escritorio;
import javax.swing.JInternalFrame;

/**
 *
 * @author BryanPaulCG
 */
public class fCentrarVentana {
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
}}
