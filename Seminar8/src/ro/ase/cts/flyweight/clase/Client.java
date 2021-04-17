package ro.ase.cts.flyweight.clase;

import ro.ase.cts.flyweight.flyweight.FlyweightAbstract;

public class Client implements FlyweightAbstract {
    private String nume;
    private int telefon;
    private String email;

    public Client(String nume, int telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    @Override
    public void printeazaInformatiiRezervare(Rezervare rezervare) {
        System.out.println(this.toString() + " " + rezervare.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", telefon=").append(telefon);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
