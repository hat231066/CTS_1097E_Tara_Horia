package observer_comp;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements RestaurantSubject {
    private final List<ObserverClient> clientiAbonati;

    public Restaurant() {
        this.clientiAbonati = new ArrayList<>();
    }

    @Override
    public void aboneazaClient(ObserverClient client) {
        clientiAbonati.add(client);
    }

    @Override
    public void dezaboneazaClient(ObserverClient client) {
        clientiAbonati.remove(client);
    }

    @Override
    public void notificaClienti(String mesaj) {
        for (ObserverClient client : clientiAbonati) {
            client.primesteNotificare(mesaj);
        }
    }

    public void adaugaOfertaNoua(String oferta) {
        System.out.println("A fost adaugata o oferta noua!");
        notificaClienti("Oferta noua: " + oferta);
    }

    public void adaugaMeniuNou(String meniu) {
        System.out.println("A fost introdus un meniu nou!");
        notificaClienti("Meniu nou disponibil: " + meniu);
    }
}