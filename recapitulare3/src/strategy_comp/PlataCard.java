package strategy_comp;

public class PlataCard implements ModPlata {

    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul realizata pentru suma de " + suma + " lei.");
    }
}
