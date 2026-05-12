package chainsofresponsability_comp;

public abstract class RecomandareTransport {
    protected RecomandareTransport urmatorul;

    public void setUrmatorul(RecomandareTransport urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void recomanda(double distantaKm);
}