package chainofresponsability;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alexandra",null,"alex@gmail.com");
        Client client2 = new Client("Ureche","0767676767",null);
        Client client3 = new Client("Rock",null,null);

        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManagaer = new NotificatorManager();

        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorSMS.setSuccesor(notificatorManagaer);

        List<Client> clienti = Arrays.asList(client1,client2,client3);

        clienti.forEach(client->notificatorSMS.trimiteNotificare(client,"ai primit o notificare"));
    }
}
