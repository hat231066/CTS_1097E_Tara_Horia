package factory._01simplesingleton_nou;

public class SupaSimpleFactorySingleton {
    private static SupaSimpleFactorySingleton instanta = null;

    private SupaSimpleFactorySingleton() {
    }

    public static synchronized SupaSimpleFactorySingleton getInstanta() {
        if (SupaSimpleFactorySingleton.instanta == null) {
            SupaSimpleFactorySingleton.instanta = new SupaSimpleFactorySingleton();
        }
        return SupaSimpleFactorySingleton.instanta;
    }

    public Supa getSupa(TipSupa tipSupa, String denumire) {
        return switch (tipSupa) {
            case LEGUME -> new SupaLegume(denumire);
            case CIUPERCI -> new SupaCiuperci(denumire);
            default -> throw new IllegalArgumentException("Tipul supei transmis nu există.");
        };
    }

    public Supa getSupa(TipSupa tipSupa, String denumire, Double gramaj) {
        return switch (tipSupa) {
            case VITA -> new SupaVita(denumire, gramaj);
            default -> this.getSupa(tipSupa, denumire);
        };
    }
}