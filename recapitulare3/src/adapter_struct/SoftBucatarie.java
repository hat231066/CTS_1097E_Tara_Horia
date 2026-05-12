package adapter_struct;

public class SoftBucatarie implements SoftPrintareFacturi{
    @Override
    public void printeazaFactura(String produs, double pret) {
        System.out.println("Factura bucatarie:");
        System.out.println("Produs: " + produs);
        System.out.println("Pret: " + pret + " lei");
        System.out.println("----------------------");
    }
}
