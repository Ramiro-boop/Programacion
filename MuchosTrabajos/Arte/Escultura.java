package Arte;

public class Escultura extends ObraArte{
	
	private String material;
	private int peso;
	
	public Escultura(String titulo, String autor, String material, int peso) {
		super(titulo, autor);
		this.material = material;
		this.peso = peso;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", material: " + material + ", peso: " + peso + "kg";
	}
	
}
