package ro.ase.cts.clasaMea;

public class Racheta {
    private String companie;
    private float greutate;
    private int nrEchipaj;

    private static Racheta racheta = null;

    private Racheta(String companie, float greutate, int nrEchipaj) {
        this.companie = companie;
        this.greutate = greutate;
        this.nrEchipaj = nrEchipaj;
    }

    public static synchronized Racheta getInstance(String companie, float greutate, int nrEchipaj) {
        if (racheta == null) {
            racheta = new Racheta(companie, greutate, nrEchipaj);
        }
        return racheta;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public void setNrEchipaj(int nrEchipaj) {
        this.nrEchipaj = nrEchipaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Racheta{");
        sb.append("companie='").append(companie).append('\'');
        sb.append(", greutate=").append(greutate);
        sb.append(", nrEchipaj=").append(nrEchipaj);
        sb.append('}');
        return sb.toString();
    }
}
