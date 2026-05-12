package composite_struct;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu extends ElementMeniu {
    private final List<ElementMeniu> elemente;

    public SectiuneMeniu(String denumire) {
        super(denumire);
        this.elemente = new ArrayList<>();
    }

    @Override
    public void adaugaElement(ElementMeniu element) {
        elemente.add(element);
    }

    @Override
    public void stergeElement(ElementMeniu element) {
        elemente.remove(element);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "+ " + denumire);

        for (ElementMeniu element : elemente) {
            element.afiseaza(indentare + "   ");
        }
    }
}
