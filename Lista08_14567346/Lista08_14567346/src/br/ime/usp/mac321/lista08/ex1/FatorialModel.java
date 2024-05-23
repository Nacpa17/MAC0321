package br.ime.usp.mac321.lista08.ex1;

public class FatorialModel {
    public long calcularFatorial(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
