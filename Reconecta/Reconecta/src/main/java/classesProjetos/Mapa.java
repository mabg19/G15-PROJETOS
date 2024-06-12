package classesProjetos;

public class Mapa {
	private PontoColeta[] pontosColeta;

	public Mapa(PontoColeta[] pontosColeta) {
		this.pontosColeta = pontosColeta;
	}

	public PontoColeta[] getPontosColeta() {
		return pontosColeta;
	}
	
	public void addPontoColeta(PontoColeta ponto) {
        if (pontosColeta == null) {
            // Se o array reviews for null, inicialize com tamanho 1
        	pontosColeta = new PontoColeta[1];
        	pontosColeta[0] = ponto;
        }
        else {
            // Crie um novo array com tamanho maior
            PontoColeta[] newPontosColeta = new PontoColeta[pontosColeta.length + 1];
            // Copie as reviews existentes para o novo array
            System.arraycopy(pontosColeta, 0, newPontosColeta, 0, pontosColeta.length);
            // Adicione a nova review no final do novo array
            newPontosColeta[pontosColeta.length] = ponto;
            // Aponte reviews para o novo array
            pontosColeta = newPontosColeta;
        }
    }
}
