package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.CardAbstract;

public class DecoratorContactless extends AbstractDecorator {

    public DecoratorContactless(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCardAbstract()).getTitular() + " a platit contactless. ");
    }
}
