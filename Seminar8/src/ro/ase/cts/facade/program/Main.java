package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Masa;
import ro.ase.cts.facade.clase.OperatorMese;
import ro.ase.cts.facade.clase.Picolo;
import ro.ase.cts.facade.facade.Facade;

public class Main {
    public static void main(String[] args) {

        // Fara facade
        Masa masa = new Masa(12, 4);

        if (OperatorMese.esteLibera(masa)) {
            Picolo picolo = new Picolo("Andrei");
            if (picolo.esteDebarasata(masa) && picolo.esteAranjata(masa)) {
                System.out.println("Poftiti la masa");
            } else {
                System.out.println("Mai asteptati putin");
            }
        } else {
            System.out.println("Mai asteptati putin");
        }


        // Cu facade
        Masa masa1 = new Masa(14, 6);
        if (Facade.potInvitaOameniiLaMasa(masa1)) {
            System.out.println("Poftiti la masa");
        } else {
            System.out.println("Mai asteptati putin");
        }


    }
}
