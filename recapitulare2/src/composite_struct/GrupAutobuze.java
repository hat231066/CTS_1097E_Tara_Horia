package composite_struct;

import java.util.ArrayList;
import java.util.List;

public class GrupAutobuze implements ComponentaFlota {
    private String denumireGrup;
    private List<ComponentaFlota> componente;

    public GrupAutobuze(String denumireGrup) {
        this.denumireGrup = denumireGrup;
        this.componente = new ArrayList<>();
    }

    public void adaugaComponenta(ComponentaFlota componenta) {
        componente.add(componenta);
    }

    public void stergeComponenta(ComponentaFlota componenta) {
        componente.remove(componenta);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + denumireGrup);

        for (ComponentaFlota componenta : componente) {
            componenta.afiseaza(indentare + "    ");
        }
    }
}
