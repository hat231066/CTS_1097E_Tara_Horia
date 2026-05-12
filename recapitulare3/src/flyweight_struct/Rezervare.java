package flyweight_struct;

public class Rezervare {
    private final Client client;
    private final int numarMasa;
    private final int numarPersoane;
    private final String oraRezervare;

    public Rezervare(Client client, int numarMasa, int numarPersoane, String oraRezervare) {
        this.client = client;
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    public void afiseazaRezervare() {
        System.out.println("----- Rezervare -----");
        client.afiseazaDateClient();
        System.out.println("Numar masa: " + numarMasa);
        System.out.println("Numar persoane: " + numarPersoane);
        System.out.println("Ora rezervare: " + oraRezervare);
        System.out.println();
    }
}
