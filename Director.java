package DeberHerencia;

import java.util.Scanner;

public class Director extends Persona {

	int aniosExperiencia;
	
	public Director(String nombre, String apellido, int CI, int añosExperiencia) {
		super(nombre, apellido, CI);
		this.aniosExperiencia = añosExperiencia;
	}



	public static void main(String[] args) {


		
        Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del director");
		String nombre = L .next();
		System.out.println("Ingrese el apellido del director");
		String apellido = L.next();
		System.out.println("Ingrese la cedula del director");
		int cedula = L.nextInt();
		System.out.println("Ingrese los años de experiencia que tiene");
		int aniosExp = L.nextInt();
		Director dire1= new Director(nombre,apellido,cedula,aniosExp);
		System.out.println(dire1);

	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre :"+nombre+ " Apellido:  "+apellido+" Cedula: "+CI+" Tiene "+aniosExperiencia+" años de experiencia";

	}

}
