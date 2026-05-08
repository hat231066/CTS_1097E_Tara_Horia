package templatemethod;

public class MainTemplateMethod {
    public static void main(String[] args) {
        InternareTemplate internareStandard = new InternareStandard();
        internareStandard.interneazaPacient("Andrei");

        InternareTemplate internareUrgenta = new InternareUrgenta();
        internareUrgenta.interneazaPacient("Maria");
    }
}
