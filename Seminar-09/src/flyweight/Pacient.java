package flyweight;

import java.util.StringJoiner;

public class Pacient {
    private final String nume;
    private final String nrTelefon;
    private final String adresa;

    public Pacient(String adresa, String nrTelefon, String nume) {
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
        this.nume = nume;
    }

    public Pacient(Pacient pacient) {
        this.nume = pacient.nume;
        this.nrTelefon = pacient.nrTelefon;
        this.adresa = pacient.adresa;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pacient.class.getSimpleName() + "[", "]")
                .add("nume='" + nume + "'")
                .add("nrTelefon='" + nrTelefon + "'")
                .add("adresa='" + adresa + "'")
                .toString();
    }
}
