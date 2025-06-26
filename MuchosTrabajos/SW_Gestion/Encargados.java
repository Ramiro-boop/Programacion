package SW_Gestion;

import java.util.Scanner;

public class Encargados extends Persona implements Interface {

	private String nivelJerarquico;

	

	public Encargados(int ci, String nombre, String apellido, String nivelJerarquico) {
		super(ci, nombre, apellido);
		this.nivelJerarquico = nivelJerarquico;
	}

	public String getNivelJerarquico() {
		return nivelJerarquico;
	}




	public void setNivelJerarquico(String nivelJerarquico) {
		this.nivelJerarquico = nivelJerarquico;
	}




	@Override
	public void enviarMail(int opcionInterface, Scanner L) {

		switch(opcionInterface) {
		
		case 1:
			System.out.println("No le podes mandar un email a los Alternos");			
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

