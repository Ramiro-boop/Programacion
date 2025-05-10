package DeberHerencia;

public class Circulo extends FiguraGeometrica{

	double radio;
	double circunferencia;
	
	
	public Circulo(int lados, int perimetro, double radio, double circunferencia) {
		super(lados, perimetro);
		this.radio = radio;
		this.circunferencia = circunferencia;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
