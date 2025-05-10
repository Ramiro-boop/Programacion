package DeberHerencia;

public class Estudiante extends Persona{

	String Turno;
	String Grupo;
	
	public Estudiante(String nombre, String apellido, int CI,String Turno,String Grupo) {
		super(nombre,apellido,CI);
		this.Turno = Turno;
		this.Grupo = Grupo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
