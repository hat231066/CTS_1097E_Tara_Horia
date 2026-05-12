package proxy_struct;

//F.8. Pentru autobuzele de noapte se doreste ca oprirea in statie sa se faca doar daca exista persoane in autobuz.
//In caz contrar autobuzul se retrage la autobaza fara sa mai realizeze opriri. Sa se implementeze modul care va permite
//oprirea in statie a autobuzelor doar daca exista calatori in autobuz.

public class Main {
    public static void main(String[] args) {
        AutobuzNoapteReal autobuzCuCalatori =
                new AutobuzNoapteReal("N101", 5);

        AutobuzNoapteReal autobuzFaraCalatori =
                new AutobuzNoapteReal("N102", 0);

        AutobuzNoapte proxyCuCalatori =
                new ProxyAutobuzNoapte(autobuzCuCalatori);

        AutobuzNoapte proxyFaraCalatori =
                new ProxyAutobuzNoapte(autobuzFaraCalatori);

        proxyCuCalatori.opresteInStatie();
        proxyFaraCalatori.opresteInStatie();
    }
}
