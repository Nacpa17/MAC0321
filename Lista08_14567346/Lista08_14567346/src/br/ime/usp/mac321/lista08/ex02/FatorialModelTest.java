package br.ime.usp.mac321.lista08.ex02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.ime.usp.mac321.lista08.ex1.FatorialModel;

public class FatorialModelTest {
    @Test
    public void testCalcularFatorial() {
        FatorialModel model = new FatorialModel();
        assertEquals(1, model.calcularFatorial(0));
        assertEquals(1, model.calcularFatorial(1));
        assertEquals(2, model.calcularFatorial(2));
        assertEquals(6, model.calcularFatorial(3));
        assertEquals(24, model.calcularFatorial(4));
    }

    @Test
    public void testCalcularFatorialNumeroNegativo() {
        FatorialModel model = new FatorialModel();
        assertThrows(IllegalArgumentException.class, () -> {
            model.calcularFatorial(-1);
        });
    }
}
