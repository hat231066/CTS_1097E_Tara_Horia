package memento;

public class AutobuzMemento {
    private String nume_sofer;
    private double consum_mediu;

    public AutobuzMemento(String nume_sofer, double consum_mediu) {
        this.nume_sofer = nume_sofer;
        this.consum_mediu = consum_mediu;
    }

    public String getNume_sofer() {
        return nume_sofer;
    }

    public double getConsum_mediu() {
        return consum_mediu;
    }
}
