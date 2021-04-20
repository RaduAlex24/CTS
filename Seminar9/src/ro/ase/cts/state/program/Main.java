package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Liber;
import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.Ocupata;
import ro.ase.cts.state.clase.Rezervata;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        masa.rezervaMasa("Danil");
        masa.rezervaMasa("Alex");

        //masa.setStateMasa(new Liber());
        masa.rezervaMasa("Alex");

        masa.elibereazaMasa("Adi");
        masa.ocupaMasa("Adi");


        Masa masa2 = new Masa(2);
        Rezervata rezervata = new Rezervata();
        Ocupata ocupata = new Ocupata();
        Liber liber = new Liber();

        liber.modificaStare(masa);
        rezervata.modificaStare(masa);
        ocupata.modificaStare(masa);
    }
}
