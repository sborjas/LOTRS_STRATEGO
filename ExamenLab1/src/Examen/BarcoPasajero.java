/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author samuelborjas
 */
public final class BarcoPasajero extends Barco{
    
         protected String pasajeros[];
         protected double precioBoleto;
         protected int cantiPasajeros;
         
        Scanner lea = new Scanner(System.in);

    public BarcoPasajero(String n,int cant,double boleto) {
        super(n);
        pasajeros = new String[cant];
        this.precioBoleto = boleto;
        cantiPasajeros = 0;
    }

    @Override
    public void agregarElemento() {
        if(cantiPasajeros<= pasajeros.length)
            if(pasajeros == null)
                 System.out.println("Ingrese el nombre del pasajero");
                    pasajeros[cantiPasajeros] = lea.next();

    }
    
    @Override
    public double vaciarCobrar() {
        double total = pasajeros.length*precioBoleto;
        cantiPasajeros = 0;
        return total;    
    }
    
    public void listarPasajeros(){
        int pos = 0;
        if(pos <= pasajeros.length){
            System.out.println(pasajeros[pos]);
                pos+=1;
        }
        
    }
    
    @Override
    public String toString(){
        return super.toString() + "Cantidad de Pasajeros que compraron el boleto: # "+cantiPasajeros;
    }
    
    
}
