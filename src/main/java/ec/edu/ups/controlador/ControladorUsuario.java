/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.util.List;

/**
 *
 * @author NANCY
 */
public class ControladorUsuario {
    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;
    private Usuario usuario;
    private Telefono telefono;
    private IUsuarioDAO usuarioDAO;
    private ITelefonoDAO telefonoDAO;

    public ControladorUsuario(VistaUsuario vistaUsuario, VistaTelefono vistaTelefono, UsuarioDAO usuarioDAO, TelefonoDAO telefonoDAO) {
        this.vistaUsuario = vistaUsuario;
        this.vistaTelefono = vistaTelefono;
        this.usuarioDAO = usuarioDAO;
        this.telefonoDAO = telefonoDAO;
    }
    
    public void registrar()
    {
        usuario= vistaUsuario.ingresarUsuario();
        usuarioDAO.create(usuario);
    }
    
     public void verUsuario() {
        String cedula = vistaUsuario.buscarUsuario();
        usuario = usuarioDAO.read(cedula);
        vistaUsuario.verUsuario(usuario);
    }

    //llama al DAO para actualizar un cliente
    public void actualizar() {
        usuario = vistaUsuario.actualizarUsuario();
        usuarioDAO.update(usuario);
    }

    //llama al DAO para eliminar un cliente
    public void eliminar() {
        usuario = vistaUsuario.eliminarUsuario();
        usuarioDAO.delete(usuario);
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public void verUsuarios() {
        List<Usuario> usuarios;
        usuarios = usuarioDAO.findAll();
        vistaUsuario.verUsuarios(usuarios);
    }
    
    public void agregarTelefono(){
        int codigo = vistaTelefono.buscarTelefono();
        telefono = telefonoDAO.read(codigo);
        usuario.agregarTelefono(telefono);
        usuarioDAO.update(usuario);        
    }
    
    public void actualizarTelefono(){
        int codigo = vistaTelefono.buscarTelefono();
        telefono= telefonoDAO.read(codigo);
        usuario.actualizarTelefono(telefono);
        usuarioDAO.update(usuario);
    }
    
    public void eleiminarTelefono(){
        int codigo=vistaTelefono.buscarTelefono();
        telefono=telefonoDAO.read(codigo);
        usuario.eliminarTelefono(telefono);
        usuarioDAO.update(usuario);
    }
    
    public void buscarTelefono(){
        int codigo=vistaTelefono.buscarTelefono();
        telefono=telefonoDAO.read(codigo);
        usuario.buscar(codigo);
        usuarioDAO.update(usuario);
    }
    
    public void iniciarSesion()
    {
        usuario= vistaUsuario.iniciarSesion();
    }
    
    public Usuario verificar()
    {
        List<Usuario> usuarios=usuarioDAO.findAll();
        usuario=vistaUsuario.iniciarSesion();
        for (Usuario usuario1 : usuarios) {
            if (usuario1.equals(usuario)) {
                return usuario1;
            }
        }
        return null;
    }
}
