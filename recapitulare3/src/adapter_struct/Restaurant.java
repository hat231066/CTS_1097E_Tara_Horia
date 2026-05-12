package adapter_struct;

public class Restaurant {
    public void proceseazaFactura(SoftPrintareFacturi soft,String produs,double pret){
        soft.printeazaFactura(produs,pret);
    }
}
