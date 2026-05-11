package adapter_struct;

public class AdapterTransport implements ValidareMetrou {

    private ValidareTransportTerestru sistemTransportTerestru;

    public AdapterTransport(ValidareTransportTerestru sistemTransportTerestru) {
        this.sistemTransportTerestru = sistemTransportTerestru;
    }

    @Override
    public boolean valideazaAccesMetrou(String cod) {
        if (cod == null || cod.length() < 2) {
            return false;
        }

        if (cod.startsWith("BT")) {
            return sistemTransportTerestru.valideazaBilet(cod);
        }

        if (cod.startsWith("AT")) {
            return sistemTransportTerestru.valideazaAbonament(cod);
        }

        return false;
    }
}