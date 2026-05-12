package decorator_struct;

public class PrintareBiletSimplu implements PrintareBilet {

    @Override
    public void printeaza() {
        System.out.println("Se printeaza biletul de calatorie.");
    }
}
