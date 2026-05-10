package flyweight;

//
//A.10. Pentru fiecare internare trebuie să se rețină informații cu privire la pacientul internat precum:
//nume, număr de telefon, adresă, etc, precum și informațiile despre salonul unde este internat:
//        număr salon, număr pat, număr zile spitalizare, etc. Astfel, dacă un pacient este internat de mai
//multe ori de-a lungul timpului, informațiile despre acesta sunt aceleași și se repetă, ocupând foarte
//multă memorie. Să se implementeze modulul de memorare al tuturor internărilor astfel încât să nu
//ocupe memorie foarte multă.


public class MainFlyweight {
    public static void main(String[] args) {
        IPacientFlyweight pacientFlyweight1 = PacientFlyweightFactory.getPacient("Mihai", "0722222222", "Calea Dorobanti");
        IPacientFlyweight pacientFlyweight2 = PacientFlyweightFactory.getPacient("Mihai", "0722222222", "Calea Dorobanti");
        IPacientFlyweight pacientFlyweight3 = PacientFlyweightFactory.getPacient("Mihai", "0722222222", "Calea Dorobanti");

        Internare internare1 = new Internare(25, 1, 7);
        Internare internare2 = new Internare(100, 5, 14);
        Internare internare3 = new Internare(250, 10, 21);
        Internare internare4 = new Internare(500, 15, 28);

        pacientFlyweight1.afisareDetaliiInternare(internare1);
        pacientFlyweight2.afisareDetaliiInternare(internare2);
        pacientFlyweight1.afisareDetaliiInternare(internare3);
        pacientFlyweight3.afisareDetaliiInternare(internare4);

        System.out.println("Total numar pacienti unici: " + PacientFlyweightFactory.getNumarPacientiUnici());
    }
}
