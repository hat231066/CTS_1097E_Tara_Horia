package strategy_comp;

public class PlataCardCalatorii implements MetodaPlata {

    @Override
    public void plateste(double suma) {
        System.out.println("Plata de " + suma + " lei a fost realizata cu cardul de calatorii.");
    }
}