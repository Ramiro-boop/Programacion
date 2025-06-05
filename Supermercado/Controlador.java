package Supermercado;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {

		Scanner L = new Scanner(System.in);
		
		Electronica E1 = new Electronica(null,0,null,0);
		Ropa R1 = new Ropa(null,0,null,null);
		Alimento A1 = new Alimento(null,0,null,0);
		
		System.out.println("Electronica:");
		System.out.println("Ingrese el nombre");
		System.out.print(">");
		E1.setNombre(L.next());
		System.out.println("Ingrese el precio");
		System.out.print(">");
		E1.setPrecio(L.nextInt());
		System.out.println("Ingrese la marca");
		System.out.print(">");
		E1.setMarca(L.next());
		System.out.println("Ingrese el consumo en kWh");
		System.out.print(">");
		E1.setConsumo(L.nextDouble());
		
		System.out.println("Ropa:");
		System.out.println("Ingrese el nombre");
		System.out.print(">");
		R1.setNombre(L.next());
		System.out.println("Ingrese el precio");
		System.out.print(">");
		R1.setPrecio(L.nextInt());
		System.out.println("Ingrese la talla");
		System.out.print(">");
		R1.setTalla(L.next());
		System.out.println("Ingrese el material");
		System.out.print(">");
		R1.setMaterial(L.next());
		
		System.out.println("Alimento:");
		System.out.println("Ingrese el nombre");
		System.out.print(">");
		A1.setNombre(L.next());
		System.out.println("Ingrese el precio");
		System.out.print(">");
		A1.setPrecio(L.nextInt());
		System.out.println("Ingrese el tipo (Fruta,verdura,etc)");
		System.out.print(">");
		A1.setTipo(L.next());
		System.out.println("Ingrese el peso en Kg");
		System.out.print(">");
		A1.setPeso(L.nextDouble());

		System.out.println(E1);
		System.out.println(R1);
		System.out.println(A1);
		

	}

}
