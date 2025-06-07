package Bob_construye;

public class Casa extends Edificio{
	
	private  double metraje;

	public Casa(String direccion, int cantidadPisos, double metraje) {
		super(direccion, cantidadPisos);
		this.metraje = metraje;
	}

	public double getMetraje() {
		return metraje;
	}

	public void setMetraje(double metraje) {
		this.metraje = metraje;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString() + " La casa tiene "+metraje+" metros cuadrados";
}
	
	
}
