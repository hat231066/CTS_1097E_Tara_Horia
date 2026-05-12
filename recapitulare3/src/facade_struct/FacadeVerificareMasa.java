package facade_struct;

public class FacadeVerificareMasa {

    private final VerificareMasaLibera verificareMasaLibera;
    private final VerificareMasaDebarasata verificareMasaDebarasata;
    private final VerificareServetele verificareServetele;

    public FacadeVerificareMasa() {
        this.verificareMasaLibera = new VerificareMasaLibera();
        this.verificareMasaDebarasata = new VerificareMasaDebarasata();
        this.verificareServetele = new VerificareServetele();
    }

    public boolean poateFiOcupata(Masa masa) {
        if (!verificareMasaLibera.esteMasaLibera(masa)) {
            System.out.println("Masa " + masa.getNumarMasa() + " nu este libera.");
            return false;
        }

        if (!verificareMasaDebarasata.esteMasaDebarasata(masa)) {
            System.out.println("Masa " + masa.getNumarMasa() + " nu este debarasata.");
            return false;
        }

        if (!verificareServetele.areServeteleNoi(masa)) {
            System.out.println("Masa " + masa.getNumarMasa() + " nu are servetele noi.");
            return false;
        }

        System.out.println("Masa " + masa.getNumarMasa() + " poate fi ocupata.");
        return true;
    }
}
