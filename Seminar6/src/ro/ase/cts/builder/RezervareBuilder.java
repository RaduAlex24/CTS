package ro.ase.cts.builder;

public class RezervareBuilder implements AbstractBuilder {

    private Rezervare rezervare;

    public RezervareBuilder() {
        rezervare = new Rezervare(0, false, false, false, false, "");
    }

    public RezervareBuilder(int cod) {
        rezervare = new Rezervare(cod, false, false, false, false, "");
    }

    public RezervareBuilder setCod(int cod) {
        rezervare.setCod(cod);
        return this;
    }

    public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
        rezervare.setMancareInclusa(mancareInclusa);
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public RezervareBuilder setBauturiRacoritoare(boolean bauturiRacoritoare) {
        rezervare.setBauturaRacoritoareInclusa(bauturiRacoritoare);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        rezervare.setMuzicaAmbinetalaPersonalizata(muzicaAmbientala);
        return this;
    }

    public RezervareBuilder setGenMuzical(String genMuzical) {
        rezervare.setGenMuzica(genMuzical);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
