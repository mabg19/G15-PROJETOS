package classesProjetos;

import java.io.Serializable;
import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;

public class UsuarioDAO {
	private CadastroObjetos cadastro = new CadastroObjetos(Usuario.class);
	
	private String obterIdUnico(Usuario usuario) {
		return usuario.getCpf();
	}
	public Usuario buscar(String cpf) {
		return (Usuario)cadastro.buscar(cpf);
	}
	
	public boolean incluir(Usuario usuario) {
		String idUnico = obterIdUnico(usuario);
		Usuario usu = buscar(idUnico);
		if (usu == null) {
			cadastro.incluir(usuario, idUnico);
			return true;
		}
		return false;
	}
	public boolean alterar(Usuario usuario) {
		String idUnico = obterIdUnico(usuario);
		Usuario usu = buscar(idUnico);
		if (usu != null) {
			cadastro.alterar(usuario, idUnico);
			return true;
		}
		return false;
	}

	public boolean excluir(String cpf) {
		Usuario usu = buscar(cpf);
		if (usu != null) {
			cadastro.excluir(cpf);
			return true;
		}
		return false;
	}
}
