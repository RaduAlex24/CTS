package ro.ase.cts.program;

import ro.ase.cts.builder.Rezervare;
import ro.ase.cts.builder.RezervareBuilder;
import ro.ase.cts.builder.RezervareBuilderV2;
import ro.ase.cts.clase.Jucator;
import ro.ase.cts.factoryMethod.*;

public class Main {

    //Factory method
    public static void afisareInformaiiJucator(AbstractFactory abstractFactory, String nume, int meciuriJucate) {
        Jucator jucator = abstractFactory.getJucator(nume, meciuriJucate);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        // Factory method
        afisareInformaiiJucator(new FactoryAtacant(), "Alex", 5);
        afisareInformaiiJucator(new FactoryPortar(), "Eusebiu", 15);
        afisareInformaiiJucator(new FactoryFundas(), "Bogdan", 2);
        afisareInformaiiJucator(new FactoryMijlocas(), "Alin", 25);

        // Builder
        Rezervare rezervare = new Rezervare(1, true, false, false, false, "Jaz");
        Rezervare rezervare1 = new RezervareBuilder().setCod(2).setBauturiRacoritoare(true).setMuzicaAmbientala(true).build();
        Rezervare rezervare2 = new RezervareBuilder().setCod(3).setGenMuzical("Jaz").setScaunErgonomic(true).build();
        Rezervare rezervare3 = new RezervareBuilder(4).setGenMuzical("Jaz").setScaunErgonomic(true).build();

        System.out.println(rezervare);
        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);

        RezervareBuilder builder = new RezervareBuilder();
        Rezervare r1 = builder.setCod(1).setGenMuzical("Rock").build();
        Rezervare r2 = builder.setCod(2).setGenMuzical("Manele").build();

        System.out.println(r1.toString());
        System.out.println(r2.toString());

        // Builder v2
        RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2().setMancareInclusa(true).setBauturaRacoritoareInclusa(true);
        Rezervare rezervare4 = builder.setCod(4).build();
        Rezervare rezervare5 = builder.setCod(5).build();

        System.out.println(rezervare4.toString());
        System.out.println(rezervare5.toString());

    }
}
