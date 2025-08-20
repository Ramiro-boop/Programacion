package LaBiblioteca;

public class Libro {

	private String ISBN;
	private String autor;
	private String titulo;
	
	public Libro(String iSBN, String autor, String titulo) {
		super();
		ISBN = iSBN;
		this.autor = autor;
		this.titulo = titulo;
	}

	protected String getISBN() {
		return ISBN;
	}

	protected void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return "ISBN: " + ISBN + ", Autor: " + autor + ", Titulo: " + titulo;
		
		
	}
	
	
}
