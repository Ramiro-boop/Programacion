package MundoAcademico;

public class ArticuloCientifico extends Publicacion{
	
	private String DOI; //Identificador del articulo cientifico
	private String nombreRevista;//Revista de donde fue sacado
	
	public ArticuloCientifico(String titulo, String autor, String dOI, String nombreRevista) {
		super(titulo, autor);
		DOI = dOI;
		this.nombreRevista = nombreRevista;
	}

	public String getDOI() {
		return DOI;
	}

	public void setDOI(String dOI) {
		DOI = dOI;
	}

	public String getNombreRevista() {
		return nombreRevista;
	}

	public void setNombreRevista(String nombreRevista) {
		this.nombreRevista = nombreRevista;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " DOI: " + DOI + ", Se saco de la revista: "+ nombreRevista;
	}

	
	
	
	
}
