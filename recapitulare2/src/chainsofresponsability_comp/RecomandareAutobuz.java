package chainsofresponsability_comp;

public class RecomandareAutobuz extends RecomandareTransport {

    @Override
    public void recomanda(double distantaKm) {
        if (distantaKm >= 3 && distantaKm < 5) {
            System.out.println("Pentru " + distantaKm + " km se recomanda Autobuzul.");
        } else if (urmatorul != null) {
            urmatorul.recomanda(distantaKm);
        }
    }
}
