/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class GestorCredencial {
    private List<Credencial> credenciales;
    
    public GestorCredencial(){
        this.credenciales = new ArrayList();
    }
    
    public void listarCredenciales(){
        for(Credencial c: this.credenciales){
            System.out.println("Servicio: "+c.servicio);
        }
    }
    public void agregarCredencial(Credencial credencial)
    {
        this.credenciales.add(credencial);
        System.out.println("");
        System.out.println("Credencial agregada!");
        System.out.println("");
    }
    
    
    public Credencial crearCredencial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Ingrese el servicio: ");
        String servicio = sc.nextLine();
        System.out.print("Ingrese el usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String contrasena = sc.nextLine();
        
        Credencial credencial = new Credencial(
                servicio, usuario, contrasena
        );
        
        System.out.println("");
        System.out.println("Credencial creada!");
        System.out.println("");
        return credencial;
    }
}
