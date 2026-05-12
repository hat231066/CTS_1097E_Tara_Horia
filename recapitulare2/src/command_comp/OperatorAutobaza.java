package command_comp;

import java.util.LinkedList;
import java.util.Queue;

public class OperatorAutobaza {
    private Queue<Comanda> comenziPlecare = new LinkedList<>();

    public void adaugaComanda(Comanda comanda) {
        comenziPlecare.add(comanda);
        System.out.println("Comanda de plecare a fost salvata.");
    }

    public void executaUrmatoareaComanda() {
        if (comenziPlecare.isEmpty()) {
            System.out.println("Nu exista comenzi de plecare.");
            return;
        }

        Comanda comanda = comenziPlecare.poll();
        comanda.executa();
    }

    public void executaToateComenzile() {
        while (!comenziPlecare.isEmpty()) {
            executaUrmatoareaComanda();
        }
    }
}
