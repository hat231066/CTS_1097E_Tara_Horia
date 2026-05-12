package observer_comp;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements AutobuzObservable {
    private String numarLinie;
    private List<CalatorObserver> calatoriAbonati;

    public Autobuz(String numarLinie) {
        this.numarLinie = numarLinie;
        this.calatoriAbonati = new ArrayList<>();
    }

    @Override
    public void adaugaCalator(CalatorObserver calator) {
        calatoriAbonati.add(calator);
    }

    @Override
    public void stergeCalator(CalatorObserver calator) {
        calatoriAbonati.remove(calator);
    }

    @Override
    public void notificaCalatori() {
        String mesaj = "Autobuzul de pe linia " + numarLinie
                + " a plecat de la capat de linie.";

        for (CalatorObserver calator : calatoriAbonati) {
            calator.primesteNotificare(mesaj);
        }
    }

    public void pleacaDeLaCapatDeLinie() {
        System.out.println("Autobuzul de pe linia " + numarLinie
                + " s-a pus in miscare.");

        notificaCalatori();
    }
}
