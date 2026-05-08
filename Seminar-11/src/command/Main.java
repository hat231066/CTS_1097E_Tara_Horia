package command;

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
