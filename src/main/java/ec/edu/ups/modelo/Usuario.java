/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author NANCY
 */
public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private Telefono[] telefonos;
    private int cont;

    public Usuario() {
        telefonos=new Telefono[10];
        cont=0;
    }

    public Usuario(String cedula, String nombre, String apellido, String correo, String contraseña) {
       this.cedula = cedula;
       this.nombre = nombre;
       this.apellido = apellido;
       this.correo = correo;
       this.contraseña = contraseña;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }
    
    public void agregarTelefono(Telefono telefono)
    {
        if(cont<=10)
        {
            telefonos[cont]=telefono;
            cont++;
        }
        else{System.out.println("has llegado al limite de clientes");}
    } 

    
    @Override
    public String toString() {
        String telefonos=" ";
        for (int i = 0; i < cont; i++) {
            telefonos+=this.telefonos[i]+"\n";
        }
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
