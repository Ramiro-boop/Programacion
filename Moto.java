package DeberHerencia;

public class Moto extends Vehiculo{

	int cilindrada;
	
	public Moto(int ruedas,String marca,String color,int cilindrada) {
		super(ruedas,marca,color);
		
		this.cilindrada = cilindrada;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
