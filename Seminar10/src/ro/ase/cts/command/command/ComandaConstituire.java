package ro.ase.cts.command.command;

public class ComandaConstituire extends ComandaAbstracta {
    public ComandaConstituire(ContBancar contBancar, float suma) {
        super(contBancar, suma);
    }

    @Override
    public void executa() {
        super.contBancar.constituire(super.suma);
    }
}
