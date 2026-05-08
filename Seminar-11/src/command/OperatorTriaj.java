package command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class OperatorTriaj {
    private Queue<Command> comenzi;
    private Stack<Command> undo;
    private Stack<Command> redo;

    public OperatorTriaj() {
        this.comenzi = new LinkedList<>(); //este lista de tip fifo
        this.undo = new Stack<>();
        this.redo = new Stack<>();
    }
    public void trimiteComanda(){
        if(!this.comenzi.isEmpty()){
            Command comanda = this.comenzi.poll();
            comanda.executa();
            undo.push(comanda);
            this.redo.clear();
        }
        else {
            System.out.println("Nu exista comenzi");
        }
    }
    public void adaugaComanda(Command comanda){
        comenzi.add(comanda);
    }
    public void anuleazaComandaUndo(){
        if(!this.undo.isEmpty()){
            Command comanda = this.undo.pop();
            comanda.executa();
            this.redo.push(comanda);
        }
        else {
            System.out.println("Nu exista comenzi");
        }
    }
    public void refacereComandaRedo(){
        if(!this.redo.isEmpty()){
            Command comanda = this.redo.pop();
            comanda.executa();
            this.undo.push(comanda);
        }
        else {
            System.out.println("Nu exista comenzi");
        }
    }
}
