package DeberHerencia;

public class Profesor extends Persona {
	
	String Asignatura;

	public Profesor(String nombre, String apellido, int CI,String Asignatura){
		super(nombre,apellido,CI);
		this.Asignatura = Asignatura;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
