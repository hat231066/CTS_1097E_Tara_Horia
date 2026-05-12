package composite_struct;

//B.8. Este dorita reprezentarea meniului in cadrul aplicației. Meniul conține secțiuni (startere,
//băuturi, desert, etc.) fiecare secțiune poate conține subsecțiuni (sucuri, cafea, etc) sau item-uri (,
//apa plata, apa minerala, etc). Sa se realizeze modulul care permite reprezentarea arborescenta a
//meniului restaurantului.

public class Main {
    public static void main(String[] args) {
        SectiuneMeniu meniuRestaurant = new SectiuneMeniu("Meniu Restaurant");

        SectiuneMeniu startere = new SectiuneMeniu("Startere");
        startere.adaugaElement(new ItemMeniu("Bruschete", 18.0));
        startere.adaugaElement(new ItemMeniu("Salata Caesar", 28.0));

        SectiuneMeniu bauturi = new SectiuneMeniu("Bauturi");

        SectiuneMeniu sucuri = new SectiuneMeniu("Sucuri");
        sucuri.adaugaElement(new ItemMeniu("Coca-Cola", 9.0));
        sucuri.adaugaElement(new ItemMeniu("Fanta", 9.0));

        SectiuneMeniu cafea = new SectiuneMeniu("Cafea");
        cafea.adaugaElement(new ItemMeniu("Espresso", 8.0));
        cafea.adaugaElement(new ItemMeniu("Cappuccino", 12.0));

        SectiuneMeniu apa = new SectiuneMeniu("Apa");
        apa.adaugaElement(new ItemMeniu("Apa plata", 7.0));
        apa.adaugaElement(new ItemMeniu("Apa minerala", 7.0));

        bauturi.adaugaElement(sucuri);
        bauturi.adaugaElement(cafea);
        bauturi.adaugaElement(apa);

        SectiuneMeniu desert = new SectiuneMeniu("Desert");
        desert.adaugaElement(new ItemMeniu("Papanasi", 25.0));
        desert.adaugaElement(new ItemMeniu("Lava Cake", 27.0));

        meniuRestaurant.adaugaElement(startere);
        meniuRestaurant.adaugaElement(bauturi);
        meniuRestaurant.adaugaElement(desert);

        meniuRestaurant.afiseaza("");
    }
}
