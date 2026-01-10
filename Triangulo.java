package DeberHerencia;

import java.util.Scanner;

public class Triangulo extends FiguraGeometrica {

	double base;
	double altura;
	
	public Triangulo(int area,int perimetro, double base, double altura) {
		super(area,perimetro);
		this.base = base;
		this.altura = altura;
		
	}
	
	public static void main(String[] args) {


        Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese el area del triangulo");
		int area = L.nextInt();
		System.out.println("Ingrese el perimetro");
		int perimetro = L.nextInt();
		System.out.println("Ingrese la base");
		double base = L.nextDouble();
		System.out.println("Ingrese la altura");
		double altura = L.nextDouble();
		Triangulo tr1 = new Triangulo(area,perimetro,base,altura);
		System.out.println(tr1);

	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Area: "+area+" Perimetro: "+perimetro+ " Base: "+ base+ " Altura: "+ altura;
	}

	}


