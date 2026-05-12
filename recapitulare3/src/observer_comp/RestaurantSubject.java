package observer_comp;

public interface RestaurantSubject {
    void aboneazaClient(ObserverClient client);
    void dezaboneazaClient(ObserverClient client);
    void notificaClienti(String mesaj);
}
