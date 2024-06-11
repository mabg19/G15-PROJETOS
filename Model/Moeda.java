package classesProjetos;

public class Moeda {
    private Double saldo;

    public Moeda() {
        this.saldo = 0.0;
    }

    public Moeda(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void adicionarSaldo(Double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void subtrairSaldo(Double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public String toString() {
        return "Moeda{" +
                "saldo=" + saldo +
                '}';
    }
}
