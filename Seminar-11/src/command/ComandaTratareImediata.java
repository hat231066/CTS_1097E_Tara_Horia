package command;

public class ComandaTratareImediata extends Command{

    public ComandaTratareImediata(String numePacient, Medic medic) {
        super(numePacient, medic);
    }

    @Override
    public void executa() {
        super.getMedic().internareImediata();
    }

    @Override
    public void undo() {
        super.getMedic().anuleazaTratareImediata();
    }

    @Override
    public void redo() {
        super.getMedic().refaceInternareImediata();
    }
}
