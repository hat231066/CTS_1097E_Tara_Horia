package composite_struct;

public class Autobuz implements ComponentaFlota {
    private String producator;
    private String model;
    private int numarLocuri;

    public Autobuz(String producator, String model, int numarLocuri) {
        this.producator = producator;
        this.model = model;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "Autobuz: "
                + producator + " " + model
                + ", locuri: " + numarLocuri);
    }
}