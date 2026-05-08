package flyweight;

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
