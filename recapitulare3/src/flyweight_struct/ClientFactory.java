package flyweight_struct;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {
    private final static Map<String, Client> clienti = new HashMap<>();

    public static Client getClient(String nume, String telefon, String email) {
        String cheie = nume + "_" + telefon + "_" + email;

        if (!clienti.containsKey(cheie)) {
            Client client = new Client(nume, telefon, email);
            clienti.put(cheie, client);
            System.out.println("Client nou creat: " + nume);
        } else {
            System.out.println("Client existent reutilizat: " + nume);
        }

        return clienti.get(cheie);
    }

    public static int getNumarClientiCreati() {
        return clienti.size();
    }
}
