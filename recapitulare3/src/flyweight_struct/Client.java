package flyweight_struct;

class Client {
    private final String nume;
    private final String telefon;
    private final String email;

    public Client(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    public void afiseazaDateClient() {
        System.out.println("Client: " + nume);
        System.out.println("Telefon: " + telefon);
        System.out.println("Email: " + email);
    }
}
