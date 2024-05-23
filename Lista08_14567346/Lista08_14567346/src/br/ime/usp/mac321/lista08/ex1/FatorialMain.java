package br.ime.usp.mac321.lista08.ex1;

public class FatorialMain {
    public static void main(String[] args) {
        FatorialModel model = new FatorialModel();
        FatorialView view = new FatorialView();
        new FatorialController(model, view);

        view.setVisible(true);
    }
}
