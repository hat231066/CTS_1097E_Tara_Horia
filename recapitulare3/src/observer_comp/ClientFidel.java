package observer_comp;

public class ClientFidel implements ObserverClient {
    private final String nume;
    private final String email;

    public ClientFidel(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Notificare pentru " + nume + " la adresa " + email);
        System.out.println("Mesaj: " + mesaj);
        System.out.println("-----------------------------");
    }
}