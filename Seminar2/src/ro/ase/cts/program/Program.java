package ro.ase.cts.program;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.reader.ReaderAngajati;
import ro.ase.cts.reader.ReaderAplicant;
import ro.ase.cts.reader.ReaderElevi;
import ro.ase.cts.reader.ReaderStudent;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static List<Aplicant> citireAplicanti(ReaderAplicant readerAplicant) throws FileNotFoundException {
        return readerAplicant.readAplicants();
    }

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        try {
            listaAplicanti = citireAplicanti(new ReaderStudent("studenti.txt"));
            for (Aplicant aplicant : listaAplicanti) {
                aplicant.statut();
                aplicant.finantare();
                System.out.println(aplicant.toString());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
