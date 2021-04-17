package ro.ase.cts.composite.program;

import ro.ase.cts.composite.composite.Sectiune;
import ro.ase.cts.composite.composite.Item;

public class Main {
    public static void main(String[] args) {

        Sectiune meniu = new Sectiune("Meniu");
        Sectiune bauturi = new Sectiune("bauturi");
        Sectiune aperitive = new Sectiune("aperitive");

        Item cola = new Item("Cola");
        Item pepsi = new Item("Pepsi");
        Item bruschete = new Item("Bruschete");

        bauturi.adaugaComponenta(cola);
        bauturi.adaugaComponenta(pepsi);
        aperitive.adaugaComponenta(bruschete);
        //aperitive.afisareDescriere();

        meniu.adaugaComponenta(bauturi);
        meniu.adaugaComponenta(aperitive);
        meniu.afisareDescriere();
    }
}
