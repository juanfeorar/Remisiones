package com.remisiones.dominio.maestros;

public class EstadoBean {

	private int id_estado; 
	private String nombre;
	private String creado;
	private String update;
	private boolean activo; 

	public EstadoBean()
	{
		// TODO Auto-generated constructor stub
	}

	public EstadoBean(String nombre)
	{
		this.nombre = nombre;
	}

	public EstadoBean(int id_estado, String nombre, String creado,
			String update, boolean activo)
	{
		this.id_estado = id_estado;
		this.nombre = nombre;
		this.creado = creado;
		this.update = update;
		this.activo = activo;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCreado() {
		return creado;
	}

	public void setCreado(String creado) {
		this.creado = creado;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
