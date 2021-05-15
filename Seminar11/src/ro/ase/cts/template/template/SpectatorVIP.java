package ro.ase.cts.template.template;

public class SpectatorVIP extends SpectatorAbstract {
    private String nume;
    private String loja;

    public SpectatorVIP(String nume, String loja) {
        this.nume = nume;
        this.loja = loja;
    }

    @Override
    public void asezareCoada() {
        System.out.println(nume + " intra direct pe intrarea de VIP");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(nume + " prezinta biletul VIP");
    }

    @Override
    public void realizeazaControlCorporal() {
        System.out.println(nume + " este controlat corporal");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(nume + " ocupa loc in loja " + loja);
    }
}
