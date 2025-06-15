package Bob_construye;



public class Edificio {
	
	private int ID;
	private String direccion;
	private int cantidadPisos;
	
	
	public Edificio(int ID,String direccion, int cantidadPisos) {
		super();
		this.ID = ID;
		this.direccion = direccion;
		this.cantidadPisos = cantidadPisos;
	}
	

	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
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
		return "ID: " + ID + ", dirección: " + direccion + ", Cantidad de pisos: " + cantidadPisos;
	}
	
	
}
