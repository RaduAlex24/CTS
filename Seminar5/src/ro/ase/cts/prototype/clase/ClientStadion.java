package ro.ase.cts.prototype.clase;

public class ClientStadion implements AbstractProrotype{
    private String denumire;
    private int varsta;

    private ClientStadion() {
    }

    public ClientStadion(String denumire, int varsta) {
        // Validari
        this.denumire = denumire;
        // Daca pers e majora
        this.varsta = varsta;
    }

    public void setDenumire(String denumire) {
        // Validari
        this.denumire = denumire;
    }

    public void setVarsta(int varsta) {
        // Validari
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientStadion{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractProrotype copiaza() {
        ClientStadion clona = new ClientStadion();
        clona.denumire = this.denumire;
        clona.varsta = this.varsta;

        return clona;
    }
}
