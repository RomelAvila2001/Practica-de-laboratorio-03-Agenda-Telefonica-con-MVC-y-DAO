/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.vista.VistaTelefono;
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
        VistaTelefono vistaT = new VistaTelefono();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        TelefonoDAO telefonoDAO = new TelefonoDAO();
        ControladorUsuario controladorUsuario = new ControladorUsuario(vista, vistaT, usuarioDAO, telefonoDAO);
        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaT, telefonoDAO);
        
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
                    controladorUsuario.registrar();
                    System.out.println("Usuarios Registrados");
                    controladorUsuario.verUsuarios();
                    break;
                    
                case 2:
                    System.out.println("---Iniciar Secion---");
                    
                    boolean salir= false;
                    while(salir== false)
                    {
                        System.out.println("--menu--");
                        System.out.println(" 1. Registrar ");
                        System.out.println(" 2. Modificar ");
                        System.out.println(" 3. Eliminar ");
                        System.out.println(" 4. Buscar ");
                        System.out.println(" 5. Listar sus telefonos ");
                        System.out.println(" 6. Salir ");
                        
                        int respuesta2= teclado.nextInt();
                        
                        switch(respuesta2)
                        {
                            case 1:
                                System.out.println("---Registrar telefono---");
                                controladorTelefono.registrar();
                                controladorUsuario.agregarTelefono();
                                controladorUsuario.verUsuario();
                                break;
                            case 2:
                                System.out.println("---Modificar telefono---");
                                controladorTelefono.actualizar();
                                controladorUsuario.actualizarTelefono();
                                controladorUsuario.verUsuario();
                                break;
                            case 3:
                                System.out.println("---Eliminar telefono---");
                                controladorTelefono.eliminar();
                                controladorUsuario.eleiminarTelefono();
                                controladorUsuario.verUsuario();
                                break;
                            case 4:
                                controladorTelefono.eliminar();
                                controladorUsuario.buscarTelefono();
                                controladorUsuario.verUsuario();
                                break;
                            case 5:
                                controladorTelefono.verTelefonos();
                                break;
                            case 6:
                                salir= true;
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
