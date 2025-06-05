package Supermercado;

public class Alimento extends Producto {

	private String tipo;
	private double peso;
	
	
	
	public Alimento(String nombre, double precio, String tipo, double peso) {
		super(nombre, precio);
		this.tipo = tipo;
		this.peso = peso;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Tipo: "+tipo+", Pesa: "+peso+"Kg";
	}


}
