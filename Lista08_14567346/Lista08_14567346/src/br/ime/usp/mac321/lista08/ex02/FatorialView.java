package br.ime.usp.mac321.lista08.ex02;

import javax.swing.*;
import java.awt.*;

public class FatorialView extends JFrame {
    private static final long serialVersionUID = 1L; // Adicionando serialVersionUID
    private JTextField inputField;
    private JButton calcularButton;
    private JLabel resultadoLabel;

    public FatorialView() {
        setTitle("Calculadora de Fatorial");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Digite um número: ");
        inputField = new JTextField(10);
        calcularButton = new JButton("Calcular");
        resultadoLabel = new JLabel("Resultado: ");

        add(inputLabel);
        add(inputField);
        add(calcularButton);
        add(resultadoLabel);
    }

    public String getNumero() {
        return inputField.getText();
    }

    public void setResultado(String resultado) {
        resultadoLabel.setText("Resultado: " + resultado);
    }

    public void addCalcularListener(java.awt.event.ActionListener listener) {
        calcularButton.addActionListener(listener);
    }
}
