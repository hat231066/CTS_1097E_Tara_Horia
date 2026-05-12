package composite_struct;

public class ItemMeniu extends ElementMeniu {
    private final double pret;

    public ItemMeniu(String denumire, double pret) {
        super(denumire);
        this.pret = pret;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "- " + denumire + " : " + pret + " lei");
    }
}
