package classesProjetos;

import java.io.Serializable;
import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;

public class PontoColetaDAO {
	private CadastroObjetos cadastro = new CadastroObjetos(PontoColeta.class);
	
	private String obterIdUnico(PontoColeta pontoColeta) {
		return pontoColeta.getCnpj();
	}
	public PontoColeta buscar(String cnpj) {
		return (PontoColeta)cadastro.buscar(cnpj);
	}
	
	public boolean incluir(PontoColeta pontoColeta) {
		String idUnico = obterIdUnico(pontoColeta);
		PontoColeta ponto = buscar(idUnico);
		if (ponto == null) {
			cadastro.incluir(pontoColeta, idUnico);
			return true;
		}
		return false;
	}
	public boolean alterar(PontoColeta pontoColeta) {
		String idUnico = obterIdUnico(pontoColeta);
		PontoColeta ponto = buscar(idUnico);
		if (ponto != null) {
			cadastro.alterar(pontoColeta, idUnico);
			return true;
		}
		return false;
	}

	public boolean excluir(String cnpj) {
		PontoColeta ponto = buscar(cnpj);
		if (ponto != null) {
			cadastro.excluir(cnpj);
			return true;
		}
		return false;
	}
}
