package proxy_struct;

//B.9. Managerul restaurantului dorește ca atunci când cineva dorește să realizez e o rezervare sa fie
//permisă doar dacă aceasta este realizată pentru minim 4 persoane. În sens contrar rezervarea nu
//este realizata, iar persoanele sunt rugate să se prezinte la restaurant deoarece sunt suficiente locuri
//pentru mesele de doua persoane. Sa se realizeze un nivel intermediar care sa condiționeze
//realizarea rezervărilor de numărul de persoane.

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new ProxyRezervare();

        rezervare.realizeazaRezervare("Popescu Ana", 2);
        System.out.println();

        rezervare.realizeazaRezervare("Ionescu Mihai", 4);
        System.out.println();

        rezervare.realizeazaRezervare("Dumitrescu Elena", 6);
    }
}
