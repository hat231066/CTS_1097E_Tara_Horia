package state;

public class MainState {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Andrei");
        pacient.interneaza();

        pacient.treceSubObservatie();
        pacient.externeaza();

        pacient.externeaza();
        pacient.treceSubObservatie();

        pacient.interneaza();
        pacient.treceSubObservatie();
        pacient.treceSubObservatie();
        pacient.interneaza();
    }
}
