package chainofresponsability;

public class Client {
    private String nume;
    private String numar_telefon;
    private String email;

    public Client(String nume, String numar_telefon, String email) {
        this.nume = nume;
        this.numar_telefon = numar_telefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getNumar_telefon() {
        return numar_telefon;
    }

    public String getEmail() {
        return email;
    }
}
