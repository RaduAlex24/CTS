package ro.ase.cts.template.template;

public class Spectator extends SpectatorAbstract {
    private String nume;

    public Spectator(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareCoada() {
        System.out.println(nume + " s-a asezat la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(nume + " a prezentat biletul");
    }

    @Override
    public void realizeazaControlCorporal() {
        System.out.println(nume + " a fost controlat corporal");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(nume + " si-a ocupat locul");
    }
}
