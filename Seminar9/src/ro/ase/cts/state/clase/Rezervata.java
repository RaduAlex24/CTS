package ro.ase.cts.state.clase;

import ro.ase.cts.state.state.StateMasa;

public class Rezervata implements StateMasa {

    @Override
    public void modificaStare(Masa masa) {
        if (masa.getStateMasa() instanceof Liber) {
            masa.setStateMasa(this);
        }
    }
}
