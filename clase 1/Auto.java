package Clase_14_05_25;

public class Auto extends Vehiculo{

	private int puertas;
	
	
	public Auto(String marca, String tipo, String color, int puertas) {
		super(marca, tipo, color);
		this.puertas = puertas;
	}



	public int getPuertas() {
		return puertas;
	}



	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+" Cantidad de puertas: "+puertas;
}


	}


