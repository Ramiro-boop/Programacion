package MundoAcademico;

public class Revista extends Publicacion{

	private int numEdicion;
	private String mesPublicacion;
	
	public Revista(String titulo, String autor, int numEdicion, String mesPublicacion) {
		super(titulo, autor);
		this.numEdicion = numEdicion;
		this.mesPublicacion = mesPublicacion;
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
		return super.toString() + " Numero de edición: " + numEdicion + ", Mes de publicacion: "+ mesPublicacion;
	}
}
