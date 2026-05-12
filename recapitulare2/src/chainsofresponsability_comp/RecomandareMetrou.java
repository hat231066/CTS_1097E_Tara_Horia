package chainsofresponsability_comp;

public class RecomandareMetrou extends RecomandareTransport {

    @Override
    public void recomanda(double distantaKm) {
        if (distantaKm > 10) {
            System.out.println("Pentru " + distantaKm + " km se recomanda Metroul.");
        } else {
            System.out.println("Nu exista recomandare pentru distanta introdusa.");
        }
    }
}
