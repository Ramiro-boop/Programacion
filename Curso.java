package clase_09_04_25;

import java.util.Scanner;

public class Curso {
	
	String Nombre;
	String profesor;
	int CantPersonas;
	double duracion;
	
public Curso (String Nombre,String profesor, int CantPersonas,double duracion ){
		
		this.Nombre = Nombre;
		this.profesor = profesor;
		this.CantPersonas = CantPersonas;
		this.duracion = duracion;
		
	}

	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Curso 1:");
		System.out.println("Ingrese el nombre del curso ");
		System.out.print(">");
		String nombre1 = L.next();
		System.out.println("Ingrese el nombre del profesor");
		System.out.print(">");
		String profesor1 = L.next();
		System.out.println("Ingrese la cantidad de alumnos");
		System.out.print(">");
		int personas1 = L.nextInt();
		System.out.println("Ingrese la duracion");
		System.out.print(">");
	    double duracion1= L.nextDouble();
		Curso Curso1 = new Curso(nombre1,profesor1,personas1,duracion1);
		System.out.println("");
		
		System.out.println("Curso 2:");
		System.out.println("Ingrese el nombre del curso ");
		System.out.print(">");
		String nombre2 = L.next();
		System.out.println("Ingrese el nombre del profesor");
		System.out.print(">");
		String profesor2 = L.next();
		System.out.println("Ingrese la cantidad de alumnos");
		System.out.print(">");
		int personas2 = L.nextInt();
		System.out.println("Ingrese la duracion");
		System.out.print(">");
	    double duracion2= L.nextDouble();
		Curso Curso2 = new Curso(nombre2,profesor2,personas2,duracion2);
		System.out.println("");
		
		System.out.println("Curso 1:");
		System.out.println("Nombre del curso: " + Curso1.Nombre);
		System.out.println("Profesor: " + Curso1.profesor);
		System.out.println("Cantidad de personas: "+ Curso1.CantPersonas);
		System.out.println("Duración: " + Curso1.duracion);
		System.out.println(" ");
		

		System.out.println("Curso 2:");
		System.out.println("Nombre del curso: " + Curso2.Nombre);
		System.out.println("Profesor: " + Curso2.profesor);
		System.out.println("Cantidad de personas: "+ Curso2.CantPersonas);
		System.out.println("Duración: " + Curso2.duracion);
		System.out.println(" ");
		
		
		
	}

}
