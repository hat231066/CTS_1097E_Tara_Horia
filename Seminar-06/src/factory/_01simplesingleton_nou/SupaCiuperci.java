package factory._01simplesingleton_nou;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa de ciuperci: " + super.getDenumire());
    }
}