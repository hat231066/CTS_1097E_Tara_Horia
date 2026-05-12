package strategy_comp;

public class ValidatorCalatorie {
    private MetodaPlata metodaPlata;

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void valideazaCalatorie(double suma) {
        if (metodaPlata == null) {
            System.out.println("Nu a fost selectata nicio metoda de plata.");
            return;
        }

        metodaPlata.plateste(suma);
        System.out.println("Calatoria a fost validata.");
    }
}
