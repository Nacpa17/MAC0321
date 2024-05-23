package br.ime.usp.mac321.lista08.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MulticonjuntoAdapter<T> implements Iterable<T> {
    private Set<T> uniqueElements;

    public MulticonjuntoAdapter(Iterable<T> multiconjunto) {
        uniqueElements = new HashSet<>();
        for (T element : multiconjunto) {
            uniqueElements.add(element);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return uniqueElements.iterator();
    }

    @Override
    public String toString() {
        return uniqueElements.toString();
    }
}
