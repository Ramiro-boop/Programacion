package DeberHerencia;

import java.util.Scanner;

public class Profesor extends Persona {
	
	String Asignatura;

	public Profesor(String nombre, String apellido, int CI,String asignatura){
		super(nombre,apellido,CI);
		this.Asignatura = asignatura;
		
	}

	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del profesor");
		String Nombre = L .next();
		System.out.println("Ingrese el apellido del profesor");
		String Apellido = L.next();
		System.out.println("Ingrese la cedula del profesor");
		int cedula = L.nextInt();
		System.out.println("Ingrese la asignatura que da el profesor");
		String Asignatura = L.next();
		Profesor prof1 = new Profesor(Nombre,Apellido,cedula,Asignatura);
		System.out.println(prof1);

	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nomre: " + nombre + "Apellido: " + apellido + "Cedula: " + "Asignatura que da: " + Asignatura;
	}
	

}
