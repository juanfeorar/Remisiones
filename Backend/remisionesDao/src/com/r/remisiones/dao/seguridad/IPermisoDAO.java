package com.r.remisiones.dao.seguridad;

import java.util.List;

import com.remisiones.dominio.seguridad.Permiso;

public interface IPermisoDAO {
	
	public boolean grabarPermiso(Permiso permiso) throws Exception;
	public boolean actualizaPermiso(Permiso permiso) throws Exception;
	public boolean eliminaPermiso(int id) throws Exception;
	public List<Permiso> listaPermisos() throws Exception;
	public List<Permiso> consultaPermisoId(int id) throws Exception;

}
