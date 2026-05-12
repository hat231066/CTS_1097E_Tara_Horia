package proxy_struct;

public class Rezervare implements IRezervare {

    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        System.out.println("Rezervare realizata pentru clientul "
                + numeClient + ", pentru " + numarPersoane + " persoane.");
    }
}
