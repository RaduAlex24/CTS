package ro.ase.cts.factoryMethod;

import ro.ase.cts.clase.Atacant;
import ro.ase.cts.clase.Jucator;

public class FactoryAtacant implements AbstractFactory {

    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Atacant(nume, meciuriJucate);
    }
}
