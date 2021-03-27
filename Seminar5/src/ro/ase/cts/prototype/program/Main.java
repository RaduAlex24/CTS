package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.AbstractProrotype;
import ro.ase.cts.prototype.clase.BiletStadion;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {
    public static void main(String[] args) {
        // Client
        AbstractProrotype clientStadionPrototype = new ClientStadion("Alex",21);
        AbstractProrotype clientStadion2 = clientStadionPrototype.copiaza();

        ClientStadion clientStadion3 = (ClientStadion) clientStadionPrototype.copiaza();
        clientStadion3.setDenumire("Eusebiu");

        System.out.println(clientStadionPrototype.toString());
        System.out.println(clientStadion2.toString());
        System.out.println(clientStadion3.toString());

        // Bilet
        BiletStadion biletStadion1 = new BiletStadion(1,"Steaua","OtelulGalati","28 martie, 10:00");
        BiletStadion biletStadion2 = (BiletStadion) biletStadion1.copiaza();
        biletStadion2.setCod(2);

        System.out.println(biletStadion1.toString());
        System.out.println(biletStadion2.toString());
    }
}
