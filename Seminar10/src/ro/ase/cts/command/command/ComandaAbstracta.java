package ro.ase.cts.command.command;

public abstract class ComandaAbstracta {
    // Un catalog cu absolut tot

    // executant
    protected ContBancar contBancar;
    protected float suma;

    public ComandaAbstracta(ContBancar contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    public abstract void executa();

}
