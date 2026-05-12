package facade_struct;

public class Masa {
    private final int numarMasa;
    private final boolean libera;
    private final boolean debarasata;
    private final boolean serveteleNoi;

    public Masa(int numarMasa, boolean libera, boolean debarasata, boolean serveteleNoi) {
        this.numarMasa = numarMasa;
        this.libera = libera;
        this.debarasata = debarasata;
        this.serveteleNoi = serveteleNoi;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public boolean esteLibera() {
        return libera;
    }

    public boolean esteDebarasata() {
        return debarasata;
    }

    public boolean areServeteleNoi() {
        return serveteleNoi;
    }
}