package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.CardAbstract;

public class DecoratorContactlessTelefon extends AbstractDecorator{
    public DecoratorContactlessTelefon(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCardAbstract()).getTitular() + " a platit prin telefon");
    }
}
