package conta_corrente;

public class conta_corrente {
    private String nome_titular;
    private double saldo = 0;
    private double selic = 8.5;
    private double valor;

    public double getSelic() {
        return selic;
    }

    public double getValor() {
        return valor;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void depositar(double saldo) {
        setSaldo(saldo);
    }

    public void sacar(double saldo) {
        setSaldo(-saldo);
    }

    public void cheque_especial(double valor) {
        this.valor = valor;
        setSaldo(valor);
    }

    public String exibirdados() {
        return "Nome Titular: " + getNome_titular() + "%nsaldo: " + getSaldo() + "%nCheque: " + getValor();
    }
}
