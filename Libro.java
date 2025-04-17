package clase_09_04_25;

import java.util.Scanner;

public class Libro {
	
	String titulo;
	String autor;
	int paginas;
	double precio;
	
public Libro (String titulo,String autor, int paginas,double precio ){
		
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.precio = precio;
		
	}

	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese el titulo del libro 1");
		System.out.print(">");
		String titulo1 = L.nextLine();
		System.out.println("Ingrese el autor del libro 1");
		System.out.print(">");
		String autor1 = L.nextLine();
		System.out.println("Ingrese la cantidad de paginas del libro 1");
		System.out.print(">");
		int paginas = L.nextInt();
		System.out.println("Ingrese el precio del libro 1");
		System.out.print(">");
	    double precio1 = L.nextDouble();
		Libro libro1 = new Libro(titulo1,autor1,paginas,precio1);
		System.out.println("");
		
		System.out.println("Ingrese el titulo del libro 2");
		System.out.print(">");
		String titulo2 = L.nextLine();
		System.out.println("Ingrese el autor del libro 2");
		System.out.print(">");
		String autor2 = L.nextLine();
		System.out.println("Ingrese la cantidad de paginas del libro 2");
		System.out.print(">");
		int paginas2 = L.nextInt();
		System.out.println("Ingrese el precio del libro 2");
		System.out.print(">");
	    double precio2 = L.nextDouble();
		Libro libro2 = new Libro(titulo2,autor2,paginas2,precio2);
		
		System.out.println("Libro 1:");
		System.out.println("Titulo "+ libro1.titulo);
		System.out.println("Autor: "+ libro1.autor);
		System.out.println("Cantidad de paginas: "+ libro1.paginas);
		System.out.println("precio:" + libro1.precio);
		
		System.out.println("Libro 2:");
		System.out.println("Titulo "+ libro2.titulo);
		System.out.println("Autor: "+ libro2.autor);
		System.out.println("Cantidad de paginas: "+ libro2.paginas);
		System.out.println("precio:" + libro2.precio);
		
		
	}

}
