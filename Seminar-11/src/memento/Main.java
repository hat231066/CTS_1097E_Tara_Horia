package memento;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("mercedes",2003,36,"Ureche Alexandra",
                129.9);
        Autobuz a2 = new Autobuz("bmw",2007,50,"Mircea Bravo",
                200.5);
        Autobuz a3 = new Autobuz("model3",2016,43,"Despot Adi",
                32.43);
        System.out.println(a1);

        AutobuzMemento autobuzMemento = a1.salvareMemento();
        a1.setNumeSofer("ana");
        a1.setConsumMediu(12.12);
        System.out.println(a1);

        a1.restaurareMemento(autobuzMemento);
        System.out.println(a1);
    }
}
