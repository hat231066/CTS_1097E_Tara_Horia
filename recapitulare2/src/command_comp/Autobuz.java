package command_comp;

public class Autobuz {
    private String numarAutobuz;

    public Autobuz(String numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
    }

    public void pleacaPeLinie(int numarLinie) {
        System.out.println("Autobuzul " + numarAutobuz
                + " pleaca de la capat de linie pe linia " + numarLinie + ".");
    }
}