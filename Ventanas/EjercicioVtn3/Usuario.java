package EjercicioVtn3;

public class Usuario {

	private String usuario;
	private String contraseña;
	
	public Usuario(String usuario, String contraseña) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	protected String getUsuario() {
		return usuario;
	}

	protected void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	protected String getContraseña() {
		return contraseña;
	}

	protected void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Usuario: " + usuario + " Contraseña: " + contraseña;
	}
	
}
