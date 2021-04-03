package ro.ase.cts.program;

import ro.ase.cts.clase.Jucator;
import ro.ase.cts.factoryMethod.*;

public class Main {

    public static void afisareInformaiiJucator(AbstractFactory abstractFactory, String nume, int meciuriJucate) {
        Jucator jucator = abstractFactory.getJucator(nume, meciuriJucate);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afisareInformaiiJucator(new FactoryAtacant(), "Alex", 5);
        afisareInformaiiJucator(new FactoryPortar(), "Eusebiu", 15);
        afisareInformaiiJucator(new FactoryFundas(), "Bogdan", 2);
        afisareInformaiiJucator(new FactoryMijlocas(), "Alin", 25);
    }
}
