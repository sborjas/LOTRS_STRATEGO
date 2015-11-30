/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samuelborjas
 */
public class Muelle {
    
    static ArrayList<Barco> barcos = new ArrayList<>();
    static Scanner lea = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        
        char op;

        do{
            
            System.out.println("Ingrese Opcion: ");
            System.out.println(" a)Agregar Barco \n b)Agregar Elemneto \n c)Vaciar Barco \n d)Listar Pasajeros \n e)Agregar Cardumen \n f)Barcos Desde  ");
                op = lea.next().charAt(0);
                
            switch (op){
                case 'a':
                    
                    System.out.println("Ingrese el tipo del barco");
                        String tipo = lea.next();
                        
                    System.out.println("Ingrese el nombre del barco");
                        String nombre = lea.next();
                        
                       AgregarBarco(tipo,nombre);

                break;
                
                case 'b':
                    System.out.println("Ingrese el nombre del barco ");
                        String nb = lea.next();               
                        AgregarElemento(nb);
        
                break;
                 
                case 'c':
                    
                    System.out.println("Ingrese el nombre del barco");
                        String n = lea.next();
                        
                        VaciarBarco(n);
    
                break;
                    
                case 'd':                  
                    listarPasajeros();
                break;
                    
                case 'e':
                    System.out.println("Ingrese el nombre del barco...");
                        String name = lea.next();
                    System.out.println("Ingrese cantidad de peces capturados..");
                        int cant = lea.nextInt();
                        
                        AgregarCardumen(name,cant);
                break;
                    
                case 'f':
                break;
                    
                    
            }   
            
        }while(true);                 
        
    }  
    
    public static void AgregarBarco(String nombre,String tipo){
            for(Barco barco: barcos) 
              if(!barco.getNombre().equals(nombre)){
                if(tipo.toUpperCase() == "PESQUERO"){
                    barcos.add(new BarcoPesquero(nombre,30));

                }else if(tipo.toUpperCase() == "PASAJERO"){
                    System.out.println("Ingrese capacidad de barco...");
                        int cap = lea.nextInt();
                    System.out.println("Igrese precio boleto ");
                         double precio = lea.nextInt();
                         barcos.add(new BarcoPasajero(nombre,cap,precio));
                      }      
                   }
        }
    
    public static void AgregarElemento(String nombre){
        for(Barco barco: barcos)
            if(barco.getNombre().equals(nombre))
               barco.agregarElemento();
    }
    
    public static double VaciarBarco(String nombre){
        
        for(Barco barco: barcos)
            if(barco.getNombre().equals(nombre)){
                System.out.println(barco.toString());
                return barco.vaciarCobrar();
            }
                
        return 0;
    }
    
    public static void listarPasajeros(){
        for(Barco barco:barcos)
            if(barco instanceof BarcoPasajero)
              ((BarcoPasajero)barco).listarPasajeros(); 
    }
    
    public static void AgregarCardumen(String nombre, int cant){
        for(Barco barco: barcos)
            if(barco.getNombre().equals(nombre))
                if(barco instanceof BarcoPesquero)
                    ((BarcoPesquero)barco).agregarCardumen(cant);
    }
    
    public static void BarcosDesde(int year){
        for(Barco barco: barcos)
            if(barco.fecha.after(year)){
                System.out.println("Nombre de barco "+barco.getNombre()+" Fecha de Circulacion "+barco.fecha);
                
            }
    }
        
            
    
    
}
