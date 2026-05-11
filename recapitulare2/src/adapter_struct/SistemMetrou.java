package adapter_struct;

public class SistemMetrou implements ValidareMetrou {

    @Override
    public boolean valideazaAccesMetrou(String cod) {
        System.out.println("Validare acces direct în sistemul de metrou: " + cod);
        return cod != null && cod.startsWith("M");
    }
}