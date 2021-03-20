package ro.ase.cts.singletoneEager;

public class AsigurareMedicala {
    private int id;
    private String numeAsigurat;
    private float contributie;

    // Un singur obiect static
    // Eager initialization
    private static AsigurareMedicala asigurareMedicala = new AsigurareMedicala(1,"Alex",200.5f);

    // Constructor privat
    private AsigurareMedicala(int id, String numeAsigurat, float contributie) {
        this.id = id;
        this.numeAsigurat = numeAsigurat;
        this.contributie = contributie;
    }

    // Acest la obiectul unic
    public static AsigurareMedicala getInstance(){
        return asigurareMedicala;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeAsigurat(String numeAsigurat) {
        this.numeAsigurat = numeAsigurat;
    }

    public void setContributie(float contributie) {
        this.contributie = contributie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AsigurareMedicala{");
        sb.append("id=").append(id);
        sb.append(", numeAsigurat='").append(numeAsigurat).append('\'');
        sb.append(", contributie=").append(contributie);
        sb.append('}');
        return sb.toString();
    }
}
