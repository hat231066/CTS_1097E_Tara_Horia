package flyweight;

import java.util.StringJoiner;

public class Internare {
    private final int nrSalon;
    private final int nrPat;
    private final int nrZile;

    public Internare(int nrSalon, int nrPat, int nrZile) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZile = nrZile;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Internare.class.getSimpleName() + "[", "]")
                .add("nrSalon=" + nrSalon)
                .add("nrPat=" + nrPat)
                .add("nrZile=" + nrZile)
                .toString();
    }
}
