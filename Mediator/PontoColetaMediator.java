package classesProjetos;


public class PontoColetaMediator {
	private PontoColetaDAO pontoColetaDao = new PontoColetaDAO();
	private static PontoColetaMediator instancia;
	
	private PontoColetaMediator() {}
	
	public static PontoColetaMediator obterInstancia() {
		if (instancia == null) {
            instancia = new PontoColetaMediator();
        }
        return instancia;
	}
	
	public PontoColeta buscar(String cnpj) {
		return pontoColetaDao.buscar(cnpj);
	}
	
	public String validar(PontoColeta pontoColeta) {
		if(ValidadorCNPJ.isCnpjValido(pontoColeta.getCnpj()) == false) {
			return "CPF errado";
		}
		if(StringUtils.isVaziaOuNula(pontoColeta.getNome()) == true || pontoColeta.getNome().length()< 2) {
			return "nome errado";
		}else {
			return null;
		}
	}
	
	public String incluir(PontoColeta pontoColeta) {
		String retorno = this.validar(pontoColeta);
		if(retorno!= null) {
			return retorno;
		}else {
			if(pontoColetaDao.incluir(pontoColeta) == false) {
				return "Cliente ja existente";
			}else {
				return null;
			}
		}
	}
	
	public String alterar(PontoColeta pontoColeta) {
		String retorno = this.validar(pontoColeta);
		if(retorno!= null) {
			return retorno;
		}else {
			if(pontoColetaDao.alterar(pontoColeta) == false) {
				return "Cliente inexistente";
			}else {
				return null;
			}
		}
	}
	
	public String excluir(String cnpj) {
		if(ValidadorCNPJ.isCnpjValido(cnpj) == false) {
			return "CPF errado";
		}else {
			if(pontoColetaDao.excluir(cnpj) == false) {
				return "Cliente inexistente";
			}else {
				return null;
			}
		}
	}
}
