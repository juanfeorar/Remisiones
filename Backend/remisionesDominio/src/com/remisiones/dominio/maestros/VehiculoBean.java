package com.remisiones.dominio.maestros;

public class VehiculoBean {

	private int id_vehiculo;
	private int id_empresa;
	private int id_tercero;
	private String placa;
	private String codigo;
	private String creado;
	private String update;
	private boolean activo;

	public VehiculoBean()
	{
	}

	public VehiculoBean(int id_empresa, int id_tercero, String placa,
			String codigo)
	{
		super();
		this.id_empresa = id_empresa;
		this.id_tercero = id_tercero;
		this.placa = placa;
		this.codigo = codigo;
	}

	public VehiculoBean(int id_vehiculo, int id_empresa, int id_tercero,
			String placa, String codigo, String creado, String update,
			boolean activo)
	{
		super();
		this.id_vehiculo = id_vehiculo;
		this.id_empresa = id_empresa;
		this.id_tercero = id_tercero;
		this.placa = placa;
		this.codigo = codigo;
		this.creado = creado;
		this.update = update;
		this.activo = activo;
	}

	public int getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}

	public int getId_tercero() {
		return id_tercero;
	}

	public void setId_tercero(int id_tercero) {
		this.id_tercero = id_tercero;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
