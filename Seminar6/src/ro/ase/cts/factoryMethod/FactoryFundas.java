package ro.ase.cts.factoryMethod;

import ro.ase.cts.clase.Fundas;
import ro.ase.cts.clase.Jucator;

public class FactoryFundas implements AbstractFactory {

    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Fundas(nume, meciuriJucate);
    }
}
