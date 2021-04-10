package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.OperatorBile;

public class DecoratorPasteFericit extends AbstractDecoratorEx2 {
    public DecoratorPasteFericit(OperatorBile bilet) {
        super(bilet);
    }

    @Override
    public void rezervaBilet() {
        super.rezervaBilet();
        System.out.println("Paste fericit!");
    }
}
