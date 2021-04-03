package ro.ase.cts.factoryMethod;

import ro.ase.cts.clase.Jucator;
import ro.ase.cts.clase.Portar;

public class FactoryPortar implements AbstractFactory {

    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Portar(nume, meciuriJucate);
    }
}
