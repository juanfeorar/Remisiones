package com.r.remisiones.dao.seguridad;

import java.util.List;

import com.remisiones.dominio.seguridad.Rol;

public interface IRolDao {
	public boolean grabarRol(Rol rol) throws Exception;
	public boolean actualizaRol(Rol rol) throws Exception;
	public boolean eliminaRol(int id) throws Exception;
	public List<Rol> ListaRols() throws Exception;
	public List<Rol> consultaRolId(int id) throws Exception;

}
