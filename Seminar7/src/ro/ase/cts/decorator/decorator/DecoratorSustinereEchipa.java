package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.OperatorBile;

public class DecoratorSustinereEchipa extends AbstractDecoratorEx2 {

    public DecoratorSustinereEchipa(OperatorBile bilet) {
        super(bilet);
    }

    @Override
    public void rezervaBilet() {
        super.rezervaBilet();
        System.out.println("Sustinem echipa" + super.getNumeEchipaGazda());
    }
}
