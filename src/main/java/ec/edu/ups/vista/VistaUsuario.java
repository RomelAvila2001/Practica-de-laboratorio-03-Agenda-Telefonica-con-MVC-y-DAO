/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;


import ec.edu.ups.modelo.Usuario;
import java.util.Collection;
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
    
    public Usuario ingresarUsuario(){
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
   
    public Usuario actualizarUsuario() {
        System.out.println("Ingresa la cedula del cliente a actualizar");
        String cedula=teclado.next();
        System.out.println("Ingrese los nuevos Datos de usuario");
        System.out.println("Ingrese nombre");
        String nombre= teclado.next();
        System.out.println("Ingrese apellido");
        String apellido= teclado.next();
        System.out.println("Ingrese correo electronico");
        String correo= teclado.next();
        System.out.println("Igrese contraseña");
        String contraseña= teclado.next();
        return new Usuario(cedula, nombre, apellido,correo,contraseña);
    }

    public Usuario eliminarUsuario() {
        System.out.println("Ingresa la cedula del cliente a eliminar");
        String cedula = teclado.next();
        return new Usuario(cedula,null,null,null,null);
    }

    public String buscarUsuario() {
        System.out.println("Ingresa la cedula del cliente a buscar");
        String cedula=teclado.next();
        return cedula;
    }
    
    public void verUsuario(Usuario usuario) {
        System.out.println("Datos del Cliente: " + usuario);
    }

    public void verUsuarios(Collection<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println("Datos del Cliente: " + usuario);
        }
    }
    
    public Usuario iniciarSesion()
    {
        System.out.println("Ingrese Correo");
        String correo=teclado.next();
        System.out.println("Ingrese contraseña");
        String contraseña= teclado.next();
        
        return new Usuario(null, null, null, correo, contraseña);
    }
    
}
