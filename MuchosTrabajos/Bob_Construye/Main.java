package Bob_construye;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		Casa C1 = new Casa(null,0,0);
		Apartamento A1 = new Apartamento (null,0,0);
		
		System.out.println("-----------------------------------------");
		System.out.println("Casa:");
		System.out.println("Ingrese la dirección:");
		System.out.print(">");
		C1.setDireccion(L.next());
		System.out.println("Ingrese la cantidad de pisos");
		System.out.print(">");
		C1.setCantidadPisos(L.nextInt());
		System.out.println("Ingrese la cantidad de metros cuadrados que tiene");
		System.out.print(">");
		C1.setMetraje(L.nextDouble());
		
		System.out.println("-----------------------------------------");
		System.out.println("Apartamento:");
		System.out.println("Ingrese la dirección:");
		System.out.print(">");
		A1.setDireccion(L.next());
		System.out.println("Ingrese la cantidad de pisos");
		System.out.print(">");
		A1.setCantidadPisos(L.nextInt());
		System.out.println("Ingrese el número de apartamento");
		System.out.print(">");
		A1.setNumApartamento(L.nextInt());
		
		System.out.println("Casa:");
		System.out.println(C1);
		System.out.println(" ");
		
		System.out.println("Apartamento:");
		System.out.println(A1);
		System.out.println(" ");

	}

}
