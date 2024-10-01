package service;

import entities.Juros;

public class TaxaJurosService {

    public static double calcularTaxaJuros(Juros juros) {
        double montante = juros.getMontante();
        double capital = juros.getCapital();
        int tempo = juros.getTempo();
        double aporteMensal = juros.getAporteMensal();


        if (juros.getTaxa() == 0) {
            return (montante - capital - (aporteMensal * tempo)) / capital * 100;
        }


        double taxaEstimativa = 0.05;
        double taxaFinal = taxaEstimativa;
        double erro = Double.MAX_VALUE;


        while (erro > 0.0001) {
            double montanteCalculado = calcularMontanteComAporte(capital, taxaFinal, tempo, aporteMensal);
            erro = Math.abs(montante - montanteCalculado);
            taxaFinal += (montante - montanteCalculado) / (montanteCalculado / 100);
        }

        juros.setTaxa(taxaFinal);
        return taxaFinal;
    }

    private static double calcularMontanteComAporte(double capital, double taxa, int tempo, double aporteMensal) {
        double montanteCapital = capital * Math.pow(1 + (taxa / 100), tempo);
        double montanteAportes = aporteMensal * (Math.pow(1 + (taxa / 100), tempo) - 1) / (taxa / 100);
        return montanteCapital + montanteAportes;
    }
}
