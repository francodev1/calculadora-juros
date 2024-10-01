package service;

import entities.Juros;

public class CompostoService {
    public static double calcularJurosComposto(Juros juros) {
        double capital = juros.getCapital();
        double taxaAnual = juros.getTaxa() / 100;
        int tempoAnos = juros.getTempo(); 
        double aporteMensal = juros.getAporteMensal();

        double taxaMensal = taxaAnual / 12;
        int tempoMeses = tempoAnos * 12;

        double montanteTotal = capital * Math.pow((1 + taxaMensal), tempoMeses);

        double montanteAportes = aporteMensal * (Math.pow((1 + taxaMensal), tempoMeses) - 1) / taxaMensal;
        
        double montanteFinal = montanteTotal + montanteAportes;

        juros.setMontante(montanteFinal);
        return montanteFinal;
    }
}
