package flyweight_struct;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    private Map<Integer, Linie> linii;

    public LinieFactory() {
        this.linii = new HashMap<>();
    }

    public Linie getLinie(int numarLinie, String primaStatie, String ultimaStatie) {
        if (!linii.containsKey(numarLinie)) {
            Linie linie = new LinieAutobuz(numarLinie, primaStatie, ultimaStatie);
            linii.put(numarLinie, linie);
            System.out.println("S-a creat linia " + numarLinie);
        } else {
            System.out.println("S-a reutilizat linia " + numarLinie);
        }

        return linii.get(numarLinie);
    }

    public int getNumarLiniiCreate() {
        return linii.size();
    }
}