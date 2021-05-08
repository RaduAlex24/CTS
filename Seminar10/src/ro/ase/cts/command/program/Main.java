package ro.ase.cts.command.program;

import ro.ase.cts.command.command.*;

public class Main {
    public static void main(String[] args) {
        ContBancar contBancar = new ContBancar("Alex");
        ManagerComenzi managerComenzi = new ManagerComenzi();

        managerComenzi.invocareComanda(new ComandaConstituire(contBancar,100));
        managerComenzi.invocareComanda(new ComandaDepunere(contBancar,50));
        managerComenzi.executaComanda();
        managerComenzi.invocareComanda(new ComandaRetragere(contBancar,100));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

        managerComenzi.invocareComanda(new ComandaRetragere(contBancar,300));
        managerComenzi.executaComanda();
    }
}
