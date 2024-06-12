package classesProjetos;

public class Usuario extends Registro{
    private String nomeCompleto;
    private String senha;
    private String cpf;
    private Endereco endereco;
    private Contato contato;
    private Moeda moeda;
    private PontoColeta[] favoritos;
    private Material[] materiais;

    public Usuario(String nomeCompleto, String senha, String cpf, Endereco endereco, Contato contato) {
        this.nomeCompleto = nomeCompleto;
        this.senha = senha;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.moeda = new Moeda();
        this.favoritos = new PontoColeta[10]; // da p mudar o tamanho depois
        this.materiais = new Material[10]; //  da p mudar o tamanho depois
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

    public PontoColeta[] getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(PontoColeta[] favoritos) {
        this.favoritos = favoritos;
    }

    public Material[] getMateriais() {
        return materiais;
    }

    public void setMateriais(Material[] materiais) {
        this.materiais = materiais;
    }

    public void adicionarFavorito(PontoColeta pontoColeta) {
        for (int i = 0; i < favoritos.length; i++) {
            if (favoritos[i] == null) {
                favoritos[i] = pontoColeta;
                return;
            }
        }
    }

    public void adicionarMaterial(Material material) {
        for (int i = 0; i < materiais.length; i++) {
            if (materiais[i] == null) {
                materiais[i] = material;
                return;
            }
        }
    }
    public String toString() {   //pras saidas ficarem legivei
        return "Usuario{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contato +
                ", moeda=" + moeda +
                ", favoritos=" + Arrays.toString(favoritos) +
                ", materiais=" + Arrays.toString(materiais) +
                '}';
    }
}
