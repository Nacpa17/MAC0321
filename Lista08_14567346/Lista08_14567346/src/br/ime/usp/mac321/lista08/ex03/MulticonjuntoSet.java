package br.ime.usp.mac321.lista08.ex03;

import java.util.HashSet;
import java.util.Set;

public class MulticonjuntoSet<T> {
    private Set<T> elements;

    public MulticonjuntoSet() {
        this.elements = new HashSet<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MulticonjuntoSet<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MulticonjuntoSet<T> m) {
        elements.addAll(m.elements);
    }

    public Set<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
