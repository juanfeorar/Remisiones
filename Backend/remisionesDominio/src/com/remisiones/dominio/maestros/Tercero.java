package com.remisiones.dominio.maestros;

public class Tercero {

	private int idTercero;
	private String nombre;
	private String celular;
	private String correo;
	private String cedula;
	private String creado;
	private String actualizado;
	private boolean activo;

	public Tercero() {	}

	public Tercero(String nombre, String celular, String correo,
			String cedula) {

		this.nombre = nombre;
		this.celular = celular;
		this.correo = correo;
		this.cedula = cedula;
	}

	public Tercero(int idTercero, String nombre, String celular,
			String correo, String cedula, String creado, String actualizado,
			boolean activo) {

		//this.id_tercero = id_tercero;
		this.nombre = nombre;
		this.celular = celular;
		this.correo = correo;
		this.cedula = cedula;
		this.creado = creado;
		this.actualizado = actualizado;
		this.activo = activo;
	}

	public int getIdTercero() {
		return idTercero;
	}

	public void setIdTercero(int idTercero) {
		this.idTercero = idTercero;
	}

	/*public int getId_tercero() {
		return id_tercero;
	}

	public void setId_tercero(int id_tercero) {
		this.id_tercero = id_tercero;
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCreado() {
		return creado;
	}

	public void setCreado(String creado) {
		this.creado = creado;
	}

	/*public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}*/

	public String getActualizado() {
		return actualizado;
	}

	public void setActualizado(String actualizado) {
		this.actualizado = actualizado;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
