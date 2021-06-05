package model;

public class Empleado {

	private int idEmpleado;
	private String dniEmpleado;
	private String nombreEmpleado;
	private String formacionEmpleado;
	private int antiguedadEmpleado;
	private String puestoEmpleado;
	
	
	public Empleado() {
		
	}


	public Empleado(String dniEmpleado, String nombreEmpleado, String formacionEmpleado, int antiguedadEmpleado, String puestoEmpleado) {
		super();
		this.dniEmpleado = dniEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.formacionEmpleado = formacionEmpleado;
		this.antiguedadEmpleado = antiguedadEmpleado;
		this.puestoEmpleado = puestoEmpleado;

	}


	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getDniEmpleado() {
		return dniEmpleado;
	}


	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}


	public String getNombreEmpleado() {
		return nombreEmpleado;
	}


	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}


	public String getFormacionEmpleado() {
		return formacionEmpleado;
	}


	public void setFormacionEmpleado(String formacionEmpleado) {
		formacionEmpleado = formacionEmpleado;
	}


	public int getAntiguedadEmpleado() {
		return antiguedadEmpleado;
	}


	public void setAntiguedadEmpleado(int i) {
		this.antiguedadEmpleado = i;
	}


	public String getPuestoEmpleado() {
		return puestoEmpleado;
	}


	public void setPuestoEmpleado(String puestoEmpleado) {
		this.puestoEmpleado = puestoEmpleado;
	}
	
	
}
