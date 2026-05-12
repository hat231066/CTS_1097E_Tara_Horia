package decorator_struct;

//F.7. Compania doreste ca modulul de printare al biletelor sa permita cu ocazia anumitor zile
//nationale sa printeze pe bilet un mesaj de "La multi ani". Se doreste implementarea acestui modul
//care sa adauge functionalitatea de printare mesaj customizat. Exista posibilitatea ca aceasta
//functionalitate sa nu fie folosita, si din acest motiv se doreste sa fie optionala, fara modificarea
//codului existent.

public class Main {
    public static void main(String[] args) {
        PrintareBilet biletSimplu = new PrintareBiletSimplu();

        System.out.println("Bilet fara mesaj customizat:");
        biletSimplu.printeaza();

        System.out.println();

        PrintareBilet biletCuMesaj = new DecoratorMesajCustomizat(biletSimplu, "La multi ani!");

        System.out.println("Bilet cu mesaj customizat:");
        biletCuMesaj.printeaza();
    }
}
