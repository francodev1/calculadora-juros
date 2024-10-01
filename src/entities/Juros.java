package entities;

public class Juros {
    private double montante;
    private double capital;
    private double taxa;
    private int tempo;
    private double aporteMensal;

    public Juros(double capital, double taxa, int tempo, double aporteMensal) {
        this.capital = capital;
        this.taxa = taxa;
        this.tempo = tempo;
        this.aporteMensal = aporteMensal;
    }

    // Getters e Setters
    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public double getAporteMensal() {
        return aporteMensal;
    }

    public void setAporteMensal(double aporteMensal) {
        this.aporteMensal = aporteMensal;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }
}
