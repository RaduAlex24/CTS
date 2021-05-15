package ro.ase.cts.template.template;

public abstract class SpectatorAbstract {
    public abstract void asezareCoada();

    public abstract void prezintaBilet();

    public abstract void realizeazaControlCorporal();

    public abstract void ocupaLoc();

    public final void intrarePeStadion() {
        asezareCoada();
        prezintaBilet();
        realizeazaControlCorporal();
        ocupaLoc();
    }

}
