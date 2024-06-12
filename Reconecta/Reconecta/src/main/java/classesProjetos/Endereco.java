package classesProjetos;

public class Endereco {
	private int CEP;
	private int numeroPredio;
	private String nomeRua;
	private String complemento;
	private String bairro;
	
	public Endereco(int CEP, int numeroPredio, String nomeRua, String complemento, String bairro) {
		this.CEP = CEP;
		this.numeroPredio = numeroPredio;
		this.nomeRua = nomeRua;
		this.complemento = complemento;
		this.bairro = bairro;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public int getNumeroPredio() {
		return numeroPredio;
	}

	public void setNumeroPredio(int numeroPredio) {
		this.numeroPredio = numeroPredio;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
