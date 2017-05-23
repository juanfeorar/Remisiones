package com.remisiones.dominio.seguridad;

public class Usuario {

	private int idUsuario;
	private String usuario;
	private String nombreUsuario;
	private String cedulaUsuario;
	private String telefonoUsuario;
	private String contraseniaUsuario;
	private String creado;
	private String actualizado;
	private boolean activo;

	public Usuario(){}

	public Usuario(String usuario, String nombreUsuario, String cedulaUsuario,
			String telefonoUsuario, String contraseniaUsuario)
	{
		this.usuario = usuario;
		this.nombreUsuario = nombreUsuario;
		this.cedulaUsuario = cedulaUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.contraseniaUsuario = contraseniaUsuario;
	}

	public Usuario(int idUsuario, String usuario, String nombreUsuario,
			String cedulaUsuario, String telefonoUsuario,
			String contraseniaUsuario, String creado, String actualizado,
			boolean activo)
	{
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.nombreUsuario = nombreUsuario;
		this.cedulaUsuario = cedulaUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.contraseniaUsuario = contraseniaUsuario;
		this.creado = creado;
		this.actualizado = actualizado;
		this.activo = activo;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCedulaUsuario() {
		return cedulaUsuario;
	}

	public void setCedulaUsuario(String cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}

	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public String getContraseniaUsuario() {
		return contraseniaUsuario;
	}

	public void setContraseniaUsuario(String contraseniaUsuario) {
		this.contraseniaUsuario = contraseniaUsuario;
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