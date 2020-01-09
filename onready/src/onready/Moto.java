/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;

/**
 *
 * @author Juan Pablo
 */
public class Moto extends Vehiculo{
    private String cilindradas;
    
    public Moto(){
        
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    public String toString(){
        return super.toString() + " // Cilindrada: " + cilindradas ;
    }
}
