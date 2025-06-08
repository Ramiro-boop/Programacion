package Arte;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner L = new Scanner(System.in);
		
		Pintura P1 = new Pintura (null,null,null,null);
		Escultura E1 = new Escultura (null,null,null,0);
		Fotografia F1 = new Fotografia (null,null,null,null);
		
		System.out.println("-----------------------------------------");
		System.out.println("Pintura:");
		System.out.println("Ingrese el nombre de la pintura:");
		System.out.print(">");
		P1.setTitulo(L.next());
		System.out.println("Ingrese el nombre del autor:");
		System.out.print(">");
		P1.setAutor(L.next());
		System.out.println("Ingrese el tipo de pintura que se uso:");
		System.out.print(">");
		P1.setTipoPintura(L.next());
		System.out.println("Ingrese el soporte que se uso: (lienzo, papel, etc)");
		System.out.print(">");
		P1.setSoporte(L.next());
		
		System.out.println("-----------------------------------------");
		System.out.println("Escultura:");
		System.out.println("Ingrese el nombre de la escultura:");
		System.out.print(">");
		E1.setTitulo(L.next());
		System.out.println("Ingrese el nombre del autor:");
		System.out.print(">");
		E1.setAutor(L.next());
		System.out.println("Ingrese el material del que esta hecha:");
		System.out.print(">");
		E1.setMaterial(L.next());
		System.out.println("Ingrese el peso en kg");
		System.out.print(">");
		E1.setPeso(L.nextInt());
		
		System.out.println("-----------------------------------------");
		System.out.println("Fotografia:");
		System.out.println("Ingrese el nombre de la foto:");
		System.out.print(">");
		F1.setTitulo(L.next());
		System.out.println("Ingrese el nombre del que la tomo:");
		System.out.print(">");
		F1.setAutor(L.next());
		System.out.println("Ingrese el formato:");
		System.out.print(">");
		F1.setFormato(L.next());
		System.out.println("Ingrese la resolución");
		System.out.print(">");
		F1.setResolucion(L.next());
		
		System.out.println("Pintura:");
		System.out.println(P1);
		System.out.println(" ");
		
		System.out.println("Escultura:");
		System.out.println(E1);
		System.out.println(" ");		
		
		System.out.println("Fotografia:");
		System.out.println(F1);

	}

}
