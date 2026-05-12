package facade;

import java.util.List;

//A.6. Pentru internarea unui pacient în spital trebuie verificată gravitatea stării pacientului prin
//intermediul clasei Pacient, verificarea confirmării Medicului că trebuie internat, verificarea
//disponibilității unui pat în cameră prin intermediul clasei Salon care are lista cu paturile libere si
//ocupate. Spitalul dorește ca personalul spitalului să nu fi nevoit să facă aceste verificări separat ci
//să fie dezvoltat un modul care să permită această verificarea facilă a acestor lucruri.

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic("Popescu", List.of(new Pacient(0, "Pacient0", 1),
                                                         new Pacient(1, "Pacient1", 3),
                                                         new Pacient(2, "Pacient2", 3)));
        Salon salon = new Salon(1);
        SpitalFacade facade =  new SpitalFacade(medic, salon);
        facade.internarePacient(0);
        facade.internarePacient(1);
        facade.internarePacient(2);
    }
}
