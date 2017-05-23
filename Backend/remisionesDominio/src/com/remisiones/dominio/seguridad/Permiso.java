package com.remisiones.dominio.seguridad;

public class Permiso {

	private int idPermisos; 
	private String nombrPermisos;
	private String descripcionPermisos;
	private String creado;
	private String actualizado;
	private boolean activo;

	public Permiso() {	}

	public Permiso(String nombrPermisos, String descripcionPermisos)
	{
		this.nombrPermisos = nombrPermisos;
		this.descripcionPermisos = descripcionPermisos;
	}

	public Permiso(int idPermisos, String nombrPermisos,
			String descripcionPermisos, String creado, String actualizado,
			boolean activo)
	{
		this.idPermisos = idPermisos;
		this.nombrPermisos = nombrPermisos;
		this.descripcionPermisos = descripcionPermisos;
		this.creado = creado;
		this.actualizado = actualizado;
		this.activo = activo;
	}

	public int getIdPermisos() {
		return idPermisos;
	}

	public void setIdPermisos(int idPermisos) {
		this.idPermisos = idPermisos;
	}

	public String getNombrPermisos() {
		return nombrPermisos;
	}

	public void setNombrPermisos(String nombrPermisos) {
		this.nombrPermisos = nombrPermisos;
	}

	public String getDescripcionPermisos() {
		return descripcionPermisos;
	}

	public void setDescripcionPermisos(String descripcionPermisos) {
		this.descripcionPermisos = descripcionPermisos;
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
