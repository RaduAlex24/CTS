package ro.ase.cts.memento.program;

import ro.ase.cts.memento.memento.ManagerMeci;
import ro.ase.cts.memento.memento.MeciJucat;
import ro.ase.cts.memento.memento.Memento;

public class Main {
    public static void main(String[] args) {
        MeciJucat meciJucat = new MeciJucat(100, "FCSB", "Dinamo", 20, 100, 20);

        Memento memento1 = meciJucat.creazaMemento();
        ManagerMeci managerMeci = new ManagerMeci();
        managerMeci.adaugaMemento(memento1);

        meciJucat.setNrSpectatori(200);
        meciJucat.setNumeEchipaGazda("Universitatea Craiova");
        meciJucat.setNumeEchipaOaspete("CFR Cluj");

        managerMeci.adaugaMemento(meciJucat.creazaMemento());

        System.out.println(meciJucat);
        meciJucat.setMemento(managerMeci.getMemento(0));
        System.out.println(meciJucat);
    }
}
