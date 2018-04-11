/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebasx;

import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author BryanPaulCG
 */
public class Timer {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Timer timer = new Timer();
         TimerTask tarea =new TimerTask(){
         @Override
            public void run() {
               System.out.println("La tarea se ejecuto a las _:"+new Date());
            
            } 
        };
    // timer.
         
                 
}
                 }



