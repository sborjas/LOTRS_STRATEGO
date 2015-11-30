/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TG2_;

/**
 *
 * @author samuelborjas
 */
public abstract class Plan {
    
    protected int num;
    protected String nombre;
    
    public Plan(int n, String name){
        
        n = num;
        name = nombre;
        
    }

    public int getNum() {
        return num;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract double PagoMensual(int mins, int msgs);
    
    @Override
    public String toString(){
        return ("El numero de celular: "+num+" pertenece a: "+nombre);
    }
    
}
