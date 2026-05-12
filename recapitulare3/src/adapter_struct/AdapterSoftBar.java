package adapter_struct;

public class AdapterSoftBar implements SoftPrintareFacturi{
    private final SoftBarNou softBarNou;

    public AdapterSoftBar(SoftBarNou softBarNou) {
        this.softBarNou = softBarNou;
    }

    @Override
    public void printeazaFactura(String produs, double pret) {
        softBarNou.emiteBonBar(produs,pret);
    }
}
