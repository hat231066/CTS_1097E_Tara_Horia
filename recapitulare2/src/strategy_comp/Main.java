package strategy_comp;

//F.10. Un calator are posibilitatea sa plateasca cu cardul de calatorii, cardul bancar sau prin SMS.
//Trebuie implementat modulul dintr-un validator calatorie care sa permita plata calatoriei printruna
//din cele trei metode. Calatorul va decide modul de plata atunci cand se urca in mijlocul de
//transport.

public class Main {
    public static void main(String[] args) {
        ValidatorCalatorie validator = new ValidatorCalatorie();

        validator.setMetodaPlata(new PlataCardCalatorii());
        validator.valideazaCalatorie(3.0);

        System.out.println();

        validator.setMetodaPlata(new PlataCardBancar());
        validator.valideazaCalatorie(3.0);

        System.out.println();

        validator.setMetodaPlata(new PlataSMS());
        validator.valideazaCalatorie(3.0);
    }
}
