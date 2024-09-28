package calculo_corrida;

public class calculo_corrida {
    private double distancia;
    private int tempo_espera;
    private double tarifaBase;
    private double fator_demanda;

    public double getDistancia() {
        return distancia;
    }

    public double getFator_demanda() {
        return fator_demanda;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public int getTempo_espera() {
        return tempo_espera;
    }

    public void setFator_demanda(double fator_demanda) {
        this.fator_demanda = fator_demanda;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setTempo_espera(int tempo_espera) {
        this.tempo_espera = tempo_espera;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String calcularValorCorrida() {
        return "Valor FInal: " + (getDistancia() * 2) + (getTempo_espera() * 0.5) + getTarifaBase() * getFator_demanda();
    }

}
