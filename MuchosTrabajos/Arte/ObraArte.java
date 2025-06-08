package Arte;

public class ObraArte {
	
	private String titulo;
	private String autor;
	
	public ObraArte(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titulo: " + titulo + ", autor: " + autor;
	}
	
	

}
