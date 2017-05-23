package com.r.remisiones.dao.seguridad;

import java.util.List;

import com.remisiones.dominio.seguridad.Usuario;

public interface IUsuarioDao {

	public boolean grabarUsuario(Usuario usuario) throws Exception;
	public boolean actualizaUsuario(Usuario usuario) throws Exception;
	public boolean eliminaUsuario(int id) throws Exception;
	public List<Usuario> listaUsuarios() throws Exception;
	public List<Usuario> consultaUsuarioId(int id) throws Exception;
}
