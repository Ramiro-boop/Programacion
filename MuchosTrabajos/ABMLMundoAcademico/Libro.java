package MundoAcademico;

public class Libro extends Publicacion{

	private int numPaginas;
	private String ISBN;
	
	public Libro(String titulo, String autor, int numPaginas, String iSBN) {
		super(titulo, autor);
		this.numPaginas = numPaginas;
		ISBN = iSBN;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return   " ISBN: "+ ISBN + ", " + super.toString() + " Cantidad de paginas: " + numPaginas;
	}
	
	
}
