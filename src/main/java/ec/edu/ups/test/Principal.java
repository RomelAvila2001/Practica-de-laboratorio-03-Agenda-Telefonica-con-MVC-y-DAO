/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.vista.VistaUsuario;
import java.util.Scanner;

/**
 *
 * @author NANCY
 */
public class Principal {
    public static void main (String[] args)
    {
        Scanner teclado= new Scanner (System.in);
        VistaUsuario vista = new VistaUsuario();
        ControladorUsuario controlador = new ControladorUsuario(vista);
        
        boolean Salir= false;
        
        while(Salir==false)
        {
            System.out.println("-----Menu de seleccio-----");
            System.out.println("1. Registrarse ");
            System.out.println("2. Iniciar Sesion ");
            System.out.println("3. Salir ");
            
            int respuesta = teclado.nextInt();
            
            switch(respuesta)
            {
                case 1:
                    System.out.println("---Registrar Usuario---");
                    controlador.registrar();
                    break;
                    
                case 2:
                    boolean salir= false;
                    while(salir== false)
                    {
                        System.out.println("---Iniciar Secion---");
                        
                        
                        System.out.println("--menu--");
                        System.out.println(" 1. Registrar ");
                        System.out.println(" 2. Modificar ");
                        System.out.println(" 3. Eliminar ");
                        System.out.println(" 4. Buscar ");
                        System.out.println(" 6. Listar sus telefonos ");
                        System.out.println(" 7. Salir ");
                        
                        int respuesta2= teclado.nextInt();
                        
                        switch(respuesta2)
                        {
                            case 1:
                                System.out.println("---Registrar telefono---");
                                
                                break;
                        }
                    }
                    
                    break;
                    
                case 3:
                    Salir= true;
                    break;
            }
        }
    }
}
