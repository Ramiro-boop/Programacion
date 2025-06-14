package MundoAcademico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcion1;
		int opcion2;
		Libro[] arregloL = new Libro[10];
		Revista[] arregloR = new Revista[10];
		ArticuloCientifico[] arregloAC = new ArticuloCientifico[10];

		do {

			Scanner L = new Scanner(System.in);
			System.out.println("-----------------------------------------");
			System.out.println("Ingese una opción:");
			System.out.println("1- Libro");
			System.out.println("2- Revista");
			System.out.println("3- Articulo Cientifico");
			System.out.println("4- Terminar programa");
			opcion1 = L.nextInt();

			if (opcion1 != 4) {
				System.out.println("");
				System.out.println("Ingrese una opcion: ");
				System.out.println("1- Agregar");
				System.out.println("2- Eliminar");
				System.out.println("3- Modificar (titulo)");
				System.out.println("4- Mostrar lista");
				opcion2 = L.nextInt();

				switch (opcion1) {

				case 1:

					switch (opcion2) {

					case 1:// Alta

						altaLibro(arregloL, L);

						break;

					case 2:// Baja

						bajaLibro(arregloL, L);

						break;

					case 3:// Modificar
						modificarLibro(arregloL, L);
						break;

					case 4:// Listar
						listarLibro(arregloL);
						break;

					}

					break;

				case 2:
					switch (opcion2) {

					case 1:// Alta

						altaRevista(arregloR, L);

						break;

					case 2:// Baja
						bajaRevista(arregloR, L);
						break;

					case 3:// Modificar
						modificarRevista(arregloR, L);
						break;

					case 4:// Listar
						listarRevista(arregloR);
						break;

					}

					break;

				case 3:

					switch (opcion2) {

					case 1:// Alta
						altaArticuloCientifico(arregloAC, L);

						break;

					case 2:// Baja
						bajaArticuloCientifico(arregloAC, L);
						break;

					case 3:// Modificar
						modificarArticuloCientifico(arregloAC, L);
						break;

					case 4:// Listar
						listarArticuloCientifico(arregloAC);
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

	public static void altaLibro(Libro[] arregloL, Scanner L) {

		System.out.println("-----------------------------------------");
		System.out.println("Libro:");
		System.out.println("Ingrese el ISBN");
		System.out.print(">");
		String ISBN = L.next();
		System.out.println("Ingrese el titulo");
		System.out.print(">");
		String titulo = L.next();
		System.out.println("Ingrese el autor");
		System.out.print(">");
		String autor = L.next();
		System.out.println("Ingrese la cantidad de paginas");
		System.out.print(">");
		int cantPaginas = L.nextInt();

		for (int i = 0; i < arregloL.length; i++) {
			if (arregloL[i] == null) {

				arregloL[i] = new Libro(titulo, autor, cantPaginas, ISBN);
				System.out.println("-----------------------------------------");

				System.out.println("Libro guardado");

				break;
			}
		}

	}

	public static void bajaLibro(Libro[] arregloL, Scanner L) {

		System.out.println("Ingrese el ISBN del libro que desea eliminar:");
		String ISBN = L.next();

		for (int i = 0; i < arregloL.length; i++) {
			if (arregloL[i] != null && arregloL[i].getISBN().equals(ISBN)) {
				arregloL[i] = null;
				System.out.println("-----------------------------------------");
				System.out.println("Libro eliminado");
				break;

			}

		}

	}

	public static void modificarLibro(Libro[] arregloL, Scanner L) {

		System.out.println("Ingrese el ISBN del libro a modificar");
		System.out.print(">");
		String ISBN = L.next();

		for (int i = 0; i < arregloL.length; i++) {
			if (arregloL[i] != null && arregloL[i].getISBN().equals(ISBN)) {
				System.out.println("Libro encontrado");
				System.out.println("Ingrese el nuevo titulo:");
				System.out.print(">");
				String titulo = L.next();
				arregloL[i].setTitulo(titulo);
				System.out.println("-----------------------------------------");
				System.out.println("Titulo modificado");
			}

		}
	}

	public static void listarLibro(Libro[] arregloL) {

		for (int i = 0; i < arregloL.length; i++) {

			if (arregloL[i] != null) {
				System.out.println((i + 1) + "-" + arregloL[i]);
			} else {
				System.out.println((i + 1) + "-");
			}

		}

	}

	public static void altaRevista(Revista[] arregloR, Scanner L) {

		System.out.println("-----------------------------------------");
		System.out.println("Revista:");
		System.out.println("Ingrese el ID");
		System.out.print(">");
		int ID = L.nextInt();
		System.out.println("Ingrese el titulo");
		System.out.print(">");
		String titulo = L.next();
		System.out.println("Ingrese el autor");
		System.out.print(">");
		String autor = L.next();
		System.out.println("Ingrese el número de edición");
		System.out.print(">");
		int numEdicion = L.nextInt();
		System.out.println("Ingrese el mes en el que se a publicado");
		System.out.print(">");
		String mesPublicacion = L.next();

		for (int i = 0; i < arregloR.length; i++) {
			if (arregloR[i] == null) {

				arregloR[i] = new Revista(ID, titulo, autor, numEdicion, mesPublicacion);
				System.out.println("-----------------------------------------");
				System.out.println("Revista guardada");

				break;

			}
		}

	}

	public static void bajaRevista(Revista[] arregloR, Scanner L) {

		System.out.println("Ingrese el ID de la revista que desea eliminar:");
		int ID = L.nextInt();

		for (int i = 0; i < arregloR.length; i++) {
			if (arregloR[i] != null && ID == arregloR[i].getID()) {
				arregloR[i] = null;
				System.out.println("-----------------------------------------");
				System.out.println("Revista eliminada");
				break;

			}

		}

	}

	public static void modificarRevista(Revista[] arregloR, Scanner L) {

		System.out.println("Ingrese el ID de la revista a modificar");
		System.out.print(">");
		int ID = L.nextInt();

		for (int i = 0; i < arregloR.length; i++) {
			if (arregloR[i] != null && ID == arregloR[i].getID()) {
				System.out.println("Revista encontrada");
				System.out.println("Ingrese el nuevo titulo:");
				System.out.print(">");
				String titulo = L.next();
				arregloR[i].setTitulo(titulo);
				System.out.println("-----------------------------------------");
				System.out.println("Titulo modificado");

			}

		}

	}

	public static void listarRevista(Revista[] arregloR) {

		for (int i = 0; i < arregloR.length; i++) {

			if (arregloR[i] != null) {
				System.out.println((i + 1) + "-" + arregloR[i]);
			} else {
				System.out.println((i + 1) + "-");
			}

		}

	}

	public static void altaArticuloCientifico(ArticuloCientifico[] arregloAC, Scanner L) {

		System.out.println("-----------------------------------------");
		System.out.println("Articulo Cientifico:");
		System.out.println("Ingrese el DOI");
		System.out.print(">");
		String DOI = L.next();
		System.out.println("Ingrese el titulo");
		System.out.print(">");
		String titulo = L.next();
		System.out.println("Ingrese el autor");
		System.out.print(">");
		String autor = L.next();
		System.out.println("Ingrese el nombre de la revista del que fue sacado este articulo");
		System.out.print(">");
		String NombreRevista = L.next();

		for (int i = 0; i < arregloAC.length; i++) {
			if (arregloAC[i] == null) {
				arregloAC[i] = new ArticuloCientifico(titulo, autor, DOI, NombreRevista);
				System.out.println("-----------------------------------------");
				System.out.println("Articulo cientifico guardado");

				break;
			}

		}

	}

	public static void bajaArticuloCientifico(ArticuloCientifico[] arregloAC, Scanner L) {

		System.out.println("Ingrese el DOI del articulo cientifico que desea eliminar:");
		String DOI = L.next();

		for (int i = 0; i < arregloAC.length; i++) {
			if (arregloAC[i] != null && arregloAC[i].getDOI().equals(DOI)) {
				arregloAC[i] = null;
				System.out.println("-----------------------------------------");
				System.out.println("Articulo eliminado");
				break;

			}

		}

	}

	public static void modificarArticuloCientifico(ArticuloCientifico[] arregloAC, Scanner L) {

		System.out.println("Ingrese el DOI de la revista a modificar");
		System.out.print(">");
		String DOI = L.next();

		for (int i = 0; i < arregloAC.length; i++) {
			if (arregloAC[i] != null && arregloAC[i].getDOI().equals(DOI)) {
				System.out.println("Articulo cientifico encontrado");
				System.out.println("Ingrese el nuevo titulo:");
				System.out.print(">");
				String titulo = L.next();
				arregloAC[i].setTitulo(titulo);
				System.out.println("-----------------------------------------");
				System.out.println("Titulo modificado");

			}

		}

	}

	public static void listarArticuloCientifico(ArticuloCientifico[] arregloAC) {

		for (int i = 0; i < arregloAC.length; i++) {

			if (arregloAC[i] != null) {
				System.out.println((i + 1) + "-" + arregloAC[i]);
			} else {
				System.out.println((i + 1) + "-");
			}

		}

	}
}
