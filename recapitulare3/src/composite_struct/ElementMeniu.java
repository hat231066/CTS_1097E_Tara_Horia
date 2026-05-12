package composite_struct;

public abstract class ElementMeniu {
    protected String denumire;

    public ElementMeniu(String denumire) {
        this.denumire = denumire;
    }

    public abstract void afiseaza(String indentare);

    public void adaugaElement(ElementMeniu element) {
        throw new UnsupportedOperationException("Nu se poate adauga element.");
    }

    public void stergeElement(ElementMeniu element) {
        throw new UnsupportedOperationException("Nu se poate sterge element.");
    }
}
