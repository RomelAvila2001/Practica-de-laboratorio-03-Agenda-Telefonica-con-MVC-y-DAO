/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;

/**
 *
 * @author NANCY
 */
public class ControladorUsuario {
    private VistaUsuario vistaUsuario;
    private Usuario usuario;
    private IUsuarioDAO usuarioDAO;

    public ControladorUsuario(VistaUsuario vistaUsuario) {
        this.vistaUsuario = vistaUsuario;
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public void registrar()
    {
        usuario= vistaUsuario.registrase();
        usuarioDAO.create(usuario);
    }
    
    
}
