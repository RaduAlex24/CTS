package ro.ase.cts.decorator.clase;

public class Bilet implements OperatorBile{
    private String numeChipaGazda;
    private String numeChipaOaspeti;

    public Bilet(String numeChipaGazda, String numeChipaOaspeti) {
        this.numeChipaGazda = numeChipaGazda;
        this.numeChipaOaspeti = numeChipaOaspeti;
    }


    @Override
    public void rezervaBilet() {
        System.out.println(numeChipaGazda + " joaca impotriva" + numeChipaOaspeti);
    }

    @Override
    public String getNumeEchipaGazda() {
        return numeChipaGazda;
    }

    @Override
    public String getNumeEchipaOaspeti() {
        return numeChipaOaspeti;
    }
}
