/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TG2_;

import java.util.ArrayList;

/**
 *
 * @author samuelborjas
 */
public class PlanBlackberry extends Plan {
    public String pin;
    ArrayList<String> bbm;

    public PlanBlackberry(int n, String name, String p) {
        super(n, name);
            p = pin;
            bbm = new ArrayList<>();
    }

    @Override
    public double PagoMensual(int mins, int msgs) {
        double mensual = 40;
        if(mins > 200 && msgs > 300)
            return mensual + (mins * 0.8) + (msgs * 0.2);
        return mensual;
    }

    @Override
    public String toString() {
        return super.toString()+ pin;
    }
    
    public void addPinAmigo(String pin){
        for(String p : bbm){
            if(!p.contains(pin))
                bbm.add(pin);   
        }        
    }
    
    public String getPin(){
        return pin;
    }
    
    
    
    
}
