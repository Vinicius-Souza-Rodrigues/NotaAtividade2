package conta_poupanca;

public class conta_poupanca {
    private String nome_titular;
    private double saldo = 0;
    private double selic = 8.5;

    public double getSelic() {
        return selic;
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
        calcular_rendimento();
    }

    public double calcular_rendimento() {
        if (getSelic() > 8.5) {
            return 0.005 * getSaldo();
        } else {
            return  0.007 * getSaldo();
        }
    }

    public String exibirdados() {
        return "Nome Titular: " + getNome_titular() + "%nsaldo: " + getSaldo() + "%nRendimento: " + calcular_rendimento();
    }
}
