package command;

//A.15. Managerul spitalului dorește sa grăbească procesul de la primiri urgente si astfel operatorul
//care primește pacienții la triaj va da comenzi de internare sau de tratare imediata pentru pacienții
//veniți si ii va așeza astfel la alte cozi separate. Comenzile sunt trimise către medici, însă operatorul
//poate primească alți pacienții mult mai rapid. Sa se implementeze modulul care permite trimiterea
//de comenzi către medici de la operatorul de primire.

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic("Alexandra");
        Command comanda1 = new ComandaInternare("Denis",medic);
        Command comanda2 = new ComandaTratareImediata("Rock",medic);
        Command comanda3 = new ComandaTratareImediata("Nicholas",medic);
        OperatorTriaj operatorTriaj  = new OperatorTriaj();
        operatorTriaj.adaugaComanda(comanda1);
        operatorTriaj.adaugaComanda(comanda2);
        operatorTriaj.adaugaComanda(comanda3);
        operatorTriaj.trimiteComanda();
        operatorTriaj.trimiteComanda();
        operatorTriaj.trimiteComanda();
        operatorTriaj.trimiteComanda();

        operatorTriaj.anuleazaComandaUndo();
        operatorTriaj.anuleazaComandaUndo();
        operatorTriaj.anuleazaComandaUndo();
        operatorTriaj.anuleazaComandaUndo();
        System.out.println("\n-----");
        operatorTriaj.refacereComandaRedo();
        operatorTriaj.refacereComandaRedo();
    }
}
