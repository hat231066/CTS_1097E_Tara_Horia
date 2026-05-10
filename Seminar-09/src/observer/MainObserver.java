package observer;

//A.12. Spitalul dorește să anunțe toți pacienții care au fost în spital ori de câte ori apare vreo urgență
//cu privire la viruși existenți în oraș. Astfel se dorește implementarea unui modul care atunci când
//apare o epidemie sau un virus nou să se trimită notificări tuturor persoanelor abonate la notificările
//spitalului.

public class MainObserver {
    public static void main(String[] args) {
        Spital spital = new Spital("Spital Epidemiologic");

        Pacient pacient1 = new Pacient("Ion");
        Pacient pacient2 = new Pacient("Mihai");
        Pacient pacient3 = new Pacient("Ana");

        spital.adaugaObserver(pacient1);
        spital.adaugaObserver(pacient2);
        spital.adaugaObserver(pacient3);

        spital.notificaEpidemie("Virus periculos");

        spital.stergeObserver(pacient2);

        spital.notificaEpidemie("Virus extraordinar de periculos");
    }
}
