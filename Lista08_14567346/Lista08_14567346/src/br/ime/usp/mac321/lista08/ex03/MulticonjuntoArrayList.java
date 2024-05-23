package br.ime.usp.mac321.lista08.ex03;

import java.util.ArrayList;

public class MulticonjuntoArrayList<T> {
    private ArrayList<T> elements;

    public MulticonjuntoArrayList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MulticonjuntoArrayList<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MulticonjuntoArrayList<T> m) {
        elements.addAll(m.elements);
    }

    public ArrayList<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
