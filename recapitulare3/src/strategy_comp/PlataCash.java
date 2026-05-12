package strategy_comp;

public class PlataCash implements ModPlata {

    @Override
    public void plateste(double suma) {
        System.out.println("Plata cash realizata pentru suma de " + suma + " lei.");
    }
}