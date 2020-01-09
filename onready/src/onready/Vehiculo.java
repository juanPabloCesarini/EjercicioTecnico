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
public abstract class Vehiculo implements Comparable<Vehiculo>{
    private String marca;
    private String modelo;
    private Double precio;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int compareTo(Vehiculo v){
        if(this.getPrecio()>v.getPrecio()){
            return -1;
        }else if (this.getPrecio()>getPrecio()){
            return 0;
        }else{
            return 1;
        }
    }
    
    public String toString(){
        return "Marca: " + marca +" // Modelo: " + modelo;
    }
}
