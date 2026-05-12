package facade_struct;

public class Receptionist {

    private final FacadeVerificareMasa facadeVerificareMasa;

    public Receptionist(FacadeVerificareMasa facadeVerificareMasa) {
        this.facadeVerificareMasa = facadeVerificareMasa;
    }

    public void verificaMasaPentruClient(Masa masa) {
        facadeVerificareMasa.poateFiOcupata(masa);
    }
}
