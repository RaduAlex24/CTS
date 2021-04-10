package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.adapter.AdapterLeasing2Credit;
import ro.ase.cts.adapter.adapter.AdapterLeasing2CreditClasa;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {

    public static void creeazaCredit(CreditAbstract creditAbstract) {
        creditAbstract.oferaCredit();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Alex", 100);

        // Adapter obiect
        AdapterLeasing2Credit adapterLeasing2Credit = new AdapterLeasing2Credit(leasing);
        creeazaCredit(adapterLeasing2Credit);

        // Adapter clase
        AdapterLeasing2CreditClasa adapterLeasing2CreditClasa = new AdapterLeasing2CreditClasa("Eusebiu",42000);
        creeazaCredit(adapterLeasing2CreditClasa);
    }
}
