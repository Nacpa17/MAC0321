package ex1;

import javax.swing.*;
import java.awt.event.*;
import java.math.BigInteger;

public class FatorialInterface extends JFrame {
    private JTextField textField;
    private JButton button;
    private JLabel resultLabel;

    public FatorialInterface() {
        setTitle("Calculadora de Fatorial");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        textField = new JTextField(10);
        textField.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		displayFatorial();
        	}
        });
        panel.add(textField);


        button = new JButton("Calcular");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	displayFatorial();
            }
        });
        panel.add(button);
        

        resultLabel = new JLabel("");
        panel.add(resultLabel);

        
        add(panel);
    }

    private void displayFatorial() {
        try {
            int numero = Integer.parseInt(textField.getText());
            String resultado = calcularFatorial(numero).toString();
            resultLabel.setText("O fatorial de " + numero + " é: " + resultado);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Por favor, insira um número inteiro válido.");
        } catch (IllegalArgumentException ex) {
            resultLabel.setText(ex.getMessage());
        }
    }

    private BigInteger calcularFatorial(int n) {
        if (n < 0) throw new IllegalArgumentException("O número deve ser não negativo.");
        
        BigInteger fatorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) 
        	fatorial = fatorial.multiply(BigInteger.valueOf(i));
        
        return fatorial;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FatorialInterface().setVisible(true);
            }
        });
    }
}
