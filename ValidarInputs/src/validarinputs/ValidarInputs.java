/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarinputs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author samuelborjas
 */
public class ValidarInputs {

  
    public static void main(String[] args) {
        boolean n = true;
        int x = 0;

         Scanner lea = new Scanner(System.in);  
       
        do{
            
            
            System.out.println("Ingrese un valor ");
            try{
                 x = lea.nextInt();
                 n = false;
            }
            catch(InputMismatchException e){
                lea.next();
                System.out.println("Ingresar un numero");
            }
            
           
        }while(n);
        System.out.println("Valor ingresado: "+x);
    }
    
    
}

