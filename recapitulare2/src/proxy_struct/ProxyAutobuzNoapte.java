package proxy_struct;

public class ProxyAutobuzNoapte implements AutobuzNoapte {
    private AutobuzNoapteReal autobuz;

    public ProxyAutobuzNoapte(AutobuzNoapteReal autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if (autobuz.getNumarCalatori() > 0) {
            autobuz.opresteInStatie();
        } else {
            autobuz.retrageLaAutobaza();
        }
    }
}
