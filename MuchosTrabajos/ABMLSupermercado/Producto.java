package Supermercado;

public class Producto {
	
	private int ID;
	private String nombre;
	private double precio;
	
	

	public Producto(int ID,String nombre, double precio) {
		this.ID = ID;
		this.nombre = nombre;
		this.precio = precio;
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID : " + ID +", nombre: "+nombre+", precio: "+precio;
	}



}
