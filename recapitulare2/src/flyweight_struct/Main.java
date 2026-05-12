package flyweight_struct;

//F.9. Pentru fiecare AutobuzLinie sunt salvate in memorie, informatii precum: model autobuz, an fabricatie, numar locuri, numar linie,prima statie, ultima statie.
//Aceste informatii sunt salvate pentru fiecare AutobuzLinie din oras.
//Se doreste implementarea unui modul care sa asigure gestiunea in mod optim a memoriei,
//tinandu-se cont de faptul ca anumite informatii sunt redundante,
//deoarece pe o linie vor merge mai multe autobuze.

public class Main {
    public static void main(String[] args) {
        LinieFactory factory = new LinieFactory();

        Linie linia10 = factory.getLinie(10, "Piata Unirii", "Aeroport");
        Linie linia20 = factory.getLinie(20, "Gara de Nord", "Cartier Vest");

        AutobuzLinie autobuz1 = new AutobuzLinie("Mercedes Citaro", 2018, 50, linia10);
        AutobuzLinie autobuz2 = new AutobuzLinie("MAN Lion's City", 2020, 50, linia10);
        AutobuzLinie autobuz3 = new AutobuzLinie("Solaris Urbino", 2019, 50, linia20);

        // Se cere din nou linia 10, dar nu se mai creeaza un obiect nou.
        Linie linia10Reutilizata = factory.getLinie(10, "Piata Unirii", "Aeroport");

        AutobuzLinie autobuz4 = new AutobuzLinie("Volvo 7900", 2021, 50, linia10Reutilizata);

        autobuz1.afiseaza();
        autobuz2.afiseaza();
        autobuz3.afiseaza();
        autobuz4.afiseaza();

        System.out.println("Numar obiecte Linie create: " + factory.getNumarLiniiCreate());
    }
}
