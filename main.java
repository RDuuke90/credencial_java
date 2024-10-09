/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Main {
    
    public static String PASSWORD_SYSTEM = "123456789";
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        
        System.out.println("===== Sistema de GC ========");
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 3;
        
        do {
            
            System.out.print("Ingrese Contraseña");
            String password = sc.nextLine();
            
            if (PASSWORD_SYSTEM.equals(password)) {
                System.out.println("Ingresando!!");
                int modulo;
                do {
                    System.out.println("==== Lista de Modulos");
                
                    System.out.println("1 -> Crear credencial");
                    System.out.println("2 -> Agregar Credencial");
                    System.out.println("3 -> Buscar Credencial");
                    System.out.println("4 -> Salir");
                    System.out.println("");
                    modulo = sc.nextInt();
                    
                    System.out.println("");
                    
                    switch(modulo){
                        case 1: 
                            
                            break;
                        case 2:
                            System.out.println("Modulo 2");
                            break;
                        case 3: 
                            System.out.println("Module 3");
                            break;
                        case 4:
                            System.out.println("Saliendo....");
                            break;
                        default:
                            System.out.println("Opcion no valida!");
                            break;
                    }
                }while(modulo != 4);
            } else {
                opcion--;
                System.out.println("Te quedan "+opcion+ "intentos");
            }
                
        } while (opcion != 0);
    }
    
}
