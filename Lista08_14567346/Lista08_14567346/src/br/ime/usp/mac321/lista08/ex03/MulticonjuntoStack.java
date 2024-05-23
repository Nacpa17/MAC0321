package br.ime.usp.mac321.lista08.ex03;

import java.util.Stack;

public class MulticonjuntoStack<T> {
    private Stack<T> elements;

    public MulticonjuntoStack() {
        this.elements = new Stack<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MulticonjuntoStack<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MulticonjuntoStack<T> m) {
        elements.addAll(m.elements);
    }

    public Stack<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
