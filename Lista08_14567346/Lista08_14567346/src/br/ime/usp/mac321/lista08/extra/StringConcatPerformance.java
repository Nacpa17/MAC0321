package br.ime.usp.mac321.lista08.extra;

public class StringConcatPerformance {
    public static void main(String[] args) {
        int n = 100000; // Número de concatenações

        // Usando String
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
        long endTime = System.nanoTime();
        long durationString = (endTime - startTime) / 1000000; // Converter para milissegundos
        System.out.println("Tempo usando String: " + durationString + " ms");
        System.out.println("Comprimento da string resultante: " + str.length());

        // Usando StringBuffer
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("a");
        }
        endTime = System.nanoTime();
        long durationStringBuffer = (endTime - startTime) / 1000000; // Converter para milissegundos
        System.out.println("Tempo usando StringBuffer: " + durationStringBuffer + " ms");
        System.out.println("Comprimento da string resultante: " + stringBuffer.length());
    }
}
