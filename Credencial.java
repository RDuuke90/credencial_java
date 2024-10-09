/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ESTUDIANTE
 */
public class Credencial {
    public String servicio;
    private String usuario;
    private String contrasena;
    
    public Credencial(
            String in_servicio,
            String in_usuario,
            String in_contrasena
    ){
        this.usuario = in_usuario;
        this.servicio = in_servicio;
        this.contrasena = in_contrasena;
    }
}
