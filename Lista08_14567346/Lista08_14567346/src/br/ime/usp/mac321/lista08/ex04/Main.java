package br.ime.usp.mac321.lista08.ex04;

import br.ime.usp.mac321.lista08.ex03.MulticonjuntoArrayList;

public class Main {
    public static void main(String[] args) {
        MulticonjuntoArrayList<String> multiconjunto = new MulticonjuntoArrayList<>();
        multiconjunto.add("A");
        multiconjunto.add("B");
        multiconjunto.add("A"); // Elemento duplicado

        MulticonjuntoAdapter<String> adapter = new MulticonjuntoAdapter<>(multiconjunto.getElements());

        for (String element : adapter) {
            System.out.println(element);
        }
    }
}
