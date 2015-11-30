/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author samuelborjas
 */
public class BarcoPesquero extends Barco {
    
    protected int pecesCapturados;
    protected final int precioxpescado;
    
    public BarcoPesquero(String n,int pxp) {
        super(n);
        this.precioxpescado = pxp;
        pecesCapturados = 0;
        
    }

    @Override
    public void agregarElemento() {
       pecesCapturados+=1;
    }

    @Override
    public double vaciarCobrar() {
        double todo = pecesCapturados*precioxpescado;
        pecesCapturados = 0;
        return todo;
    }
    
    public void agregarCardumen(int cant){
    pecesCapturados+=cant;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Peces Capturados: # "+pecesCapturados;
    }
    
    
}
