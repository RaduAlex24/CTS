package ro.ase.cts.facade.facade;

import ro.ase.cts.facade.clase.Masa;
import ro.ase.cts.facade.clase.OperatorMese;
import ro.ase.cts.facade.clase.Picolo;

public class Facade {
    public static boolean potInvitaOameniiLaMasa(Masa masa) {
        if (OperatorMese.esteLibera(masa)) {
            Picolo picolo = new Picolo("Andrei");
            if (picolo.esteDebarasata(masa) && picolo.esteAranjata(masa)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
