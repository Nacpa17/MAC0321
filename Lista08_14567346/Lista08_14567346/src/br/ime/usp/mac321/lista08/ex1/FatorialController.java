package br.ime.usp.mac321.lista08.ex1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FatorialController {
    private FatorialModel model;
    private FatorialView view;

    public FatorialController(FatorialModel model, FatorialView view) {
        this.model = model;
        this.view = view;

        this.view.addCalcularListener(new CalcularListener());
    }

    class CalcularListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int numero = Integer.parseInt(view.getNumero());
                long resultado = model.calcularFatorial(numero);
                view.setResultado(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                view.setResultado("Entrada inválida. Digite um número inteiro.");
            } catch (IllegalArgumentException ex) {
                view.setResultado(ex.getMessage());
            }
        }
    }
}
