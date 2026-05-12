package composite_struct;

public class Main {
    public static void main(String[] args) {
        GrupAutobuze flota = new GrupAutobuze("Flota companiei de transport");

        GrupAutobuze grupMic = new GrupAutobuze("Grup autobuze mici - 10 locuri");
        GrupAutobuze grupMediu = new GrupAutobuze("Grup autobuze medii - 30 locuri");
        GrupAutobuze grupMare = new GrupAutobuze("Grup autobuze mari - 50 locuri");

        Autobuz autobuz1 = new Autobuz("Mercedes", "Sprinter City", 10);
        Autobuz autobuz2 = new Autobuz("Iveco", "Daily Minibus", 10);

        Autobuz autobuz3 = new Autobuz("MAN", "Lion's City M", 30);
        Autobuz autobuz4 = new Autobuz("Solaris", "Urbino 10.5", 30);

        Autobuz autobuz5 = new Autobuz("Mercedes", "Citaro", 50);
        Autobuz autobuz6 = new Autobuz("Volvo", "7900", 50);

        grupMic.adaugaComponenta(autobuz1);
        grupMic.adaugaComponenta(autobuz2);

        grupMediu.adaugaComponenta(autobuz3);
        grupMediu.adaugaComponenta(autobuz4);

        grupMare.adaugaComponenta(autobuz5);
        grupMare.adaugaComponenta(autobuz6);

        flota.adaugaComponenta(grupMic);
        flota.adaugaComponenta(grupMediu);
        flota.adaugaComponenta(grupMare);

        flota.afiseaza("");
    }
}
