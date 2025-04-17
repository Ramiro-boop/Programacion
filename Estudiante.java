package clase_09_04_25;

import java.util.Scanner;

public class Estudiante {
	
	String nombre;
	String apellido;
	int edad;
	double altura;
	
public Estudiante (String nombre,String apellido, int edad,double altura ){
		
		this.nombre = nombre;
		this.apellido= apellido;
		this.edad = edad;
		this.altura = altura;
		
	}

	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del estudiante 1");
		System.out.print(">");
		String nombre1 = L.next();
		System.out.println("Ingrese el apellido del estudiante 1");
		System.out.print(">");
		String apellido1 = L.next();
		System.out.println("Ingrese la edad del estudiante 1");
		System.out.print(">");
		int edad1 = L.nextInt();
		System.out.println("Ingrese la altura del estudiante 1");
		System.out.print(">");
	    double altura1 = L.nextDouble();
		Estudiante estudiante1 = new Estudiante(nombre1,apellido1,edad1,altura1);
		System.out.println("");
		
		System.out.println("Ingrese el nombre del estudiante 2");
		System.out.print(">");
		String nombre2 = L.next();
		System.out.println("Ingrese el apellido del estudiante 2");
		System.out.print(">");
		String apellido2 = L.next();
		System.out.println("Ingrese la edad del estudiante 2");
		System.out.print(">");
		int edad2 = L.nextInt();
		System.out.println("Ingrese la altura del estudiante 2");
		System.out.print(">");
	    double altura2 = L.nextDouble();
		Estudiante estudiante2 = new Estudiante(nombre2,apellido2,edad2,altura2);
		System.out.println("");
		
		System.out.println("Estudiante 1:");
		System.out.println("Nombre: " + estudiante1.nombre);
		System.out.println("Apellido " + estudiante1.apellido );
		System.out.println("Edad "+ estudiante1.edad);
		System.out.println("Altura: " + estudiante1.altura);
		System.out.println(" ");
		
		System.out.println("Estudiante 2:");
		System.out.println("Nombre: " + estudiante2.nombre);
		System.out.println("Apellido: " + estudiante2.apellido );
		System.out.println("Edad: "+ estudiante2.edad);
		System.out.println("altura: " + estudiante2.altura);
		
	}

}
