package ro.ase.cts.flyweight.clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private int oraRezerevare;

    public Rezervare(int nrMasa, int nrPersoane, int oraRezerevare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezerevare = oraRezerevare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezerevare=").append(oraRezerevare);
        sb.append('}');
        return sb.toString();
    }
}
