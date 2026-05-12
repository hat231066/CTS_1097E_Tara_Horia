package flyweight_struct;

//B.10. Pentru fiecare rezervare trebuie să se rețină informații cu privire la clientul restaurantului
//precum: nume, număr de telefon, adresă de mail, etc, precum și informațiile despre masa rezervata:
//număr masa, număr persoane, ora rezervare, etc. Astfel, dacă un client realizează mai multe
//rezervări, la fiecare rezervare, informațiile despre client sunt aceleași și se repetă, ocupând foarte
//multă memorie. Să se implementeze modulul de memorare al rezervărilor astfel încât să nu ocupe
//memorie foarte multă.

public class Main {
    public static void main(String[] args) {
        Client client1 = ClientFactory.getClient(
                "Popescu Ana",
                "0712345678",
                "ana.popescu@gmail.com"
        );

        Rezervare rezervare1 = new Rezervare(client1, 5, 4, "18:00");
        rezervare1.afiseazaRezervare();

        Client client2 = ClientFactory.getClient(
                "Popescu Ana",
                "0712345678",
                "ana.popescu@gmail.com"
        );

        Rezervare rezervare2 = new Rezervare(client2, 8, 6, "20:00");
        rezervare2.afiseazaRezervare();

        Client client3 = ClientFactory.getClient(
                "Ionescu Mihai",
                "0799999999",
                "mihai.ionescu@gmail.com"
        );

        Rezervare rezervare3 = new Rezervare(client3, 3, 2, "19:30");
        rezervare3.afiseazaRezervare();

        System.out.println("Numar obiecte Client create: "
                + ClientFactory.getNumarClientiCreati());
    }
}
