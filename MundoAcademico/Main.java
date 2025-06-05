package MundoAcademico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner L = new Scanner(System.in);
		
		Libro L1 = new Libro(null,null,0,null);
		Revista R1 = new Revista(null,null,0,null);
		ArticuloCientifico A1 = new ArticuloCientifico(null,null,null,null);
		
		System.out.println("-----------------------------------------");
		System.out.println("Libro:");
		System.out.println("Ingrese el titulo");
		System.out.print(">");
		L1.setTitulo(L.next());
		System.out.println("Ingrese el autor");
		System.out.print(">");
		L1.setAutor(L.next());
		System.out.println("Ingrese la cantidad de paginas");
		System.out.print(">");
		L1.setNumPaginas(L.nextInt());
		System.out.println("Ingrese el ISBN");
		System.out.print(">");
		L1.setISBN(L.next());
		
		System.out.println("-----------------------------------------");
		System.out.println("Revista:");
		System.out.println("Ingrese el titulo");
		System.out.print(">");
		R1.setTitulo(L.next());
		System.out.println("Ingrese el autor");
		System.out.print(">");
		R1.setAutor(L.next());
		System.out.println("Ingrese el número de edición");
		System.out.print(">");
		R1.setNumEdicion(L.nextInt());
		System.out.println("Ingrese el mes en el que se a publicado");
		System.out.print(">");
		R1.setMesPublicacion(L.next());
		
		System.out.println("-----------------------------------------");
		System.out.println("Articulo Cientifico:");
		System.out.println("Ingrese el titulo");
		System.out.print(">");
		A1.setTitulo(L.next());
		System.out.println("Ingrese el autor");
		System.out.print(">");
		A1.setAutor(L.next());
		System.out.println("Ingrese el DOI");
		System.out.print(">");
		A1.setDOI(L.next());
		System.out.println("Ingrese el nombre de la revista del que fue sacado este articulo");
		System.out.print(">");
		A1.setNombreRevista(L.next());
		System.out.println("-----------------------------------------");
		
		System.out.println("Libro:");
		System.out.println(L1);
		System.out.println(" ");
		
		System.out.println("Revista:");
		System.out.println(R1);
		System.out.println(" ");
		
		System.out.println("Articulo Cientifico:");
		System.out.println(A1);
		
		
		
		
	}

}
