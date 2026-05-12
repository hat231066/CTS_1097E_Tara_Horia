package flyweight_struct;

public class LinieAutobuz implements Linie {
    private int numarLinie;
    private String primaStatie;
    private String ultimaStatie;

    public LinieAutobuz(int numarLinie, String primaStatie, String ultimaStatie) {
        this.numarLinie = numarLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseazaAutobuz(String modelAutobuz, int anFabricatie, int numarLocuri) {
        System.out.println("Autobuz: " + modelAutobuz
                + ", an fabricatie: " + anFabricatie
                + ", locuri: " + numarLocuri
                + " | Linie: " + numarLinie
                + ", prima statie: " + primaStatie
                + ", ultima statie: " + ultimaStatie);
    }
}
