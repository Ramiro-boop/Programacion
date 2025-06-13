package MundoAcademico;

public class Revista extends Publicacion{

	private int ID;
	private int numEdicion;
	private String mesPublicacion;
	
	public Revista(int ID, String titulo, String autor, int numEdicion, String mesPublicacion) {
		super(titulo, autor);
		this.ID = ID;
		this.numEdicion = numEdicion;
		this.mesPublicacion = mesPublicacion;
	}
	

	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getNumEdicion() {
		return numEdicion;
	}

	public void setNumEdicion(int numEdicion) {
		this.numEdicion = numEdicion;
	}

	public String getMesPublicacion() {
		return mesPublicacion;
	}

	public void setMesPublicacion(String mesPublicacion) {
		this.mesPublicacion = mesPublicacion;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " ID:" +ID + ", " + super.toString() +  " Numero de edición: " + numEdicion + ", Mes de publicacion: "+ mesPublicacion;
	}
}
