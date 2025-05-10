package DeberHerencia;

import java.util.Scanner;

public class Auto extends Vehiculo{

	int puertas;
	
	public Auto (String tipo,String marca,String color,int puertas) {
	super(tipo,marca,color);
	
	this.puertas = puertas;
	}
	
	
	public static void main(String[] args) {
	
		Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese la marca del auto");
		String marca = L.next();
		System.out.println("Ingrese el tipo del auto");
		String tipo = L.next();
		System.out.println("Ingrese el color del auto");
		String color = L.next();
		System.out.println("Ingrese la cantidad de puertas que tiene");
		int puertas = L.nextInt();
	
		Auto auto1 = new Auto(tipo,marca,color,puertas);
		System.out.println(auto1);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marca: " + marca + " Tipo: " + tipo + " Color: " + " Puertas: " + puertas;
	}

}
