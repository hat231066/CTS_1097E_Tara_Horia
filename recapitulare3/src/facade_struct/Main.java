package facade_struct;

//B.6. În momentul în care un client vine la restaurant pentru o masă, recepționistul trebuie să
//verifice dacă are masă liberă, apoi să verifice dacă acea masă a fost debarasată de la plecarea
//ultimului client, de asemenea trebuie să verifice dacă au fost puse șervețele noi pe masă. Managerul
//restaurantului dorește realizarea unui modul care să simplifice munca recepționistului și să nu mai
//fie nevoit să verifice în toate locurile ci doar într-un singur loc.

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1, true, true, true);
        Masa masa2 = new Masa(2, true, false, true);
        Masa masa3 = new Masa(3, false, true, true);
        Masa masa4 = new Masa(4, true, true, false);

        FacadeVerificareMasa facade = new FacadeVerificareMasa();

        Receptionist receptionist = new Receptionist(facade);

        receptionist.verificaMasaPentruClient(masa1);
        receptionist.verificaMasaPentruClient(masa2);
        receptionist.verificaMasaPentruClient(masa3);
        receptionist.verificaMasaPentruClient(masa4);
    }
}
