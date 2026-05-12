package strategy_comp;

//B.11. Este dorită implementarea modului de plată pentru clienții restaurantului. Modul de plată îl
//decide clientul în momentul în care trebuie să facă plata. Plata se poate realiza cu cardul sau cash.
//Sa se implementeze modulul de plata al restaurantului.

public class Main {
    public static void main(String[] args) {
        NotaDePlata nota1 = new NotaDePlata(120.5);
        nota1.setModPlata(new PlataCash());
        nota1.efectueazaPlata();

        NotaDePlata nota2 = new NotaDePlata(250.0);
        nota2.setModPlata(new PlataCard());
        nota2.efectueazaPlata();
    }
}
