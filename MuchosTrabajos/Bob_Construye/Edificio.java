package Bob_construye;



public class Edificio {
	
	private String direccion;
	private int cantidadPisos;
	
	public Edificio(String direccion, int cantidadPisos) {
		super();
		this.direccion = direccion;
		this.cantidadPisos = cantidadPisos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidadPisos() {
		return cantidadPisos;
	}

	public void setCantidadPisos(int cantidadPisos) {
		this.cantidadPisos = cantidadPisos;
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dirección: " + direccion + ", Cantidad de pisos: " + cantidadPisos;
	}
	
	
}
