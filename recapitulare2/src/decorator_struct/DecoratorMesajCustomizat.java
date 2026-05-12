package decorator_struct;

public class DecoratorMesajCustomizat extends DecoratorPrintareBilet {
    private String mesaj;

    public DecoratorMesajCustomizat(PrintareBilet printareBilet, String mesaj) {
        super(printareBilet);
        this.mesaj = mesaj;
    }

    @Override
    public void printeaza() {
        super.printeaza();
        printeazaMesajCustomizat();
    }

    private void printeazaMesajCustomizat() {
        System.out.println("Mesaj customizat pe bilet: " + mesaj);
    }
}
