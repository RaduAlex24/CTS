package ro.ase.cts.observer.program;

import ro.ase.cts.observer.observer.ClientAbonat;
import ro.ase.cts.observer.observer.ManagerSala;
import ro.ase.cts.observer.observer.Observer;

public class Main {
    public static void main(String[] args) {
        ManagerSala managerSala = new ManagerSala("Matrix");

        Observer clientAbonat1 = new ClientAbonat("Alex");
        Observer clientAbonat2 = new ClientAbonat("Luca");
        Observer clientAbonat3 = new ClientAbonat("Adi");

        managerSala.aboneaza(clientAbonat1);
        managerSala.aboneaza(clientAbonat2);
        managerSala.aboneaza(clientAbonat3);
        managerSala.anuntaMeci("fotbal");

        managerSala.dezaboneaza(clientAbonat3);
        managerSala.anuntaMeci("volei");
    }
}
