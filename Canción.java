package clase_09_04_25;

import java.util.Scanner;

public class Canción {
	
	String nombre;
	String autor;
	int vistas;
	double duracion;
	
public Canción (String nombre,String autor, int vistas,double duracion ){
		
		this.nombre = nombre;
		this.autor= autor;
		this.vistas = vistas;
		this.duracion = duracion;
		
	}

	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de la canción 1");
		System.out.print(">");
		String nombre1 = L.next();
		System.out.println("Ingrese el autor de la canción 1");
		System.out.print(">");
		String autor1 = L.next();
		System.out.println("Ingrese las vistas de la canción 1");
		System.out.print(">");
		int vistas1 = L.nextInt();
		System.out.println("Ingrese la duración de la canción 1");
		System.out.print(">");
	    double duracion1 = L.nextDouble();
		Canción cancion1 = new Canción(nombre1,autor1,vistas1,duracion1);
		System.out.println("");
		
		System.out.println("Ingrese el nombre de la canción 2");
		System.out.print(">");
		String nombre2 = L.next();
		System.out.println("Ingrese el autor de la canción 2");
		System.out.print(">");
		String autor2 = L.next();
		System.out.println("Ingrese las vistas de la canción 2");
		System.out.print(">");
		int vistas2 = L.nextInt();
		System.out.println("Ingrese la duración de la canción 2");
		System.out.print(">");
	    double duracion2 = L.nextDouble();
		Canción cancion2 = new Canción(nombre2,autor2,vistas2,duracion2);
		System.out.println("");
		
		System.out.println("Canción 1:");
		System.out.println("Nombre: " + cancion1.nombre);
		System.out.println("Autor: " + cancion1.autor );
		System.out.println("Vistas: "+ cancion1.vistas);
		System.out.println("Duración: " + cancion1.duracion);
		System.out.println(" ");
		
		System.out.println("Canción 2:");
		System.out.println("Nombre: " + cancion2.nombre);
		System.out.println("Autor: " + cancion2.autor );
		System.out.println("Vistas: "+ cancion2.vistas);
		System.out.println("Duración: " + cancion2.duracion);
		System.out.println(" ");
		
	}

}
