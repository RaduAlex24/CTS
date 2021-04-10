package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.decorator.AbstractDecorator;
import ro.ase.cts.decorator.decorator.DecoratorContactless;
import ro.ase.cts.decorator.decorator.DecoratorContactlessTelefon;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Alex", "123456789");

        card.platesteOnline();
        card.platestePOS();

        // Decorator simplu
        AbstractDecorator abstractDecorator = new DecoratorContactless(card);
        abstractDecorator.platesteContactless();
        card.platesteOnline();
        card.platestePOS();

        // Decorator telefon
        AbstractDecorator abstractDecorator1 = new DecoratorContactlessTelefon(card);
        abstractDecorator1.platesteContactless();

        AbstractDecorator abstractDecorator2 = new DecoratorContactless(abstractDecorator);
    }
}
