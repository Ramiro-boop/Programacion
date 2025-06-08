package Arte;

public class Pintura extends ObraArte {
	
	private String tipoPintura;
	private String soporte;
	
	public Pintura(String titulo, String autor, String tipoPintura, String soporte) {
		super(titulo, autor);
		this.tipoPintura = tipoPintura;
		this.soporte = soporte;
	}

	public String getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(String tipoPintura) {
		this.tipoPintura = tipoPintura;
	}

	public String getSoporte() {
		return soporte;
	}

	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", tipo de pintura: " + tipoPintura + ", soporte: " + soporte;
	}
	
	
}
