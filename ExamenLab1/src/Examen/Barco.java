/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.Calendar;

/**
 *
 * @author samuelborjas
 */
public abstract class Barco {
    
    protected String nombre;
    Calendar fecha;
    
    public Barco(String n){
        n = nombre;
        fecha = Calendar.getInstance();
    }
    
    public final String getNombre(){
        return nombre;
    }
    
    public final Calendar getFecha(){
        return fecha;
    }

    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + ", fecha=" + fecha + '}';
    }
    
    public abstract void agregarElemento();

    public abstract double vaciarCobrar();
    
}
