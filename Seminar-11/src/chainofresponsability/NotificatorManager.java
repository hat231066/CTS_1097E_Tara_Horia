package chainofresponsability;

public class NotificatorManager extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println(client.getNume()+" nu are nici nr de telefon si nici email");
    }
}
