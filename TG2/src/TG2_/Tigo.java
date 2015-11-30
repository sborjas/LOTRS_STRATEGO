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
public class Tigo {
    
     ArrayList<Plan> tipoPlanes = new ArrayList<>();
   
    public void addPlan(int numtel,String nombre,String extra,String tipo){
        for(Plan b : tipoPlanes){
           if(!b.equals(extra)&& !b.equals(numtel)){
               if(tipo.equals("IPHONE")){
                   tipoPlanes.add(new PlanIPhone(numtel,nombre,extra));
               }
               else if(tipo.equals("BLACKBERRY")){
                   tipoPlanes.add(new PlanBlackberry(numtel,nombre,extra));
               }
           }
        }
    }
    
    public boolean busqueda(int numtel, String datoExtra, String tipo){
        for(Plan b: tipoPlanes)
            if(b.num !=numtel)
                return false;
               return true;                  
    }
    
    public void list(){
        for(Plan b: tipoPlanes)
            if(b.)
            System.out.println(b);
    }
    
    
   
    
    
}
