package ro.ase.cts.strategy.clase;

import ro.ase.cts.strategy.strategy.IModPlata;

public class PlataCard implements IModPlata {
    @Override
    public void plateste(int suma) {
        System.out.println("A fost platita cu cardul suma de " + suma);
    }
}
