package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.clase.*;

public class Main {
    public static void main(String[] args) {
        // Simple factory
        SimpleFactory simpleFactory = new SimpleFactory();
        Jucator portar = simpleFactory.getJucator(TipJucator.PORTAR, "Alex", 21);
        Jucator fundas = simpleFactory.getJucator(TipJucator.FUNDAS, "Bogdan", 27);

        System.out.println(portar.toString());
        System.out.println(fundas.toString());

        // Simple factory singleton
        SimpleFactorySingleton simpleFactorySingleton = SimpleFactorySingleton.getInstance();
        Jucator atacant = simpleFactory.getJucator(TipJucator.ATACANT,"Rares",21);
        Jucator fundas2 = simpleFactory.getJucator(TipJucator.FUNDAS,"Luca",20);

        System.out.println(atacant.toString());
        System.out.println(fundas2.toString());
    }
}
