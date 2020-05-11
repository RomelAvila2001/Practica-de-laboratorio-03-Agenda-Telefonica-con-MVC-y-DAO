/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author NANCY
 */
public class VistaUsuario {
    private Scanner teclado;
    
    public VistaUsuario(){
        teclado=new Scanner (System.in);
    }
    
    public Usuario registrase(){
        teclado= new Scanner (System.in);
        System.out.println("Ingrese cedula");
        String cedula= teclado.next();
        System.out.println("Ingrese nombre");
        String nombre= teclado.next();
        System.out.println("Ingrese apellido");
        String apellido= teclado.next();
        System.out.println("Ingrese correo electronico");
        String correo= teclado.next();
        System.out.println("Igrese contraseña");
        String contraseña= teclado.next();
        
        return new Usuario(cedula,nombre,apellido,correo,contraseña);
    }
}
