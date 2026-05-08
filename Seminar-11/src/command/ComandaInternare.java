package command;

public class ComandaInternare extends Command{

    public ComandaInternare(String numePacient, Medic medic) {
        super(numePacient, medic);
    }

    @Override
    public void executa() {
        super.getMedic().internarePacient();
    }

    @Override
    public void undo() {
        super.getMedic().anuleazaInternare();
    }

    @Override
    public void redo() {
        super.getMedic().refaceInternare();
    }
}
