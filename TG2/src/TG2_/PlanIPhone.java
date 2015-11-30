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
public class PlanIPhone extends Plan {
    
    public String email;

    public PlanIPhone(int n, String name,String e) {
        super(n, name);
        email = e;
    }

    @Override
    public double PagoMensual(int mins, int msgs) {
       double mensual = 22;
       return (mensual+(mins * 0.4)+(msgs*0.1));
       
    }
    
    @Override 
    public String toString(){
        return super.toString()+email;
    }
    
    public String getEmail(){
        return email;
    }
    
}
