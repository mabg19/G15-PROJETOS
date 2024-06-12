package classesProjetos;


public class UsuarioMediator {
	private UsuarioDAO usuarioDao = new UsuarioDAO();
	private static UsuarioMediator instancia;
	
	private UsuarioMediator() {}
	
	public static UsuarioMediator obterInstancia() {
		if (instancia == null) {
            instancia = new UsuarioMediator();
        }
        return instancia;
	}
	
	public Usuario buscar(String cpf) {
		return usuarioDao.buscar(cpf);
	}
	public String validar(Usuario usuario) {
		if(ValidadorCPF.isCpfValido(usuario.getCpf()) == false) {
			return "CPF errado";
		}
		if(StringUtils.isVaziaOuNula(usuario.getNome()) == true || usuario.getNome().length()< 2) {
			return "nome errado";
		}else {
			return null;
		}
	}
	public String incluir(Usuario usuario) {
		String retorno = this.validar(usuario);
		if(retorno!= null) {
			return retorno;
		}else {
			if(usuarioDao.incluir(usuario) == false) {
				return "Cliente ja existente";
			}else {
				return null;
			}
		}
	}
	public String alterar(Usuario usuario) {
		String retorno = this.validar(usuario);
		if(retorno!= null) {
			return retorno;
		}else {
			if(usuarioDao.alterar(usuario) == false) {
				return "Cliente inexistente";
			}else {
				return null;
			}
		}
	}
	public String excluir(String cpf) {
		if(ValidadorCPF.isCpfValido(cpf) == false) {
			return "CPF errado";
		}else {
			if(usuarioDao.excluir(cpf) == false) {
				return "Cliente inexistente";
			}else {
				return null;
			}
		}
	}
}
