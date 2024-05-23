package br.ime.usp.mac321.lista08.ex04;

import br.ime.usp.mac321.lista08.ex03.MulticonjuntoArrayList;
import br.ime.usp.mac321.lista08.ex03.MulticonjuntoSet;
import br.ime.usp.mac321.lista08.ex03.MulticonjuntoLinkedList;
import br.ime.usp.mac321.lista08.ex03.MulticonjuntoStack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MulticonjuntoAdapterTest {

    @Test
    public void testMulticonjuntoArrayListAdapter() {
        MulticonjuntoArrayList<String> multiconjunto = new MulticonjuntoArrayList<>();
        multiconjunto.add("A");
        multiconjunto.add("B");
        multiconjunto.add("A"); // Elemento duplicado

        MulticonjuntoAdapter<String> adapter = new MulticonjuntoAdapter<>(multiconjunto.getElements());

        assertEquals("[A, B]", adapter.toString());
    }

    @Test
    public void testMulticonjuntoSetAdapter() {
        MulticonjuntoSet<String> multiconjunto = new MulticonjuntoSet<>();
        multiconjunto.add("A");
        multiconjunto.add("B");
        multiconjunto.add("A"); // Set já ignora duplicados

        MulticonjuntoAdapter<String> adapter = new MulticonjuntoAdapter<>(multiconjunto.getElements());

        assertEquals("[A, B]", adapter.toString());
    }

    @Test
    public void testMulticonjuntoLinkedListAdapter() {
        MulticonjuntoLinkedList<String> multiconjunto = new MulticonjuntoLinkedList<>();
        multiconjunto.add("A");
        multiconjunto.add("B");
        multiconjunto.add("A"); // Elemento duplicado

        MulticonjuntoAdapter<String> adapter = new MulticonjuntoAdapter<>(multiconjunto.getElements());

        assertEquals("[A, B]", adapter.toString());
    }

    @Test
    public void testMulticonjuntoStackAdapter() {
        MulticonjuntoStack<String> multiconjunto = new MulticonjuntoStack<>();
        multiconjunto.add("A");
        multiconjunto.add("B");
        multiconjunto.add("A"); // Elemento duplicado

        MulticonjuntoAdapter<String> adapter = new MulticonjuntoAdapter<>(multiconjunto.getElements());

        assertEquals("[A, B]", adapter.toString());
    }
}
