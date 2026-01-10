package DeberHerencia;

import java.util.Scanner;

public class Circulo extends FiguraGeometrica{

	double radio;
	double circunferencia;
	
	
	public Circulo(int area, int perimetro, double radio, double circunferencia) {
		super(area, perimetro);
		this.radio = radio;
		this.circunferencia = circunferencia;
	}



	public static void main(String[] args) {


        Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese el area del circulo");
		int area = L.nextInt();
		System.out.println("Ingrese el perimetro");
		int perimetro = L.nextInt();
		System.out.println("Ingrese el radio");
		double radio = L.nextDouble();
		System.out.println("Ingrese la circunferencia");
		double cir = L.nextDouble();
		Circulo cir1 = new Circulo(area,perimetro,radio,cir);
		System.out.println(cir1);

	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Area: "+area+" Perimetro: "+perimetro+ " Radio: "+ radio+ " Circunferencia: "+circunferencia;
	}


	}


