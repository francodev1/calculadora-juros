package service;

import entities.Juros;

public class SimplesService {

    public static double calcularJurosSimples(Juros juros) {
        double montante = calcularMontante(juros.getCapital(), juros.getTaxa(), juros.getTempo());

        juros.setMontante(montante);
        return montante;
    }

    private static double calcularMontante(double capital, double taxa, int tempo) {
        return capital * (1 + (taxa / 100) * tempo);
    }
}
