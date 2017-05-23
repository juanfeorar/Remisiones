package com.remisiones.dominio.admin;

public class arqueo {

	private int id_arqueo;
	private int registradora_inicial;
	private int registradora_entrada;
	private int registradora_salida;
	private int registradora_final;
	private int gps_inicial;
	private int gps_final;
	private int gps_diferecnia;
	private int gps_entrada_final;
	private int id_reparacion;
	private String creado;
	private String update;
	private boolean activo;

	public arqueo() {
	}

	public arqueo(int registradora_inicial, int registradora_entrada, 
			int registradora_salida, int registradora_final, int gps_inicial, 
			int gps_final, int gps_diferecnia, int gps_entrada_final, 
			int id_reparacion) {

		this.registradora_inicial = registradora_inicial;
		this.registradora_entrada = registradora_entrada;
		this.registradora_salida = registradora_salida;
		this.registradora_final = registradora_final;
		this.gps_inicial = gps_inicial;
		this.gps_final = gps_final;
		this.gps_diferecnia = gps_diferecnia;
		this.gps_entrada_final = gps_entrada_final;
		this.id_reparacion = id_reparacion;
	}

	public arqueo(int id_arqueo, int registradora_inicial, int registradora_entrada, 
			int registradora_salida, int registradora_final, int gps_inicial, 
			int gps_final, int gps_diferecnia, int gps_entrada_final, 
			int id_reparacion, String creado, String update, boolean activo) {
		super();
		this.id_arqueo = id_arqueo;
		this.registradora_inicial = registradora_inicial;
		this.registradora_entrada = registradora_entrada;
		this.registradora_salida = registradora_salida;
		this.registradora_final = registradora_final;
		this.gps_inicial = gps_inicial;
		this.gps_final = gps_final;
		this.gps_diferecnia = gps_diferecnia;
		this.gps_entrada_final = gps_entrada_final;
		this.id_reparacion = id_reparacion;
		this.creado = creado;
		this.update = update;
		this.activo = activo;
	}

	public int getId_arqueo() {
		return id_arqueo;
	}

	public void setId_arqueo(int id_arqueo) {
		this.id_arqueo = id_arqueo;
	}

	public int getRegistradora_inicial() {
		return registradora_inicial;
	}

	public void setRegistradora_inicial(int registradora_inicial) {
		this.registradora_inicial = registradora_inicial;
	}

	public int getRegistradora_entrada() {
		return registradora_entrada;
	}

	public void setRegistradora_entrada(int registradora_entrada) {
		this.registradora_entrada = registradora_entrada;
	}

	public int getRegistradora_salida() {
		return registradora_salida;
	}

	public void setRegistradora_salida(int registradora_salida) {
		this.registradora_salida = registradora_salida;
	}

	public int getRegistradora_final() {
		return registradora_final;
	}

	public void setRegistradora_final(int registradora_final) {
		this.registradora_final = registradora_final;
	}

	public int getGps_inicial() {
		return gps_inicial;
	}

	public void setGps_inicial(int gps_inicial) {
		this.gps_inicial = gps_inicial;
	}

	public int getGps_final() {
		return gps_final;
	}

	public void setGps_final(int gps_final) {
		this.gps_final = gps_final;
	}

	public int getGps_diferecnia() {
		return gps_diferecnia;
	}

	public void setGps_diferecnia(int gps_diferecnia) {
		this.gps_diferecnia = gps_diferecnia;
	}

	public int getGps_entrada_final() {
		return gps_entrada_final;
	}

	public void setGps_entrada_final(int gps_entrada_final) {
		this.gps_entrada_final = gps_entrada_final;
	}

	public int getId_reparacion() {
		return id_reparacion;
	}

	public void setId_reparacion(int id_reparacion) {
		this.id_reparacion = id_reparacion;
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
