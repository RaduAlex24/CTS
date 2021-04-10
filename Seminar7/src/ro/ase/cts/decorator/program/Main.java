package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.decorator.*;

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

        // Decorator ex 6
        Bilet bilet = new Bilet("Steau", "Rapid");
        bilet.rezervaBilet();

        AbstractDecoratorEx2 meciInGhencea = new DecoratorSustinereEchipa(bilet);
        meciInGhencea.rezervaBilet();

        AbstractDecoratorEx2 meciDePaste = new DecoratorPasteFericit(bilet);
        meciDePaste.rezervaBilet();

        AbstractDecoratorEx2 meciInGhenceaDePaste = new DecoratorPasteFericit(meciInGhencea);
        meciInGhenceaDePaste.rezervaBilet();
    }
}
