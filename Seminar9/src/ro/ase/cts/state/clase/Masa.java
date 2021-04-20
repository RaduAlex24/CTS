package ro.ase.cts.state.clase;

import ro.ase.cts.state.state.StateMasa;

public class Masa {
    private int codMasa;
    private StateMasa stateMasa;

    public Masa(int codMasa) {
        this.codMasa = codMasa;
        stateMasa = new Liber();
    }

    public void setCodMasa(int codMasa) {
        this.codMasa = codMasa;
    }

    void setStateMasa(StateMasa stateMasa) {
        this.stateMasa = stateMasa;
    }

    public int getCodMasa() {
        return codMasa;
    }

    public StateMasa getStateMasa() {
        return stateMasa;
    }

    public void rezervaMasa(String nume) {
        if (this.stateMasa instanceof Liber) {
            System.out.println(nume + " a rezervat masa");
            this.setStateMasa(new Rezervata());
        } else {
            System.out.println("Masa nu este libera");
        }
    }

    public void ocupaMasa(String nume) {
        if (!(this.stateMasa instanceof Ocupata)) {
            System.out.println(nume + " a ocupat masa");
            this.setStateMasa(new Ocupata());
        } else {
            System.out.println("Masa nu pote fi ocupata");
        }
    }

    public void elibereazaMasa(String nume) {
        if (!(this.stateMasa instanceof Liber)) {
            System.out.println(nume + " a eliberat masa");
            this.setStateMasa(new Liber());
        } else {
            System.out.println("Masaeste deja libera");
        }
    }

}
