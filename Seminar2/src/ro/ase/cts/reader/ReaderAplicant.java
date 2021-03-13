package ro.ase.cts.reader;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class ReaderAplicant {
    protected String numeFisier;

    public ReaderAplicant(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException;
}
