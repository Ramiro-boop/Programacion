package DeberHerencia;

import java.util.Scanner;

public class Estudiante extends Persona{

	String turno;
	String grupo;
	
	public Estudiante(String nombre, String apellido, int CI,String turno,String grupo) {
		super(nombre,apellido,CI);
		this.turno = turno;
		this.grupo = grupo;
	}
	
	public static void main(String[] args) {


		Scanner L = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del estudiante");
		String nombre = L .next();
		System.out.println("Ingrese el apellido del estudiante");
		String apellido = L.next();
		System.out.println("Ingrese la cedula del estudiante");
		int cedula = L.nextInt();
		System.out.println("Ingrese el turno del estudianre (Matutino, Vespertino, Nocturno)");
		String turno = L.next();                
		System.out.println("Ingrese el grupo en el que esta el estudiante");
		String grupo = L.next();
		Estudiante estudiante1 = new Estudiante(nombre,apellido,cedula,turno,grupo);
		System.out.println(estudiante1);

	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre :"+nombre+ " Apellido:  "+apellido+" Cedula: "+CI+" Turno: "+turno+" Grupo: "+grupo;
	}

}
