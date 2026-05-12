package facade_struct;

public class Usa {
    private String pozitie;

    public Usa(String pozitie) {
        this.pozitie = pozitie;
    }

    public void puneInModLiber() {
        System.out.println("Usa " + pozitie + " este acum in modul liber.");
    }

    public void deschideFortat() {
        System.out.println("Usa " + pozitie + " a fost deschisa fortat.");
    }
}
