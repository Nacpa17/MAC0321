package br.ime.usp.mac321.lista08.ex03;

import java.util.LinkedList;

public class MulticonjuntoLinkedList<T> {
    private LinkedList<T> elements;

    public MulticonjuntoLinkedList() {
        this.elements = new LinkedList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MulticonjuntoLinkedList<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MulticonjuntoLinkedList<T> m) {
        elements.addAll(m.elements);
    }

    public LinkedList<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
