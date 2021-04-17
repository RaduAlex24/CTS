package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.Rezervare;
import ro.ase.cts.flyweight.flyweight.FabricaClienti;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(100,3,14);
        Rezervare rezervare2 = new Rezervare(102,2,20);
        Rezervare rezervare3 = new Rezervare(200,10,22);

        FabricaClienti fabricaClienti = new FabricaClienti();
        Client client1 = fabricaClienti.getClient("alex@yahoo.com");

        client1.printeazaInformatiiRezervare(rezervare1);
        fabricaClienti.getClient("adi@yahoo.com").printeazaInformatiiRezervare(rezervare2);
        fabricaClienti.getClient("adi@yahoo.com").printeazaInformatiiRezervare(rezervare3);
    }
}
