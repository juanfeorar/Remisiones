package com.r.remisiones.dao.maestros;

import java.util.List;

import com.remisiones.dominio.maestros.Tercero;

public interface ITerceroDAO {

	public boolean grabarTercero(Tercero tercero) throws Exception;
	public boolean actualizaTercero(Tercero tercero) throws Exception;
	public boolean eliminaTercero(int id) throws Exception;
	public List<Tercero> ListaTerceros() throws Exception;
	public List<Tercero> consultaTerceroId(int id) throws Exception;

}
