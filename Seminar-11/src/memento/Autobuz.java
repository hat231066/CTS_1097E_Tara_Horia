package memento;

public class Autobuz {
    private String model;
    private int an_fabricatie;
    private int numar_locuri;
    private String nume_sofer;
    private double consum_mediu;

    public Autobuz(String model, int an_fabricatie, int numar_locuri,
                   String nume_sofer, double consum_mediu) {
        this.model = model;
        this.an_fabricatie = an_fabricatie;
        this.numar_locuri = numar_locuri;
        this.nume_sofer = nume_sofer;
        this.consum_mediu = consum_mediu;
    }

    public void setNumeSofer(String nume_sofer) {
        this.nume_sofer = nume_sofer;
    }

    public void setConsumMediu(double consum_mediu) {
        this.consum_mediu = consum_mediu;
    }

    public AutobuzMemento salvareMemento() {
        return new AutobuzMemento(this.nume_sofer, this.consum_mediu);
    }

    public void restaurareMemento(AutobuzMemento memento) {
        this.nume_sofer = memento.getNume_sofer();
        this.consum_mediu = memento.getConsum_mediu();
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", an_fabricatie=" + an_fabricatie +
                ", numar_locuri=" + numar_locuri +
                ", nume_sofer='" + nume_sofer + '\'' +
                ", consum_mediu=" + consum_mediu +
                '}';
    }
}
