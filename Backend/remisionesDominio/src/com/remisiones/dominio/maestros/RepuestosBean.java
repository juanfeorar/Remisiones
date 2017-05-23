package com.remisiones.dominio.maestros;

public class RepuestosBean {

	private int id_repeuestos;
	private String codigo;
	private String nombre;
	private String descripcion;
	private String valor;
	private String costo;
	private String creado;
	private String update;
	private boolean activo;

	public RepuestosBean() {}

	public RepuestosBean(String codigo, String nombre, String descripcion,
			String valor, String costo)
	{
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valor = valor;
		this.costo = costo;
	}

	public RepuestosBean(int id_repeuestos, String codigo, String nombre,
			String descripcion, String valor, String costo, String creado,
			String update, boolean activo)
	{
		super();
		this.id_repeuestos = id_repeuestos;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valor = valor;
		this.costo = costo;
		this.creado = creado;
		this.update = update;
		this.activo = activo;
	}

	public int getId_repeuestos() {
		return id_repeuestos;
	}

	public void setId_repeuestos(int id_repeuestos) {
		this.id_repeuestos = id_repeuestos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
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
