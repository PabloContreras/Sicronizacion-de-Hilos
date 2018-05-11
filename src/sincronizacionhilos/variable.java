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
public class variable {
    private String variable;
    public variable(String v){
        variable = v;
    }
    public synchronized void imprime(){
        
        System.out.println(variable);
    }
}
