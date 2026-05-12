package decorator;

//
//A.7. Spitalul dorește să testeze punerea la dispoziție a rezultatelor prin intermediul platformei
//online ci nu doar printat. Există însă riscul să se revină la forma inițială de punere la dispoziția
//pacienților a rezultatelor. Se dorește adăugarea acestei noi funcționalități pentru sistemul software,
//care să permită revenirea la situația inițială.
//

public class Main {
    public static void main(String[] args) {
        IRezultate rezultatePrintate = new RezultatePrintate();
        IRezultate rezultateOnline = new RezultatOnlineDecorator(rezultatePrintate);
        rezultatePrintate.afiseazaRezultate();
        rezultateOnline.afiseazaRezultate();
        rezultatePrintate.afiseazaRezultate();
    }
}
