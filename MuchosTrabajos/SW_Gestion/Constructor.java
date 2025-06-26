package SW_Gestion;

import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		
		Encargados E1 = new Encargados(123456,"Nahuel","Ruiz","Director");
		Alternos A1 = new Alternos (12345, "Teseo","Jaso", 7);
		Tecnicos T1 = new Tecnicos (1234,"Ramiro","Sosa","Programador");
		int opcion;
		
		
		Scanner L = new Scanner(System.in);
		
		do {
			System.out.println("Bienvenido al menu");
			System.out.println("1- Ingresar como Encargado");
			System.out.println("2- Ingresar como Alternos");
			System.out.println("3- Ingresar como Tecnico");
			opcion = L.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Ingresaste como encargado");
				System.out.println("A quien le mandaras un email");
				System.out.println("1- Alterno");
				System.out.println("2- Técnicos");
				int op = L.nextInt();
				E1.enviarMail(op, L);
				
				
				break;
				
			case 2:
				System.out.println("Ingresaste como Alterno");
				System.out.println("A quien le mandaras un email");
				System.out.println("1- Encargado");
				System.out.println("2- Técnico");
				int op1 = L.nextInt();
				A1.enviarMail(op1,L);
				
				
				break;
				
			case 3:
				
				System.out.println("Ingresaste como técnicos");
				System.out.println("A quien le mandaras un email");
				System.out.println("1- Alterno");
				System.out.println("2- Encargado");
				int op2 = L.nextInt();
				T1.enviarMail(op2,L);
				
				break;
			default:
				System.out.println("Opción invalida");
				break;
			
			}
			
			
			
		}while(opcion !=0);
		
		
		

	}



}
