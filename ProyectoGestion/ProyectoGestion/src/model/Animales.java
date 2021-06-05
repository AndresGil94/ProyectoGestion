package model;

public class Animales {

	private int idAnimal;
	private String razaAnimal;
	private int pesoAnimal;
	private int edadAnimal;
	private String paisOrigenAnimal;
	private String habitatAnimal;
	
	
	public Animales() {
	}
	public Animales(String razaAnimal, int pesoAnimal, int edadAnimal, String paisOrigenAnimal,
			String habitatAnimal) {
		
		this.razaAnimal = razaAnimal;
		this.pesoAnimal = pesoAnimal;
		this.edadAnimal = edadAnimal;
		this.paisOrigenAnimal = paisOrigenAnimal;
		this.habitatAnimal = habitatAnimal;
	}
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getRazaAnimal() {
		return razaAnimal;
	}
	public void setRazaAnimal(String razaAnimal) {
		this.razaAnimal = razaAnimal;
	}
	public int getPesoAnimal() {
		return pesoAnimal;
	}
	public void setPesoAnimal(int pesoAnimal) {
		this.pesoAnimal = pesoAnimal;
	}
	public int getEdadAnimal() {
		return edadAnimal;
	}
	public void setEdadAnimal(int edadAnimal) {
		this.edadAnimal = edadAnimal;
	}
	public String getPaisOrigenAnimal() {
		return paisOrigenAnimal;
	}
	public void setPaisOrigenAnimal(String paisOrigenAnimal) {
		this.paisOrigenAnimal = paisOrigenAnimal;
	}
	public String getHabitatAnimal() {
		return habitatAnimal;
	}
	public void setHabitatAnimal(String habitatAnimal) {
		this.habitatAnimal = habitatAnimal;
	}
	
	
}
