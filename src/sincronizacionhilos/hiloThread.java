/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacionhilos;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */






public class hiloThread extends Thread{
    variable v;
    public hiloThread(String n, variable v){
        this.setName(n);
        this.v = v;
    }
    public void run(){
        //All things we want do the thread  
        Random ra = new Random();
        
        int t = ra.nextInt(5) * 100;
        System.out.println("Soy el hilo de: " + this.getName());
        v.variable = this.getName();
        System.out.println(t);
        try {
            this.sleep(t);
        } catch (InterruptedException ex) {
            //Logger.getLogger(hiloThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        v.imprime();
    }
}
