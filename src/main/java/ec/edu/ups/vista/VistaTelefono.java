/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NANCY
 */
public class VistaTelefono {
    private Scanner teclado;

    public VistaTelefono() {
        teclado = new Scanner(System.in);
    }
    
    public Telefono ingresarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresa los datos del telefono");
        System.out.println("Ingrese el codigo");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese numero de telefono");
        String numero= teclado.next();
        System.out.println("Ingrese tipo de telefono");
        String tipo = teclado.next();
        System.out.println("Ingrese la operadora");
        String operadora=teclado.next();
        return new Telefono(numero, tipo, operadora,codigo);
    }

    public Telefono actualizarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a actualizar");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese los nuevos Datos");
        System.out.println("Ingrese numero de telefono");
        String numero= teclado.next();
        System.out.println("Ingrese tipo de telefono");
        String tipo = teclado.next();
        System.out.println("Ingrese la operadora");
        String operadora=teclado.next();
        return new Telefono(numero, tipo, operadora, codigo);
    }

    public Telefono eliminarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a eliminar");
        int codigo = teclado.nextInt();
        return new Telefono(null, null, null, codigo);
    }

    public int buscarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a buscar");
        int codigo = teclado.nextInt();
        return codigo;
    }

    public void verTelefono(Telefono telefono) {
        System.out.println("Datos del Telefono: " + telefono);
    }

    public void verTelefonos(List<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("Datos del telefono: " + telefono);
        }
    }
}
