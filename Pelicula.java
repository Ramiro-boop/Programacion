package clase_09_04_25;

import java.util.Scanner;

public class Pelicula {
	
	String nombre;
	String FechaDeCreacion;
	int recaudacion;
	double duracion;
	
public Pelicula (String nombre,String FechaDeCreacion, int recaudacion,double duracion ){
		
		this.nombre = nombre;
		this.FechaDeCreacion = FechaDeCreacion;
		this.recaudacion  = recaudacion;
		this.duracion = duracion;
		
	}

	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de la pelicula 1");
		System.out.print(">");
		String nombre1 = L.next();
		System.out.println("Ingrese la Fecha de cracion de la pelicula 1 (ej: 12_7_22)");
		System.out.print(">");
		String fecha1 = L.next();
		System.out.println("Ingrese la recaudación que tuvo la pelicula 1");
		System.out.print(">");
		int recaudacion1 = L.nextInt();
		System.out.println("Ingrese la duración de la pelicula 1");
		System.out.print(">");
	    double duracion1 = L.nextDouble();
		Pelicula pelicula1 = new Pelicula(nombre1,fecha1,recaudacion1,duracion1);
		System.out.println("");
		
		System.out.println("Ingrese el nombre de la pelicula 2");
		System.out.print(">");
		String nombre2 = L.next();
		System.out.println("Ingrese la Fecha de cracion de la pelicula 2 (ej: 12_7_22)");
		System.out.print(">");
		String fecha2 = L.next();
		System.out.println("Ingrese la recaudación que tuvo la pelicula 2");
		System.out.print(">");
		int recaudacion2 = L.nextInt();
		System.out.println("Ingrese la duración de la pelicula 2");
		System.out.print(">");
	    double duracion2 = L.nextDouble();
		Pelicula pelicula2 = new Pelicula(nombre2,fecha2,recaudacion2,duracion2);
		System.out.println("");
		
		
		System.out.println("Pelicula 1:");
		System.out.println("Nombre: " + pelicula1.nombre);
		System.out.println("Fecha de creación: " + pelicula1.FechaDeCreacion );
		System.out.println("Recaudación: "+ pelicula1.recaudacion);
		System.out.println("Duración: " + pelicula1.duracion);
		System.out.println(" ");
		

		System.out.println("Pelicula 2:");
		System.out.println("Nombre: " + pelicula2.nombre);
		System.out.println("Fecha de creación: " + pelicula2.FechaDeCreacion );
		System.out.println("Recaudación: "+ pelicula2.recaudacion);
		System.out.println("Duración: " + pelicula2.duracion);
		System.out.println(" ");
		
		
	}

}
