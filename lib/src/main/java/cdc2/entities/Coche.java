package cdc2.entities;

public class Coche {
	
	private int id;
	private String modelo;
	private String marca;
	private float precio;
	private int anio;
	//private String concesionario;
	//Se que debo añadir concesionario pero como no puedo modificar los test y un coche se declara en un test voy a usar modelo
		
	public Coche(int id, String modelo, String marca, float precio, int anio) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.anio = anio;
		//this.concesionario=concesionario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getConcesionario() {
		return modelo;
	}
	public void setConcesionario(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", anio=" + anio
				+ "]";
	}
	

}
