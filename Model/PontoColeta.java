package classesProjetos;

public class PontoColeta {
	private String horaFuncionamento;
	private Endereco endereco;
	private Contato contato;
	private Review[] reviews;
	
	public PontoColeta(String horaFuncionamento, Endereco endereco, Contato contato, Review[] reviews) {
		this.horaFuncionamento = horaFuncionamento;
		this.endereco = endereco;
		this.contato = contato;
		this.reviews = reviews;
	}

	public String getHoraFuncionamento() {
		return horaFuncionamento;
	}

	public void setHoraFuncionamento(String horaFuncionamento) {
		this.horaFuncionamento = horaFuncionamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Review[] getReviews() {
		return reviews;
	}
	
	public void addReview(Review rev) {
        if (reviews == null) {
            // Se o array reviews for null, inicialize com tamanho 1
            reviews = new Review[1];
            reviews[0] = rev;
        }
        else {
            // Crie um novo array com tamanho maior
            Review[] newReviews = new Review[reviews.length + 1];
            // Copie as reviews existentes para o novo array
            System.arraycopy(reviews, 0, newReviews, 0, reviews.length);
            // Adicione a nova review no final do novo array
            newReviews[reviews.length] = rev;
            // Aponte reviews para o novo array
            reviews = newReviews;
        }
    }
}
