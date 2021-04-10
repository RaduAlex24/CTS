package ro.ase.cts.adapter.adapter;

import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class AdapterLeasing2CreditClasa extends Leasing implements CreditAbstract {

    public AdapterLeasing2CreditClasa(String numeClient, float suma) {
        super(numeClient, suma);
    }

    @Override
    public void oferaCredit() {
        super.creazaLeasing();
    }
}
