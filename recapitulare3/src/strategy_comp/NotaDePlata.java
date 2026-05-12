package strategy_comp;

public class NotaDePlata {
    private final double suma;
    private ModPlata modPlata;

    public NotaDePlata(double suma) {
        this.suma = suma;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void efectueazaPlata() {
        if (modPlata == null) {
            System.out.println("Nu a fost selectata nicio metoda de plata.");
        } else {
            modPlata.plateste(suma);
        }
    }
}
