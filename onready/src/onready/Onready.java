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
public class Onready {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Concesionaria sucursal = new Concesionaria();
        sucursal.crearSucursal();
        sucursal.mostrarDatos();
        sucursal.minMax();
        sucursal.conY();
        sucursal.ordenarDatos();
       
    }
    
}
