package command;

public abstract class Command {
    private String numePacient;
    private Medic medic;

    public Command(String numePacient, Medic medic) {
        this.numePacient = numePacient;
        this.medic = medic;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public Medic getMedic() {
        return medic;
    }
    public abstract void executa();
    public abstract void undo();
    public abstract void redo();
}
