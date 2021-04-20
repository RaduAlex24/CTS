package ro.ase.cts.state.clase;

import ro.ase.cts.state.state.StateMasa;

public class Ocupata implements StateMasa {

    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStateMasa() instanceof Rezervata){
            masa.setStateMasa(this);
        }
    }
}
