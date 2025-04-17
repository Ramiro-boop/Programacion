package clase_09_04_25;

import java.util.Scanner;

public class Computadora {
	
	String Marca;
	int Almacenamiento;
	int RAM;
	double Precio;
	
public Computadora (String Marca,int Almacenamiento, int RAM,double Precio ){
		
		this.Marca = Marca;
		this.Almacenamiento = Almacenamiento;
		this.RAM = RAM;
		this.Precio= Precio;
		
	}

	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Camputadora 1:");
		System.out.println("Ingrese la marca de la computadora ");
		System.out.print(">");
		String marca1 = L.next();
		System.out.println("¿Cuantos GB de almacenamiento que tiene su computadora?");
		System.out.print(">");
		int almacenamiento1 = L.nextInt();
		System.out.println("¿Cuantos GB de RAM que tiene su computadora?");
		System.out.print(">");
		int RAM1 = L.nextInt();
		System.out.println("Ingrese el precio de la computadora");
		System.out.print(">");
	    double precio1= L.nextDouble();
		Computadora Compu1 = new Computadora(marca1,almacenamiento1,RAM1,precio1);
		System.out.println("");
		
		System.out.println("Camputadora 1:");
		System.out.println("Ingrese la marca de la computadora ");
		System.out.print(">");
		String marca2 = L.next();
		System.out.println("¿Cuantos GB de almacenamiento que tiene su computadora?");
		System.out.print(">");
		int almacenamiento2 = L.nextInt();
		System.out.println("¿Cuantos GB de RAM que tiene su computadora?");
		System.out.print(">");
		int RAM2 = L.nextInt();
		System.out.println("Ingrese el precio de la computadora");
		System.out.print(">");
	    double precio2= L.nextDouble();
		Computadora Compu2 = new Computadora(marca2,almacenamiento2,RAM2,precio2);
		System.out.println("");
		
		System.out.println("Computadora 1:");
		System.out.println("Marca: " + Compu1.Marca);
		System.out.println("Almacenamiento: " + Compu1.Almacenamiento);
		System.out.println("RAM: "+ Compu1.RAM);
		System.out.println("Precio: " + Compu1.Precio);
		System.out.println(" ");		
		
		System.out.println("Computadora 2:");
		System.out.println("Marca: " + Compu2.Marca);
		System.out.println("Almacenamiento: " + Compu2.Almacenamiento);
		System.out.println("RAM: "+ Compu2.RAM);
		System.out.println("Precio: " + Compu2.Precio);
		System.out.println(" ");
		
		L.close();
		
	}

}
