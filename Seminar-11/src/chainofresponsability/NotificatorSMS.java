package chainofresponsability;

public class NotificatorSMS extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getNumar_telefon()!=null && !client.getNumar_telefon().isEmpty()){
            System.out.println(client.getNume()+" a primit notificarea "+ mesaj);
        }
        else if(super.getSuccesor()!=null){
            super.getSuccesor().trimiteNotificare(client,mesaj);
        }
        else{
            System.out.println("clientul nu are numar de telefon si nu exista succesor");
        }
    }
}
