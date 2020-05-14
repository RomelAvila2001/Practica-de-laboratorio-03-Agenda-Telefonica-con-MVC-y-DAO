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
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.util.Scanner;

/**
 *
 * @author NANCY
 */
public class Principal {

    private static final Scanner teclado = new Scanner(System.in);
    private static final VistaUsuario vista = new VistaUsuario();
    private static final VistaTelefono vistaT = new VistaTelefono();
    private static final UsuarioDAO usuarioDAO = new UsuarioDAO();
    private static final TelefonoDAO telefonoDAO = new TelefonoDAO();
    private static final ControladorUsuario controladorUsuario = new ControladorUsuario(vista, vistaT, usuarioDAO, telefonoDAO);
    private static final ControladorTelefono controladorTelefono = new ControladorTelefono(vistaT, telefonoDAO);

    public static void main(String[] args) {

        boolean Salir = false;

        while (Salir == false) {
            System.out.println("-----Menu de seleccio-----");
            System.out.println("1. Registrarse ");
            System.out.println("2. Iniciar Sesion ");
            System.out.println("3. Imprimir usuarios");
            System.out.println("4. Salir ");

            int respuesta = teclado.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("---Registrar Usuario---");
                    controladorUsuario.registrar();
                    System.out.println("Usuarios Registrados");
                    controladorUsuario.verUsuarios();
                    break;

                case 2:
                    System.out.println("---Iniciar Secion---");
                    String cedula = verificarSesion();
                    if (cedula == null) {
                        break;
                    }
                    boolean salir = false;
                    while (salir == false) {
                        System.out.println("--menu--");
                        System.out.println(" 1. Registrar ");
                        System.out.println(" 2. Modificar ");
                        System.out.println(" 3. Eliminar ");
                        System.out.println(" 4. Buscar ");
                        System.out.println(" 5. Listar sus telefonos ");
                        System.out.println(" 6. Salir ");

                        int respuesta2 = teclado.nextInt();

                        switch (respuesta2) {
                            case 1:
                                System.out.println("---Registrar telefono---");
                                controladorTelefono.registrar();
                                controladorUsuario.agregarTelefono(cedula);
                                break;
                            case 2:
                                System.out.println("---Modificar telefono---");
                                controladorTelefono.actualizar();
                                controladorUsuario.actualizarTelefono(cedula);
                                break;
                            case 3:
                                System.out.println("---Eliminar telefono---");
                                controladorTelefono.eliminar();
                                controladorUsuario.eleiminarTelefono(cedula);
                                break;
                            case 4:
                                controladorUsuario.buscarTelefono(cedula);
                                break;
                            case 5:
                                controladorTelefono.verTelefonos();
                                break;
                            case 6:
                                salir = true;
                                break;
                        }
                    }

                    break;

                case 3:
                    controladorUsuario.verUsuarios();
                    break;
                case 4:
                    Salir = true;
                    break;
            }
        }
    }

    public static String verificarSesion() {
        Usuario usuario1 = controladorUsuario.verificar();
        if (usuario1 == null) {
            return null;
        } else {
            return usuario1.getCedula();
        }
    }

}
