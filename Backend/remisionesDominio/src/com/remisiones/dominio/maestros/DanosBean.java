package com.remisiones.dominio.maestros;

public class DanosBean {
	private String id_danos;
	private String nombre;
	private String descripcion;
	private String creado;
	private String update;
    private String activo;
    
	public DanosBean() {}
	
	public DanosBean(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public DanosBean(String id_danos, String nombre, String descripcion,
			String creado, String update, String activo) {
		super();
		this.id_danos = id_danos;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.creado = creado;
		this.update = update;
		this.activo = activo;
	}

	public String getId_danos() {
		return id_danos;
	}

	public void setId_danos(String id_danos) {
		this.id_danos = id_danos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	} 
}
