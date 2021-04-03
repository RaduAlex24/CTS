package ro.ase.cts.factoryMethod;

import ro.ase.cts.clase.Jucator;

public interface AbstractFactory {
    Jucator getJucator(String nume, int meciuriJucate);
}
