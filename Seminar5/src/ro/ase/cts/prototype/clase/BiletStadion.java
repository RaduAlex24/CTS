package ro.ase.cts.prototype.clase;

public class BiletStadion implements AbstractProrotype{
    private int cod;
    private String numeEchipa1;
    private String numeEchipa2;
    private String dataOra;


    private BiletStadion() {
    }

    public BiletStadion(int cod, String numeEchipa1, String numeEchipa2, String dataOra) {
        this.cod = cod;
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
        this.dataOra = dataOra;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiletStadion{");
        sb.append("cod=").append(cod);
        sb.append(", numeEchipa1='").append(numeEchipa1).append('\'');
        sb.append(", numeEchipa2='").append(numeEchipa2).append('\'');
        sb.append(", dataOra='").append(dataOra).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public AbstractProrotype copiaza() {
        BiletStadion clona = new BiletStadion();
        clona.cod = this.cod;
        clona.numeEchipa1 = this.numeEchipa1;
        clona.numeEchipa2 = this.numeEchipa2;
        clona.dataOra = this.dataOra;

        return clona;
    }
}
