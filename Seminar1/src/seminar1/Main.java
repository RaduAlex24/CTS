package seminar1;

import clase.Lion;
import clase.WildCat;
import clase.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Lion lion1 = new Lion("leu1");
        Lion lion2 = new Lion("leu2");

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.feedAllAnimals();

        WildCat wildCat1 = new WildCat("wildCat1","mancare1");
        WildCat wildCat2 = new WildCat("wildCat2");
        WildCat wildCat3 = new WildCat("wildCat3");
        WildCat wildCat4 = new WildCat("wildCat4");

        zoo.addAnimal(wildCat1);
        zoo.addAnimal(wildCat2);
        zoo.addAnimal(wildCat3);
        zoo.addAnimal(wildCat4);

        zoo.feedAllAnimals();
    }
}
