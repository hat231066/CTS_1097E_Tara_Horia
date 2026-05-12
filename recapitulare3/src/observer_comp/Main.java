package observer_comp;

//B.12. Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte. Astfel se dorește
//implementarea unui modul care atunci când se realizează o ofertă de preț sau se introduce un nou
//meniu să se trimită notificări tuturor clienților abonați la notificările restaurantului.

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        ObserverClient client1 = new ClientFidel(
                "Popescu Ana",
                "ana.popescu@gmail.com"
        );

        ObserverClient client2 = new ClientFidel(
                "Ionescu Mihai",
                "mihai.ionescu@gmail.com"
        );

        ObserverClient client3 = new ClientFidel(
                "Dumitrescu Elena",
                "elena.dumitrescu@gmail.com"
        );

        restaurant.aboneazaClient(client1);
        restaurant.aboneazaClient(client2);
        restaurant.aboneazaClient(client3);

        restaurant.adaugaOfertaNoua("Reducere 20% la meniul zilei");

        restaurant.dezaboneazaClient(client2);

        restaurant.adaugaMeniuNou("Meniu vegetarian de vara");
    }
}
