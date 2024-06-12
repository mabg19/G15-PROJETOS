package classesProjetos;

public class Material {
	private String tipo;
	private double peso;
	
	public Material(String tipo, double peso) {
		this.tipo = tipo;
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
