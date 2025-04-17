package clase_09_04_25;

import java.util.Scanner;

public class Producto {
	
	String nombre;
	String marca;
	int stock;
	double precio;
	
public Producto (String nombre,String marca, int stock,double precio ){
		
		this.nombre = nombre;
		this.marca = marca;
		this.stock = stock;
		this.precio = precio;
		
	}

	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del producto 1");
		System.out.print(">");
		String nombre1 = L.next();
		System.out.println("Ingrese la marca del producto  1");
		System.out.print(">");
		String marca1 = L.next();
		System.out.println("Ingrese el stock del producto 1");
		System.out.print(">");
		int stock1 = L.nextInt();
		System.out.println("Ingrese el precio del producto 1");
		System.out.print(">");
	    double precio1 = L.nextDouble();
		Producto producto1 = new Producto(nombre1,marca1,stock1,precio1);
		System.out.println("");
		
		System.out.println("Ingrese el nombre del producto 2");
		System.out.print(">");
		String nombre2 = L.next();
		System.out.println("Ingrese la marca del producto  2");
		System.out.print(">");
		String marca2 = L.next();
		System.out.println("Ingrese el stock del producto 2");
		System.out.print(">");
		int stock2 = L.nextInt();
		System.out.println("Ingrese el precio del producto 2");
		System.out.print(">");
	    double precio2 = L.nextDouble();
		Producto producto2 = new Producto(nombre2,marca2,stock2,precio2);
		System.out.println("");
		
		
		System.out.println("Producto 1:");
		System.out.println("Nombre: " + producto1.nombre);
		System.out.println("Marca: " + producto1.marca );
		System.out.println("Stock: "+ producto1.stock);
		System.out.println("Precio: " + producto1.precio);
		System.out.println(" ");
		

		System.out.println("Producto 2:");
		System.out.println("Nombre: " + producto2.nombre);
		System.out.println("Marca: " + producto2.marca );
		System.out.println("Stock: "+ producto2.stock);
		System.out.println("Precio: " + producto2.precio);
		System.out.println(" ");
		
	}

}
