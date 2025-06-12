package Supermercado;

public class Electronica extends Producto {

	private String marca;
	private double consumo;
	
	
	
	public Electronica(int ID, String nombre, double precio, String marca, double consumo) {
		super(ID,nombre, precio);
		this.marca = marca;
		this.consumo = consumo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public double getConsumo() {
		return consumo;
	}



	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Marca: "+marca+", Consumo: "+consumo;
	}




}
