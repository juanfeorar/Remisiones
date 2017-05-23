package com.remisiones.dominio.maestros;

public class RutaBean {

	private int id_ruta;
	private int id_empresa;
	private String nombre;
	private String creado;
	private String update;
	private boolean activo;

	public RutaBean()
	{
		// TODO Auto-generated constructor stub
	}

	public RutaBean(int id_empresa, String nombre)
	{
		super();
		this.id_empresa = id_empresa;
		this.nombre = nombre;
	}

	public RutaBean(int id_ruta, int id_empresa, String nombre, String creado,
			String update, boolean activo)
	{
		super();
		this.id_ruta = id_ruta;
		this.id_empresa = id_empresa;
		this.nombre = nombre;
		this.creado = creado;
		this.update = update;
		this.activo = activo;
	}

	public int getId_ruta() {
		return id_ruta;
	}

	public void setId_ruta(int id_ruta) {
		this.id_ruta = id_ruta;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
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
