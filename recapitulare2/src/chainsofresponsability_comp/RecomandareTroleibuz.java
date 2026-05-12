package chainsofresponsability_comp;

public class RecomandareTroleibuz extends RecomandareTransport {

    @Override
    public void recomanda(double distantaKm) {
        if (distantaKm < 3) {
            System.out.println("Pentru " + distantaKm + " km se recomanda Troleibuzul.");
        } else if (urmatorul != null) {
            urmatorul.recomanda(distantaKm);
        }
    }
}
