package strategy;

//A.11. Este dorită implementarea modului de plată pentru pacienții care au fost internați în spital.
//Modul de plată îl decide persoana care plătește în momentul în care trebuie să facă plata. Plata se
//poate realiza cu cardul sau cash. Sa se implementeze modulul de plata.

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
