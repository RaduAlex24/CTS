package ro.ase.cts.memento.memento;

public class Memento {
    private int nrSpectatori;
    private String numeEchipaGazda;
    private String numeEchipaOaspete;

    public Memento(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspete) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspete = numeEchipaOaspete;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }


    public String getNumeEchipaOaspete() {
        return numeEchipaOaspete;
    }

}
