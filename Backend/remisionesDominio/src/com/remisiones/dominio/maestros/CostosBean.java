package com.remisiones.dominio.maestros;

public class CostosBean {
	private int id_costos;
	private int fracciones;
	private int valor_fraccion;
	private String creado;
	private String update;
	private boolean activo;
	
	public CostosBean() {	}
	
	public CostosBean(int fracciones, int valor_fraccion) {
		super();
		this.fracciones = fracciones;
		this.valor_fraccion = valor_fraccion;
	}
	
	public CostosBean(int id_costos, int fracciones, int valor_fraccion,
			String creado, String update, boolean activo) {
		super();
		this.id_costos = id_costos;
		this.fracciones = fracciones;
		this.valor_fraccion = valor_fraccion;
		this.creado = creado;
		this.update = update;
		this.activo = activo;
	}
	
	public int getId_costos() {
		return id_costos;
	}
	public void setId_costos(int id_costos) {
		this.id_costos = id_costos;
	}
	public int getFracciones() {
		return fracciones;
	}
	public void setFracciones(int fracciones) {
		this.fracciones = fracciones;
	}
	public int getValor_fraccion() {
		return valor_fraccion;
	}
	public void setValor_fraccion(int valor_fraccion) {
		this.valor_fraccion = valor_fraccion;
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
