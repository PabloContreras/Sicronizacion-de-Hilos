/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacionhilos;

/**
 *
 * @author pablo
 */
public class SincronizacionHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String varMain = "Main";
        variable var = new variable(varMain);
        hiloThread h1 = new hiloThread("Hijo 1", var);
        hiloThread h2 = new hiloThread("Hijo 2", var);        
        hiloThread h3 = new hiloThread("Hijo 3", var);
        hiloThread h4 = new hiloThread("Hijo 4", var);
        hiloThread h5 = new hiloThread("Hijo 5", var);
        h1.start();
        h2.start();
        System.out.println("En el main ");
        var.imprime();
        h3.start();
        h4.start();
        h5.start();
        
    }
    
}
