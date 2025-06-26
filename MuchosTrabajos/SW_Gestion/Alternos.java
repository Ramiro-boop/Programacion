package SW_Gestion;

import java.util.Scanner;

public class Alternos extends Persona implements Interface {
	
	private int horasDisponibles;


	public Alternos(int ci, String nombre, String apellido, int horasDisponibles) {
		super(ci, nombre, apellido);
		this.horasDisponibles = horasDisponibles;

	}

	
	public int getHorasDisponibles() {
		return horasDisponibles;
	}


	public void setHorasDisponibles(int horasDisponibles) {
		this.horasDisponibles = horasDisponibles;
	}


	@Override
	public void enviarMail(int opcionInterface, Scanner L) {
		
		switch(opcionInterface) {
		
		case 1:
			System.out.println("No le podes mandar un email a los Encargados");			
			break;
			
		case 2:
			System.out.println("Escriba el email");
			System.out.print(">");
			String email = L.next();
			System.out.println("Correo ingresado: " + email);
			
			break;
		
		
		}
		
		
	}

}
