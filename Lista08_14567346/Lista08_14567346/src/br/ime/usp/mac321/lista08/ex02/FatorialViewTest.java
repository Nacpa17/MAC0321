package br.ime.usp.mac321.lista08.ex02;

import br.ime.usp.mac321.lista08.ex1.FatorialView;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FatorialViewTest {
    private FatorialView view;
    private JFrame frame;

    @BeforeEach
    public void setUp() {
        frame = new JFrame();
        view = new FatorialView();
        frame.setContentPane(view.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    @AfterEach
    public void tearDown() {
        frame.dispose();
    }

    @Test
    public void testCalcularFatorial() {
        JTextField inputField = (JTextField) findComponentByName(frame, "inputField");
        JButton calcularButton = (JButton) findComponentByName(frame, "calcularButton");
        JLabel resultadoLabel = (JLabel) findComponentByName(frame, "resultadoLabel");

        inputField.setText("5");
        calcularButton.doClick();

        assertEquals("Resultado: 120", resultadoLabel.getText());
    }

    @Test
    public void testEntradaInvalida() {
        JTextField inputField = (JTextField) findComponentByName(frame, "inputField");
        JButton calcularButton = (JButton) findComponentByName(frame, "calcularButton");
        JLabel resultadoLabel = (JLabel) findComponentByName(frame, "resultadoLabel");

        inputField.setText("abc");
        calcularButton.doClick();

        assertEquals("Resultado: Entrada inválida. Digite um número inteiro.", resultadoLabel.getText());
    }

    /**
     * Teste de Aceitação:
     * 1. Execute o método main da classe FatorialMain para abrir a interface gráfica.
     * 2. Digite um número inteiro no campo de texto e clique no botão "Calcular".
     * 3. Verifique se o resultado mostrado está correto.
     * 4. Digite um valor inválido (como letras) no campo de texto e clique no botão "Calcular".
     * 5. Verifique se a mensagem de erro correta é exibida.
     *
     * Comentário: Esse teste de aceitação requer a interação manual do usuário para verificar se a interface
     * gráfica responde conforme esperado. O teste automatizado pode verificar se a lógica funciona corretamente,
     * mas a experiência do usuário ao usar a interface gráfica deve ser validada manualmente.
     */
    @Test
    public void testAceitacao() {
        // Instruções para o usuário:
        System.out.println("Teste de Aceitação:");
        System.out.println("1. Execute o método main da classe FatorialMain para abrir a interface gráfica.");
        System.out.println("2. Digite um número inteiro no campo de texto e clique no botão 'Calcular'.");
        System.out.println("3. Verifique se o resultado mostrado está correto.");
        System.out.println("4. Digite um valor inválido (como letras) no campo de texto e clique no botão 'Calcular'.");
        System.out.println("5. Verifique se a mensagem de erro correta é exibida.");
    }

    private Component findComponentByName(Container container, String name) {
        for (Component component : container.getComponents()) {
            if (name.equals(component.getName())) {
                return component;
            }
            if (component instanceof Container) {
                Component found = findComponentByName((Container) component, name);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }
}
