package adapter_struct;

//F.4. Compania de transport in comun preia si infrastructura de Metrou a orasului si doreste ca
//biletele sau abonamentele achizitionate de catre clienti pentru transportul terestru sa poata fi
//folosite si pentru transportul subteran. Sisteme software ale celor doua moduri de transport sunt
//diferite si se doreste implementarea unui modul care sa permita utilizarea celor doua sisteme fara
//a le modifica. Modulul implementat trebuie sa se ocupe de validarea biletelor sau si a
//abonamentelor.

public class Main {
    public static void main(String[] args) {
        ValidareTransportTerestru sistemTerestru = new SistemTransportTerestru();

        ValidareMetrou adaptorMetrou = new AdapterTransport(sistemTerestru);

        String biletTerestru = "BT123";
        String abonamentTerestru = "AT456";
        String codInvalid = "XYZ999";

        System.out.println("Bilet terestru la metrou: "
                + adaptorMetrou.valideazaAccesMetrou(biletTerestru));

        System.out.println("Abonament terestru la metrou: "
                + adaptorMetrou.valideazaAccesMetrou(abonamentTerestru));

        System.out.println("Cod invalid la metrou: "
                + adaptorMetrou.valideazaAccesMetrou(codInvalid));
    }
}
