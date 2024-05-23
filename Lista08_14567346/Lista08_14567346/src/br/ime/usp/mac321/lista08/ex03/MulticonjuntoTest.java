package br.ime.usp.mac321.lista08.ex03;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MulticonjuntoTest {

    @Test
    public void testMulticonjuntoArrayList() {
        MulticonjuntoArrayList<String> m1 = new MulticonjuntoArrayList<>();
        m1.add("A");
        m1.add("B");

        MulticonjuntoArrayList<String> m2 = new MulticonjuntoArrayList<>();
        m2.add("A");
        m2.add("B");

        assertTrue(m1.equals(m2));

        MulticonjuntoArrayList<String> m3 = new MulticonjuntoArrayList<>();
        m3.add("C");

        m1.addAll(m3);

        assertEquals("[A, B, C]", m1.toString());
    }

    @Test
    public void testMulticonjuntoSet() {
        MulticonjuntoSet<String> m1 = new MulticonjuntoSet<>();
        m1.add("A");
        m1.add("B");

        MulticonjuntoSet<String> m2 = new MulticonjuntoSet<>();
        m2.add("A");
        m2.add("B");

        assertTrue(m1.equals(m2));

        MulticonjuntoSet<String> m3 = new MulticonjuntoSet<>();
        m3.add("C");

        m1.addAll(m3);

        assertTrue(m1.getElements().contains("C"));
    }

    @Test
    public void testMulticonjuntoLinkedList() {
        MulticonjuntoLinkedList<String> m1 = new MulticonjuntoLinkedList<>();
        m1.add("A");
        m1.add("B");

        MulticonjuntoLinkedList<String> m2 = new MulticonjuntoLinkedList<>();
        m2.add("A");
        m2.add("B");

        assertTrue(m1.equals(m2));

        MulticonjuntoLinkedList<String> m3 = new MulticonjuntoLinkedList<>();
        m3.add("C");

        m1.addAll(m3);

        assertEquals("[A, B, C]", m1.toString());
    }

    @Test
    public void testMulticonjuntoStack() {
        MulticonjuntoStack<String> m1 = new MulticonjuntoStack<>();
        m1.add("A");
        m1.add("B");

        MulticonjuntoStack<String> m2 = new MulticonjuntoStack<>();
        m2.add("A");
        m2.add("B");

        assertTrue(m1.equals(m2));

        MulticonjuntoStack<String> m3 = new MulticonjuntoStack<>();
        m3.add("C");

        m1.addAll(m3);

        assertEquals("[A, B, C]", m1.toString());
    }
}
