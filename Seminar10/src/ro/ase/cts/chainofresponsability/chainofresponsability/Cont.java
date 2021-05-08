package ro.ase.cts.chainofresponsability.chainofresponsability;

public abstract class Cont {
    private float sold;
    private Cont contSuccesor;

    public Cont(float sold) {
        this.sold = sold;
        contSuccesor = null;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public Cont getContSuccesor() {
        return contSuccesor;
    }

    public void setContSuccesor(Cont contSuccesor) {
        this.contSuccesor = contSuccesor;
    }

    public abstract void realizeazaPlata(float suma);
}
