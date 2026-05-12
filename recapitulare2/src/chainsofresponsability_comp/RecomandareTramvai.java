package chainsofresponsability_comp;

public class RecomandareTramvai extends RecomandareTransport {

    @Override
    public void recomanda(double distantaKm) {
        if (distantaKm >= 5 && distantaKm <= 10) {
            System.out.println("Pentru " + distantaKm + " km se recomanda Tramvaiul.");
        } else if (urmatorul != null) {
            urmatorul.recomanda(distantaKm);
        }
    }
}
