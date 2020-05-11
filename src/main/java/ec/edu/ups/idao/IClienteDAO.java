/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author NANCY
 */
public interface IClienteDAO {
    public void create(Usuario usuario);
    public Usuario read(int id);
    public void update(Usuario usuario);
    public void delete(Usuario Usuario);
    public List<Usuario> findAll();
}
