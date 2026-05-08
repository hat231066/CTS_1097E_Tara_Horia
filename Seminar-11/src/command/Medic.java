package command;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void internarePacient(){
        System.out.println("Internare pacient");
    }
    public void internareImediata(){
        System.out.println("Internare imediata");
    }
    public void anuleazaInternare()
    {
        System.out.println("A fost anulata internarea");

    }
    public void refaceInternare(){
        System.out.println("Se reface internarea");
    }
    public void anuleazaTratareImediata(){
        System.out.println("a fost anulata tratarea imediata");
    }
    public void refaceInternareImediata(){
        System.out.println("Se reface tratarea imediata");
    }
}
