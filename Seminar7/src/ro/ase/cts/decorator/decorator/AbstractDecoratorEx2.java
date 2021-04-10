package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.OperatorBile;

public abstract class AbstractDecoratorEx2 implements OperatorBile {

    private OperatorBile bilet;

    public AbstractDecoratorEx2(OperatorBile bilet) {
        this.bilet = bilet;
    }

    @Override
    public void rezervaBilet() {
        bilet.rezervaBilet();
    }

    @Override
    public String getNumeEchipaGazda() {
        return bilet.getNumeEchipaGazda();
    }

    @Override
    public String getNumeEchipaOaspeti() {
        return bilet.getNumeEchipaOaspeti();
    }
}
