package Clase_14_05_25;

public class Vehiculo {

	private String marca;
	private String tipo;
	private String color;
	
	
	
	public Vehiculo(String marca, String tipo, String color) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.color = color;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marca: "+marca+" Tipo: "+tipo+" color: "+color;
	}




}
