package proxy_struct;

public class AutobuzNoapteReal implements AutobuzNoapte {
    private String numarAutobuz;
    private int numarCalatori;

    public AutobuzNoapteReal(String numarAutobuz, int numarCalatori) {
        this.numarAutobuz = numarAutobuz;
        this.numarCalatori = numarCalatori;
    }

    public int getNumarCalatori() {
        return numarCalatori;
    }

    public String getNumarAutobuz() {
        return numarAutobuz;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul de noapte " + numarAutobuz
                + " opreste in statie.");
    }

    public void retrageLaAutobaza() {
        System.out.println("Autobuzul de noapte " + numarAutobuz
                + " se retrage la autobaza.");
    }
}