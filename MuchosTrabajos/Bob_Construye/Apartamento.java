package Bob_construye;

public class Apartamento extends Edificio{

	private int numApartamento;

	public Apartamento(String direccion, int cantidadPisos, int numApartamento) {
		super(direccion, cantidadPisos);
		this.numApartamento = numApartamento;
	}

	public int getNumApartamento() {
		return numApartamento;
	}

	public void setNumApartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " número del apartamento: "+numApartamento;
	}
	
}
