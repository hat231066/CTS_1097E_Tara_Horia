package command_comp;

//F.16. In cadrul unei autobaze este ceruta implementarea unui modul software prin care operatorul
//sa poata solicita plecarile pentru fiecare autobuz de la capat de linie si pe ce linie va merge
//(numarul liniei). Comenzile de plecare pe o anumita linie vor fi salvate intr-o colectie, iar in
//momentul in care autobuzul este disponibil acesta va prelua comanda de plecare in traseu.
//Operatorul are posibilitatea sa stabileasca plecarile de la prima ora a zilei, astfel nu mai este
//necesara interventia acestuia pe timpul zilei.

public class Main {
    public static void main(String[] args) {
        OperatorAutobaza operator = new OperatorAutobaza();

        Autobuz autobuz1 = new Autobuz("B-101");
        Autobuz autobuz2 = new Autobuz("B-102");
        Autobuz autobuz3 = new Autobuz("B-103");

        Comanda comanda1 = new ComandaPlecare(autobuz1, 10);
        Comanda comanda2 = new ComandaPlecare(autobuz2, 25);
        Comanda comanda3 = new ComandaPlecare(autobuz3, 41);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(comanda3);

        System.out.println();

        System.out.println("Autobuzele devin disponibile si preiau comenzile:");

        operator.executaUrmatoareaComanda();
        operator.executaUrmatoareaComanda();
        operator.executaUrmatoareaComanda();

        System.out.println();

        operator.executaUrmatoareaComanda();
    }
}
