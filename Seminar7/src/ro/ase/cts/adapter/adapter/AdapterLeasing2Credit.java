package ro.ase.cts.adapter.adapter;

import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class AdapterLeasing2Credit implements CreditAbstract {

    private Leasing leasing;

    public AdapterLeasing2Credit(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void oferaCredit() {
        leasing.creazaLeasing();
    }
}
