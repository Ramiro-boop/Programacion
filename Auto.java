package clase_09_04_25;

import java.util.Scanner;

public class Auto {
	
	String marca;
	String modelo;
	int puertas;
	double kilometraje;
	
	public Auto (String marca,String modelo, int puertas,double kilometraje ){
		
		this.marca = marca;
		this.modelo = modelo;
		this.puertas = puertas;
		this.kilometraje = kilometraje;
		
	}

	public static void main(String[] args) {

		Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese la marca del auto 1");
		System.out.print(">");
		String marca1 = L.nextLine();
		System.out.println("Ingrese el modelo del auto 1");
		System.out.print(">");
		String modelo1 = L.nextLine();
		System.out.println("Ingrese la cantidad de puertas que tiene el auto 1");
		System.out.print(">");
		int puertas = L.nextInt();
		System.out.println("¿Cuantos kilometros tiene?");
		System.out.print(">");
	    double kil = L.nextDouble();
		
	    System.out.println(" ");
		System.out.println("Ingrese la marca del auto 2");
		System.out.print(">");
		String marca2 = L.next();
		System.out.println("Ingrese el modelo del auto 2");
		System.out.print(">");
		String modelo2 = L.next();
		System.out.println("Ingrese la cantidad de puertas que tiene el auto 2");
		System.out.print(">");
		int puertas2 = L.nextInt();
		System.out.println("¿Cuantos kilometros tiene?");
		System.out.print(">");
	    double kil2 = L.nextDouble();
		
		Auto auto1 = new Auto(marca1,modelo1,puertas,kil);
		System.out.println("Auto 1:");
		System.out.println("Marca: "+ auto1.marca);
		System.out.println("Modelo: "+ auto1.modelo);
		System.out.println("Cant de puertas: "+ auto1.puertas);
		System.out.println("Kilometros recorridos: "+ auto1.kilometraje);
		
		System.out.println(" ");
		Auto auto2 = new Auto(marca2,modelo2,puertas2,kil2);
		System.out.println("Auto 2:");
		System.out.println("Marca: "+ auto2.marca);
		System.out.println("Modelo: "+ auto2.modelo);
		System.out.println("Cant de puertas: "+ auto2.puertas);
		System.out.println("Kilometros recorridos: "+ auto2.kilometraje);
		
	    
	    
		
		
	}

}
