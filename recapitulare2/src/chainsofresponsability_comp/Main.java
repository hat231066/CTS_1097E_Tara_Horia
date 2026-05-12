package chainsofresponsability_comp;

//F.12. Trebuie implementat un modul care sa ii spuna calatorului ce mijloc de transport trebuie sa
//foloseasca in functie de distanta pe care o are de parcurs. Astfel, daca un calator are de parcurs o
//distanta mai mica de 3 km, este recomandat sa mearga cu Troleibuzul. Daca are o distanta cuprinsa
//intre 3 si 5 km i se recomanda sa foloseasca autobuzul, iar daca are o distanta cuprinsa intre 5 km
//si 10 km, i se recomanda sa foloseasca Tramvaiul. In cazul in care distanta este mai mare decat 10
//km i se recomanda sa foloseasca Metroul. Sa se implementeze acest modul in cadrul aplicatiei.

public class Main {
    public static void main(String[] args) {
        RecomandareTransport troleibuz = new RecomandareTroleibuz();
        RecomandareTransport autobuz = new RecomandareAutobuz();
        RecomandareTransport tramvai = new RecomandareTramvai();
        RecomandareTransport metrou = new RecomandareMetrou();

        troleibuz.setUrmatorul(autobuz);
        autobuz.setUrmatorul(tramvai);
        tramvai.setUrmatorul(metrou);

        troleibuz.recomanda(2.5);
        troleibuz.recomanda(4);
        troleibuz.recomanda(7);
        troleibuz.recomanda(12);
    }
}
