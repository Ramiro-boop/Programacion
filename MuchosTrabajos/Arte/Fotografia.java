package Arte;

public class Fotografia extends ObraArte{
	
	private String formato;//papel,digital
	private String resolucion;//ej: 3000x1000px

	public Fotografia(String titulo, String autor, String formato, String resolucion) {
		super(titulo, autor);
		this.formato = formato;
		this.resolucion = resolucion;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", formato: " + formato + ", resolución: " + resolucion;
	}
	
	

}
