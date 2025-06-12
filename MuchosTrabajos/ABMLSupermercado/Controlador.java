package Supermercado;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {

		int opcion1;
		int opcion2;

		Electronica[] arregloE = new Electronica[10];
		Ropa[] arregloR = new Ropa[10];
		Alimento[] arregloA = new Alimento[10];

		do {

			Scanner L = new Scanner(System.in);
			System.out.println("Ingese un opción:");
			System.out.println("1- Electronica");
			System.out.println("2- Ropa");
			System.out.println("3- Alimento");
			System.out.println("4- Terminar programa");
			opcion1 = L.nextInt();

			if(opcion1 != 4) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("1- Agregar");
			System.out.println("2- Eliminar");
			System.out.println("3- Modificar (Nombre)");
			System.out.println("4- Mostrar lista");
			opcion2 = L.nextInt();
			
			switch (opcion1) {

			case 1:

				switch (opcion2) {

				case 1:// AltaElectronica

					altaElectronica(arregloE, L);

					break;

				case 2:// BajaElectronica

					bajaElectronica(arregloE, L);

					break;

				case 3:// ModificarElectronica

					modificarElectronica(arregloE, L);

					break;

				case 4:// ListarElectronica

					listarElectronica(arregloE);

					break;

				}

				break;

			case 2:

				switch (opcion2) {

				case 1:// AltaRopa
				
					altaRopa(arregloR, L);
					
					break;

				case 2:// BajaRopa

					bajaRopa(arregloR, L);
					
					break;

				case 3:// ModificarRopa

					modificarRopa(arregloR, L);
					
					break;

				case 4:// ListarRopa
					listarRopa(arregloR);
					break;

				}

				break;

			case 3:

				switch (opcion2) {

				case 1:// AltaAlimento
					altaAlimento(arregloA, L);
					break;

				case 2:// BajaAlimento
					bajaAlimento(arregloA, L);
					break;

				case 3:// ModificarAlimento
					modificarAlimento(arregloA, L);
					break;

				case 4:// ListarAlimento
					listarAlimento(arregloA);
					break;

				}

				break;

				default:
					System.out.println("Opcion no valida");
					break;
			}
			}

		} while (opcion1 != 4);

		System.out.println("Programa terminado");
	
	}

	public static void altaElectronica(Electronica[] arregloE, Scanner L) {
																			
		System.out.println("Electronica:");
		System.out.println("Ingrese el ID");
		System.out.print(">");
		int ID = L.nextInt();
		System.out.println("Ingrese el nombre");
		System.out.print(">");
		String nombre = L.next();
		System.out.println("Ingrese el precio");
		System.out.print(">");
		int precio = L.nextInt();
		System.out.println("Ingrese la marca");
		System.out.print(">");
		String marca = L.next();
		System.out.println("Ingrese el consumo en kWh");
		System.out.print(">");
		double consumo = L.nextDouble();
		for (int i = 0; i < arregloE.length; i++) {
			if (arregloE[i] == null) {
				arregloE[i] = new Electronica(ID, nombre, precio, marca, consumo);
				System.out.println("Producto guardado");
				break;
			}

		}

	}

	public static void bajaElectronica(Electronica[] arregloE, Scanner L) {

		System.out.println("Ingrese el ID del producto que desea eliminar:");
		int ID = L.nextInt();

		for (int i = 0; i < arregloE.length; i++) {
			if (arregloE[i] != null && ID == arregloE[i].getID()) {
				arregloE[i] = null;
				System.out.println("Producto eliminado");
				break;
			}

		}

	}

	public static void modificarElectronica(Electronica[] arregloE, Scanner L) {

		System.out.println("Ingrese el ID del producto a modificar");
		System.out.print(">");
		int ID = L.nextInt();

		for (int i = 0; i < arregloE.length; i++) {
			if (arregloE[i] != null && ID == arregloE[i].getID()) {
				System.out.println("Producto encontrado");
				System.out.println("Ingrese el nuevo nombre:");
				System.out.print(">");
				String nombre = L.next();
				arregloE[i].setNombre(nombre);
				System.out.println("Nombre modificado");
			}

		}

	}

	public static void listarElectronica(Electronica[] arregloE) {

		for (int i = 0; i < arregloE.length; i++) {

			if (arregloE[i] != null) {
				System.out.println((i+1) + "-" +arregloE[i]);
			} else {
				System.out.println((i+1) + "-");
			}

		}

	}

	public static void altaRopa(Ropa[] arregloR, Scanner L) {

		System.out.println("Ropa:");
		System.out.println("Ingrese el ID");
		int ID = L.nextInt();
		System.out.println("Ingrese el nombre");
		System.out.print(">");
		String nombre = L.next();
		System.out.println("Ingrese el precio");
		System.out.print(">");
		int precio = L.nextInt();
		System.out.println("Ingrese la talla (M,L,etc)");
		System.out.print(">");
		String talla = L.next();
		System.out.println("Ingrese el material");
		System.out.print(">");
		String material = L.next();

		for (int i = 0; i < arregloR.length; i++) {
			if (arregloR[i] == null) {
				arregloR[i] = new Ropa(ID, nombre, precio, talla, material);
				break;
			}

		}

	}

	public static void bajaRopa(Ropa[] arregloR, Scanner L) {

		System.out.println("Ingrese el ID del producto que desea eliminar:");
		int ID = L.nextInt();

		for (int i = 0; i < arregloR.length; i++) {
			if (arregloR[i] != null && ID == arregloR[i].getID()) {
				arregloR[i] = null;
				System.out.println("Producto eliminado");
				break;
			}

		}
	}

	public static void modificarRopa(Ropa[] arregloR, Scanner L) {

		System.out.println("Ingrese el ID del producto a modificar");
		System.out.print(">");
		int ID = L.nextInt();

		for (int i = 0; i < arregloR.length; i++) {
			if (arregloR[i] != null && ID == arregloR[i].getID()) {
				System.out.println("Producto encontrado");
				System.out.println("Ingrese el nuevo nombre:");
				System.out.print(">");
				String nombre = L.next();
				arregloR[i].setNombre(nombre);
				System.out.println("Nombre modificado");
			}

		}

	}

	public static void listarRopa(Ropa[] arregloR) {

		for (int i = 0; i < arregloR.length; i++) {

			if (arregloR[i] != null) {
				System.out.println((i+1) + "-" + arregloR[i]);
			} else {
				System.out.println((i+1) + "-");
			}

		}

	}

	public static void altaAlimento(Alimento[] arregloA, Scanner L) {

		System.out.println("Alimento:");
		System.out.println("Ingrese el ID:");
		System.out.print(">");
		int ID = L.nextInt();
		System.out.println("Ingrese el nombre");
		System.out.print(">");
		String nombre = L.next();
		System.out.println("Ingrese el precio");
		System.out.print(">");
		int precio = L.nextInt();
		System.out.println("Ingrese el tipo (Fruta,verdura,etc)");
		System.out.print(">");
		String tipo = L.next();
		System.out.println("Ingrese el peso en Kg");
		System.out.print(">");
		double peso = L.nextDouble();

		for (int i = 0; i < arregloA.length; i++) {

			if (arregloA[i] == null) {
				arregloA[i] = new Alimento(ID, nombre, precio, tipo, peso);
				System.out.println("Producto guardado");
				break;

			}

		}

	}

	public static void bajaAlimento(Alimento[] arregloA, Scanner L) {

		System.out.println("Ingrese el ID del producto que desea eliminar:");
		int ID = L.nextInt();

		for (int i = 0; i < arregloA.length; i++) {
			if (arregloA[i] != null && ID == arregloA[i].getID()) {
				arregloA[i] = null;
				System.out.println("Producto eliminado");
				break;
			}

		}

	}

	public static void modificarAlimento(Alimento[] arregloA, Scanner L) {

		System.out.println("Ingrese el ID del producto a modificar");
		System.out.print(">");
		int ID = L.nextInt();

		for (int i = 0; i < arregloA.length; i++) {
			if (arregloA[i] != null && ID == arregloA[i].getID()) {
				System.out.println("Producto encontrado");
				System.out.println("Ingrese el nuevo nombre:");
				System.out.print(">");
				String nombre = L.next();
				arregloA[i].setNombre(nombre);
				System.out.println("Nombre modificado");
			}

		}
	}

	public static void listarAlimento(Alimento[] arregloA) {

		for (int i = 0; i < arregloA.length; i++) {

			if (arregloA[i] != null) {
				System.out.println((i+1) + "-" + arregloA[i]);
			} else {
				System.out.println((i+1) + "-");
			}

		}
	}

}
