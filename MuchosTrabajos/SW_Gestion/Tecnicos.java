package SW_Gestion;

import java.util.Scanner;

public class Tecnicos extends Persona implements Interface {
	
	private String Especialidad;

	

	public Tecnicos(int ci, String nombre, String apellido, String especialidad) {
		super(ci, nombre, apellido);
		Especialidad = especialidad;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	
	@Override
	public void enviarMail(int opcionInterface, Scanner L) {
		switch(opcionInterface) {
		
		case 1:
			System.out.println("Escriba el email");
			System.out.print(">");
			String email = L.next();
			System.out.println("Correo ingresado: " + email);			
			break;
			
		case 2:
			System.out.println("Escriba el email");
			System.out.print(">");
			String email1 = L.next();
			System.out.println("Correo ingresado: " + email1);
			
			break;
		
		
		}
		
		
	}

}
