package classesProjetos;

public class Review {
	public int estrelas;
	public String comentario;
	public Usuario usuario;
	
	public Review(int estrelas, String comentario, Usuario usuario) {
		this.estrelas = estrelas;
		this.comentario = comentario;
		this.usuario = usuario;
	}
}
