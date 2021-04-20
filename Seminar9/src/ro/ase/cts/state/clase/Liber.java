package ro.ase.cts.state.clase;

import ro.ase.cts.state.state.StateMasa;

public class Liber implements StateMasa {

    @Override
    public void modificaStare(Masa masa) {
        if (!(masa.getStateMasa() instanceof Liber)) {
            masa.setStateMasa(this);
        }
    }
}
