package strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Andrei");
        pacient.plateste(10.0);

        pacient.setModPlata(new PlataCard());
        pacient.plateste(20.0);

        pacient.setModPlata(new PlataCash());
        pacient.plateste(30.0);
    }
}
