package ro.ase.cts.memento.memento;

public class MeciJucat {
    private int nrSpectatori;
    private String numeEchipaGazda;
    private String numeEchipaOaspete;
    private int nrJandarmi;
    private int nrStuarzi;
    private int nrBileteVandute;

    public MeciJucat(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspete, int nrJandarmi,
                     int nrStuarzi, int nrBileteVandute) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspete = numeEchipaOaspete;
        this.nrJandarmi = nrJandarmi;
        this.nrStuarzi = nrStuarzi;
        this.nrBileteVandute = nrBileteVandute;
    }

    public Memento creazaMemento() {
        return new Memento(nrSpectatori, numeEchipaGazda, numeEchipaOaspete);
    }

    public void setMemento(Memento memento){
        nrSpectatori = memento.getNrSpectatori();
        numeEchipaGazda = memento.getNumeEchipaGazda();
        numeEchipaOaspete = memento.getNumeEchipaOaspete();
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNumeEchipaGazda(String numeEchipaGazda) {
        this.numeEchipaGazda = numeEchipaGazda;
    }

    public void setNumeEchipaOaspete(String numeEchipaOaspete) {
        this.numeEchipaOaspete = numeEchipaOaspete;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public void setNrStuarzi(int nrStuarzi) {
        this.nrStuarzi = nrStuarzi;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MeciJucat{");
        sb.append("nrSpectatori=").append(nrSpectatori);
        sb.append(", numeEchipaGazda='").append(numeEchipaGazda).append('\'');
        sb.append(", numeEchipaOaspete='").append(numeEchipaOaspete).append('\'');
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append(", nrStuarzi=").append(nrStuarzi);
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append('}');
        return sb.toString();
    }
}
