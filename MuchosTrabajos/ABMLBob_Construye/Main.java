package Bob_construye;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcion1;
		int opcion2;
		Casa[] arregloC = new Casa[10];
		Apartamento[] arregloA = new Apartamento[10];

		Scanner L = new Scanner(System.in);

		do {

			System.out.println("-----------------------------------------");
			System.out.println("Ingese una opción:");
			System.out.println("1- Casa");
			System.out.println("2- Apartamento");
			System.out.println("3- Terminar programa");
			opcion1 = L.nextInt();

			switch (opcion1) {

			case 1:

				System.out.println("");
				System.out.println("Ingrese una opcion: ");
				System.out.println("1- Agregar una casa");
				System.out.println("2- Eliminar una casa");
				System.out.println("3- Modificar Casa (Dirección)");
				System.out.println("4- Mostrar lista de casas");
				opcion2 = L.nextInt();
				switch (opcion2) {

				case 1: // ALta
					altaCasa(arregloC, L);
					break;

				case 2:// Baja
					bajaCasa(arregloC, L);
					break;

				case 3:// Modificar
					modificarCasa(arregloC, L);
					break;

				case 4:// Listar
					mostrarCasa(arregloC);
					break;

				default:
					System.out.println("Opcion no valida");
					break;

				}

				break;

			case 2:
				System.out.println("");
				System.out.println("Ingrese una opcion: ");
				System.out.println("1- Agregar un apartamento");
				System.out.println("2- Eliminar un apartamento");
				System.out.println("3- Modificar apartamento(Dirección)");
				System.out.println("4- Mostrar lista de apartamentos");
				opcion2 = L.nextInt();

				switch (opcion2) {

				case 1: // ALta
					altaApartamento(arregloA, L);
					break;

				case 2:// Baja
					bajaApartamento(arregloA, L);
					break;

				case 3:// Modificar
					modificarApartamento(arregloA, L);
					break;

				case 4:// Listar
					mostrarApartamento(arregloA, L);
					break;

				default:
					System.out.println("Opcion no valida");
					break;

				}
				break;
			case 3:
				System.out.println("Programa terminado");
				break;
			default:
				System.out.println("Opcion no valida");
				break;

			}

		} while (opcion1 != 3);
		

	}

	public static void altaCasa(Casa[] arregloC, Scanner L) {

		System.out.println("-----------------------------------------");
		System.out.println("Casa:");
		System.out.println("Ingrese el ID:");
		System.out.print(">");
		int ID = L.nextInt();
		System.out.println("Ingrese la dirección:");
		System.out.print(">");
		String direccion = L.next();
		System.out.println("Ingrese la cantidad de pisos");
		System.out.print(">");
		int pisos = L.nextInt();
		System.out.println("Ingrese la cantidad de metros cuadrados que tiene");
		System.out.print(">");
		double metrosCuadrados = L.nextDouble();

		for (int i = 0; i < arregloC.length; i++) {
			if (arregloC[i] == null) {
				arregloC[i] = new Casa(ID, direccion, pisos, metrosCuadrados);

				System.out.println("-----------------------------------------");
				System.out.println("Casa guardada");
				break;

			}

		}

	}

	public static void bajaCasa(Casa[] arregloC, Scanner L) {

		System.out.println("Ingrese el ID de la casa que quiere eliminar:");
		System.out.print(">");
		int ID = L.nextInt();

		boolean casaEliminada = false;

		for (int i = 0; i < arregloC.length; i++) {

			if (arregloC[i] != null && arregloC[i].getID() == ID) {
				arregloC[i] = null;
				System.out.println("-----------------------------------------");
				System.out.println("Casa eliminada");
				casaEliminada = true;
				break;

			}

		}

		if (casaEliminada == false) {
			System.out.println("Casa no encontrada");
		}
	}

	public static void modificarCasa(Casa[] arregloC, Scanner L) {

		System.out.println("Ingrese el ID de la casa a modificar");
		System.out.print(">");
		int ID = L.nextInt();

		boolean casaModif = false;

		for (int i = 0; i < arregloC.length; i++) {
			if (arregloC[i] != null && arregloC[i].getID() == ID) {
				System.out.println("Casa encontrada");
				System.out.println("Ingrese la nueva dirección:");
				System.out.print(">");
				String dir = L.next();
				arregloC[i].setDireccion(dir);
				System.out.println("-----------------------------------------");
				System.out.println("Dirección modificada");
				casaModif = true;
				break;
			}

		}
		if (casaModif == false) {
			System.out.println("Casa no encontrada");
		}

	}

	public static void mostrarCasa(Casa[] arregloC) {
		System.out.println("-----------------------------------------");
		for (int i = 0; i < arregloC.length; i++) {

			if (arregloC[i] != null) {
				System.out.println((i + 1) + "-" + arregloC[i]);
			} else {
				System.out.println((i + 1) + "-");
			}

		}
	}

	public static void altaApartamento(Apartamento[] arregloA, Scanner L) {

		System.out.println("-----------------------------------------");
		System.out.println("Apartamento:");
		System.out.println("Ingrese el ID:");
		System.out.print(">");
		int ID = L.nextInt();
		System.out.println("Ingrese la dirección:");
		System.out.print(">");
		String direccion = L.next();
		System.out.println("Ingrese la cantidad de pisos");
		System.out.print(">");
		int pisos = L.nextInt();
		System.out.println("Ingrese el número de apartamento");
		System.out.print(">");
		int numA = L.nextInt();

		for (int i = 0; i < arregloA.length; i++) {
			if (arregloA[i] == null) {
				arregloA[i] = new Apartamento(ID, direccion, pisos, numA);

				System.out.println("-----------------------------------------");
				System.out.println("Apartamento guardado");
				break;

			}

		}

	}

	public static void bajaApartamento(Apartamento[] arregloA, Scanner L) {

		System.out.println("Ingrese el ID del apartamento que quiere eliminar:");
		System.out.print(">");
		int ID = L.nextInt();

		boolean apartamentoE = false;

		for (int i = 0; i < arregloA.length; i++) {
			if (arregloA[i] != null && arregloA[i].getID() == ID) {
				arregloA[i] = null;
				System.out.println("-----------------------------------------");
				System.out.println("Apartamento eliminado");
				apartamentoE = true;
				break;

			}

		}
		if (apartamentoE == false) {
			System.out.println("Apartamento no encontrado");
		}
	}

	public static void modificarApartamento(Apartamento[] arregloA, Scanner L) {

		System.out.println("Ingrese el ID del apartamento a modificar");
		System.out.print(">");
		int ID = L.nextInt();

		boolean apartamentoModif = false;

		for (int i = 0; i < arregloA.length; i++) {
			if (arregloA[i] != null && arregloA[i].getID() == ID) {
				System.out.println("Apartamento encontrado");
				System.out.println("Ingrese la nueva dirección:");
				System.out.print(">");
				String dir = L.next();
				arregloA[i].setDireccion(dir);
				System.out.println("-----------------------------------------");
				System.out.println("Dirección modificada");
				apartamentoModif = true;
				break;
			}

		}
		if (apartamentoModif == false) {
			System.out.println("Apartamento no encontrado");

		}

	}

	public static void mostrarApartamento(Apartamento[] arregloA, Scanner L) {

		for (int i = 0; i < arregloA.length; i++) {

			if (arregloA[i] != null) {
				System.out.println((i + 1) + "-" + arregloA[i]);
			} else {
				System.out.println((i + 1) + "-");
			}

		}
	}

}
