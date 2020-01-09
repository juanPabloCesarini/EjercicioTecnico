/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Juan Pablo
 */
public class Concesionaria implements Vim{
    ArrayList<Vehiculo> nomina = new ArrayList();
    @Override
    public void crearSucursal() {
        Auto a1 = new Auto();
        Auto a2 = new Auto();
        Moto m1 = new Moto();
        Moto m2 = new Moto();
        
        a1.setMarca("Peugeot");
        a1.setModelo("206");
        a1.setPuertas("4");
        a1.setPrecio(200000.00);
        nomina.add(a1);
        
        m1.setMarca("Honda");
        m1.setModelo("Titan");
        m1.setCilindradas("125c");
        m1.setPrecio(60000.00);
        nomina.add(m1);
        
        a2.setMarca("Peugeot");
        a2.setModelo("208");
        a2.setPuertas("5");
        a2.setPrecio(2500000.00);
        nomina.add(a2);
        
        m2.setMarca("Yamaha");
        m2.setModelo("YBR");
        m2.setCilindradas("160c");
        m2.setPrecio(80500.50);
        nomina.add(m2);   
    }
    
    @Override
    public void minMax(){
        double precioMin=99999999;
        double precioMax=0;
        String marcaMax="", marcaMin="", modeloMax="", modeloMin="";
        
        for (int i=0; i<nomina.size(); i++){
            
            if (nomina.get(i).getPrecio()>precioMax){
                precioMax = nomina.get(i).getPrecio();
                marcaMax = nomina.get(i).getMarca();
                modeloMax = nomina.get(i).getModelo();
            }
            if (nomina.get(i).getPrecio()<precioMin){
                precioMin = nomina.get(i).getPrecio();
                marcaMin = nomina.get(i).getMarca();
                modeloMin = nomina.get(i).getModelo();
            }
            
        }
        System.out.println("=============================");
        System.out.println("Vehículo más caro: "+ marcaMax + " "+ modeloMax);
        System.out.println("Vehículo más barato: "+ marcaMin + " "+ modeloMin);
    }

    @Override
    public void ordenarDatos() {
        Collections.sort(nomina);
        System.out.println("===========================");
        System.out.println("Vehiculos ordenados por precio de mayor a menor: ");
        for (int i=0; i<nomina.size();i++){
            System.out.println(nomina.get(i).getMarca()+ " " + nomina.get(i).getModelo());
        }
    }
    public void conY(){
        String letra="Y";
        String marcaY="",modeloY="";
        Double precioY=0.00;
        for (int i=0; i<nomina.size();i++){
            if (nomina.get(i).getModelo().contains(letra)){
                marcaY=nomina.get(i).getMarca();
                modeloY=nomina.get(i).getModelo();
                precioY=nomina.get(i).getPrecio();
            }
        }
        System.out.println("Vehiculo que contiene la letra 'Y': " + marcaY + " " + modeloY + " " + formatearPrecio(precioY));
            
        
    }
    
    public void mostrarDatos(){
        for (int i=0; i<nomina.size();i++){
            System.out.println(nomina.get(i).toString() + " // Precio: " + formatearPrecio(nomina.get(i).getPrecio()));
        }
    }

    @Override
    public String formatearPrecio(double precio) {
        String precioFormateado="";
        String patron= "$ ###,###,###.00";
        DecimalFormat formateo = new DecimalFormat(patron);
        precioFormateado = formateo.format(precio);
        return precioFormateado;
    }
}
