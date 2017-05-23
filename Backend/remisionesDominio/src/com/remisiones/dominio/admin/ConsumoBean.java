package com.remisiones.dominio.admin;

public class ConsumoBean {
	
	private int id_consumo;
	private int id_reparacion;
	private int repuestos; 
	private int cantdad;
	private double valor;
	private String creado;
	private String update;
    private String activo;
    
	public ConsumoBean() {}

	public ConsumoBean(int id_reparacion, int repuestos, int cantdad, double valor) {
		super();
		this.id_reparacion = id_reparacion;
		this.repuestos = repuestos;
		this.cantdad = cantdad;
		this.valor = valor;
	}

	public ConsumoBean(int id_consumo, int id_reparacion, int repuestos, int cantdad, double valor, String creado,
			String update, String activo) {
		super();
		this.id_consumo = id_consumo;
		this.id_reparacion = id_reparacion;
		this.repuestos = repuestos;
		this.cantdad = cantdad;
		this.valor = valor;
		this.creado = creado;
		this.update = update;
		this.activo = activo;
	}

	public int getId_consumo() {
		return id_consumo;
	}

	public void setId_consumo(int id_consumo) {
		this.id_consumo = id_consumo;
	}

	public int getId_reparacion() {
		return id_reparacion;
	}

	public void setId_reparacion(int id_reparacion) {
		this.id_reparacion = id_reparacion;
	}

	public int getRepuestos() {
		return repuestos;
	}

	public void setRepuestos(int repuestos) {
		this.repuestos = repuestos;
	}

	public int getCantdad() {
		return cantdad;
	}

	public void setCantdad(int cantdad) {
		this.cantdad = cantdad;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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
