package ro.ase.cts.factoryMethod;

import ro.ase.cts.clase.Jucator;
import ro.ase.cts.clase.Mijlocas;

public class FactoryMijlocas implements AbstractFactory {

    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Mijlocas(nume, meciuriJucate);
    }
}
