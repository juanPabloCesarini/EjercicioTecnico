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
public class Auto extends Vehiculo{
    private String puertas;

    public Auto(String puertas) {
        this.puertas = puertas;
    }

    Auto() {
        
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }
    
    public String toString(){
        return super.toString() + " // Puertas: " + puertas ;
    }
    
}
