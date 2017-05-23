package com.remisiones.dominio.seguridad;

public class Rol {

	private int id_rol;
	private String nombreRol;
	private String descripcionRol;
	private String creado;
	private String actualizado;
	private boolean activo;

	public Rol()
	{
	}

	public Rol(String nombreRol, String descripcionRol)
	{
		this.nombreRol = nombreRol;
		this.descripcionRol = descripcionRol;
	}

	public Rol(int id_rol, String nombreRol, String descripcionRol,
			String creado, String actualizado, boolean activo)
	{
		this.id_rol = id_rol;
		this.nombreRol = nombreRol;
		this.descripcionRol = descripcionRol;
		this.creado = creado;
		this.actualizado = actualizado;
		this.activo = activo;
	}

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	public String getDescripcionRol() {
		return descripcionRol;
	}

	public void setDescripcionRol(String descripcionRol) {
		this.descripcionRol = descripcionRol;
	}

	public String getCreado() {
		return creado;
	}

	public void setCreado(String creado) {
		this.creado = creado;
	}

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
