package command_comp;

public class ComandaPlecare implements Comanda {
    private Autobuz autobuz;
    private int numarLinie;

    public ComandaPlecare(Autobuz autobuz, int numarLinie) {
        this.autobuz = autobuz;
        this.numarLinie = numarLinie;
    }

    @Override
    public void executa() {
        autobuz.pleacaPeLinie(numarLinie);
    }
}
