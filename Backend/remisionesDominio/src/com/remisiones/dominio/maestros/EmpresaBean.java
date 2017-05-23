package com.remisiones.dominio.maestros;

public class EmpresaBean {

	private String id_empresa;
	private String nombre;
	private String nit;
	private String email;
	private String creado;
	private String update;
	private boolean activo;
	
	public EmpresaBean(){}

	public EmpresaBean(String nombre, String nit, String email)
	{
		super();
		this.nombre = nombre;
		this.nit = nit;
		this.email = email;
	}

	public EmpresaBean(String id_empresa, String nombre, String nit,
			String email, String creado, String update, boolean activo)
	{
		super();
		this.id_empresa = id_empresa;
		this.nombre = nombre;
		this.nit = nit;
		this.email = email;
		this.creado = creado;
		this.update = update;
		this.activo = activo;
	}

	public String getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(String id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
