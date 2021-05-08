package ro.ase.cts.chainofresponsability.program;

import ro.ase.cts.chainofresponsability.chainofresponsability.Cont;
import ro.ase.cts.chainofresponsability.chainofresponsability.ContCredit;
import ro.ase.cts.chainofresponsability.chainofresponsability.ContCurent;
import ro.ase.cts.chainofresponsability.chainofresponsability.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent(100);
        Cont contEconomii = new ContEconomii(500);
        Cont contCredit = new ContCredit(700);

        contCurent.setContSuccesor(contEconomii);
        contEconomii.setContSuccesor(contCredit);

        contCurent.realizeazaPlata(50);
        contCurent.realizeazaPlata(50);
        contCurent.realizeazaPlata(650);
    }
}
