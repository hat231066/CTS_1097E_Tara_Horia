package flyweight_struct;

public class AutobuzLinie {
    private String modelAutobuz;
    private int anFabricatie;
    private int numarLocuri;
    private Linie linie;

    public AutobuzLinie(String modelAutobuz, int anFabricatie, int numarLocuri, Linie linie) {
        this.modelAutobuz = modelAutobuz;
        this.anFabricatie = anFabricatie;
        this.numarLocuri = numarLocuri;
        this.linie = linie;
    }

    public void afiseaza() {
        linie.afiseazaAutobuz(modelAutobuz, anFabricatie, numarLocuri);
    }
}