package observer_comp;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("104");

        CalatorObserver calator1 = new Calator("Andrei");
        CalatorObserver calator2 = new Calator("Maria");
        CalatorObserver calator3 = new Calator("Ioana");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.adaugaCalator(calator3);

        autobuz.pleacaDeLaCapatDeLinie();

        System.out.println();

        autobuz.stergeCalator(calator2);

        autobuz.pleacaDeLaCapatDeLinie();
    }
}
