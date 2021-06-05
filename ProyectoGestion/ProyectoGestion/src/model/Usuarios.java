package model;

public class Usuarios {

	private int idUsuario;
	private String nombreUsuario;
	private String contrasenaUsuario;
	private String tipoUsuario;
	
	public Usuarios() {
	}

	public Usuarios(String nombreUsuario, String contrasenaUsuario, String tipoUsuario) {
		
		
		this.nombreUsuario = nombreUsuario;
		this.contrasenaUsuario = contrasenaUsuario;
		this.tipoUsuario = tipoUsuario;
		
	}
	
	

	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getContrasenaUsuario() {
		return contrasenaUsuario;
	}
	public void setContrasenaUsuario(String contrasenaUsuario) {
		this.contrasenaUsuario = contrasenaUsuario;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
}
