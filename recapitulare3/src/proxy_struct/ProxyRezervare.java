package proxy_struct;

public class ProxyRezervare implements IRezervare {

    private final Rezervare rezervare;

    public ProxyRezervare() {
        this.rezervare = new Rezervare();
    }

    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        if (numarPersoane >= 4) {
            rezervare.realizeazaRezervare(numeClient, numarPersoane);
        } else {
            System.out.println("Rezervarea nu a fost realizata pentru clientul "
                    + numeClient + ".");
            System.out.println("Pentru mesele de doua persoane sunt suficiente locuri.");
            System.out.println("Clientii sunt rugati sa se prezinte direct la restaurant.");
        }
    }
}
