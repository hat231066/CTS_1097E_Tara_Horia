package composite;

import java.util.ArrayList;
import java.util.List;

public class Departament  extends StructuraSpital{
    private List<StructuraSpital> structuriSpital;


    public Departament(String nume) {
        super(nume);
        this.structuriSpital = new ArrayList<>();
    }

    public  StructuraSpital getStructuraSpital(int index){
       return this.structuriSpital.get(index);
    }


    public void adaugaStructura(StructuraSpital structuraSpital){
        this.structuriSpital.add(structuraSpital);
    }

    public void stergeStructura(StructuraSpital structuraSpital){
        this.structuriSpital.remove(structuraSpital);
    }

    @Override
    public void afiseazaIerarhieSpital(String identare) {
        System.out.println(identare  + super.getNume());
        for(StructuraSpital structuraSpital :this. structuriSpital){
           structuraSpital.afiseazaIerarhieSpital(identare + "  ");
        }
    }
}
