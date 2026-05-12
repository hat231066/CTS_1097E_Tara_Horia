package composite;

//A.8. Este dorita reprezentarea departamentelor spitalului in cadrul aplicației. Fiecare departament
//conține subdepartamente sau secții. Secțiile nu conțin subsecții. Sa se implementeze modulul care
//permite reprezentarea arborescenta a departamentelor si secțiilor spitalului.

public class Main {
    public static void main(String[] args) {
        Sectie dermatologie = new Sectie("dermatologie");
        Sectie cardiologie = new Sectie("cardiologie");
        Sectie pediatrie = new Sectie("pediatrie");

        Departament departamentAdulti = new Departament("adulti");
        Departament departamentCopii = new Departament("copii");
        Departament spital = new Departament("spital");

        departamentAdulti.adaugaStructura(dermatologie);
        departamentAdulti.adaugaStructura(cardiologie);
        departamentCopii.adaugaStructura(pediatrie);

        spital.adaugaStructura(departamentAdulti);
        spital.adaugaStructura(departamentCopii);

        spital.afiseazaIerarhieSpital("  ");
    }
}
