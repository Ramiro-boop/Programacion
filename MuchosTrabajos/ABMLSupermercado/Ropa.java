package Supermercado;

public class Ropa extends Producto{

	private String talla; //S,M,L,etc
	private String material;
	
	


	public Ropa(int ID,String nombre, double precio, String talla, String material) {
		super(ID,nombre, precio);
		this.talla = talla;
		this.material = material;
	}




	public String getTalla() {
		return talla;
	}




	public void setTalla(String talla) {
		this.talla = talla;
	}




	public String getMaterial() {
		return material;
	}




	public void setMaterial(String material) {
		this.material = material;
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Talla: "+talla+", Material: "+material;
	}




	

}
