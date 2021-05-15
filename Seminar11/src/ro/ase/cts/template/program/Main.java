package ro.ase.cts.template.program;

import ro.ase.cts.template.template.Spectator;
import ro.ase.cts.template.template.SpectatorAbstract;
import ro.ase.cts.template.template.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorAbstract spectatorSimplu = new Spectator("Alex");
        SpectatorAbstract spectatorVIP = new SpectatorVIP("Adi","Loja 1");

        spectatorSimplu.intrarePeStadion();
        spectatorVIP.intrarePeStadion();
    }
}
