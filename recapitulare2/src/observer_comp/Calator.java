package observer_comp;

public class Calator implements CalatorObserver {
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Calatorul " + nume + " a primit notificarea: " + mesaj);
    }
}