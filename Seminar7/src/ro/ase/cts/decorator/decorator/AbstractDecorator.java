package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.CardAbstract;

public abstract class AbstractDecorator implements CardAbstract {
    private CardAbstract cardAbstract;

    public AbstractDecorator(CardAbstract cardAbstract) {
        this.cardAbstract = cardAbstract;
    }


    @Override
    public void platesteOnline() {
        cardAbstract.platesteOnline();
    }

    @Override
    public void platestePOS() {
        cardAbstract.platestePOS();
    }

    public abstract void platesteContactless();

    public CardAbstract getCardAbstract() {
        return cardAbstract;
    }
}
