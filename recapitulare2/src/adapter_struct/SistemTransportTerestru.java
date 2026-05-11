package adapter_struct;

public class SistemTransportTerestru implements ValidareTransportTerestru {

    @Override
    public boolean valideazaBilet(String codBilet) {
        System.out.println("Validare bilet în sistemul de transport terestru: " + codBilet);
        return codBilet != null && codBilet.startsWith("BT");
    }

    @Override
    public boolean valideazaAbonament(String codAbonament) {
        System.out.println("Validare abonament în sistemul de transport terestru: " + codAbonament);
        return codAbonament != null && codAbonament.startsWith("AT");
    }
}
