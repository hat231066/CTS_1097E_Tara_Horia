package decorator_struct;

public abstract class DecoratorPrintareBilet implements PrintareBilet {
    protected PrintareBilet printareBilet;

    public DecoratorPrintareBilet(PrintareBilet printareBilet) {
        this.printareBilet = printareBilet;
    }

    @Override
    public void printeaza() {
        printareBilet.printeaza();
    }
}
