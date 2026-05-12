package facade_struct;

public class ModulControlUsiFacade {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public ModulControlUsiFacade() {
        this.usaFata = new Usa("din fata");
        this.usaMijloc = new Usa("de la mijloc");
        this.usaSpate = new Usa("din spate");
    }

    public void puneToateUsileInModLiber() {
        System.out.println("Se pun toate usile in modul liber:");
        usaFata.puneInModLiber();
        usaMijloc.puneInModLiber();
        usaSpate.puneInModLiber();
    }

    public void deschideFortatToateUsile() {
        System.out.println("Se deschid fortat toate usile:");
        usaFata.deschideFortat();
        usaMijloc.deschideFortat();
        usaSpate.deschideFortat();
    }
}
