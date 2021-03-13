package ro.ase.cts.reader;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {
    protected String numeFisier;

    public ReaderAplicant(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException;

    public void readAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumiProiecte(vect, nr);
    }
}
