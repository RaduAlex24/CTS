package ro.ase.cts.program;

import ro.ase.cts.clasaMea.Racheta;
import ro.ase.cts.singletonEager.AsigurareMedicala;

public class MainClass {
    public static void main(String[] args) {
        // Eager singleton
        AsigurareMedicala asigurareMedicala1 = AsigurareMedicala.getInstance();
        AsigurareMedicala asigurareMedicala2 = AsigurareMedicala.getInstance();

        asigurareMedicala1.setNumeAsigurat("Luca");
        asigurareMedicala2.setContributie(69.42f);
        System.out.println(asigurareMedicala1.toString());
        System.out.println(asigurareMedicala2.toString());

        // Lazy singleton
        ro.ase.cts.singletonLazy.AsigurareMedicala asigurareMedicala3 = ro.ase.cts.singletonLazy.AsigurareMedicala.getInstance(100,"Bogdan",255.5f);
        ro.ase.cts.singletonLazy.AsigurareMedicala asigurareMedicala4 = ro.ase.cts.singletonLazy.AsigurareMedicala.getInstance(101,"Alex",100.5f);

        System.out.println(asigurareMedicala3.toString());
        System.out.println(asigurareMedicala4.toString());

        // Lazy singleton clasa mea
        Racheta racheta1 = Racheta.getInstance("NASA",3250.5f,7);
        Racheta racheta2 = Racheta.getInstance("SpaceX",2950.f,5);
        racheta2.setNrEchipaj(10);

        System.out.println(racheta1.toString());
        System.out.println(racheta2.toString());
    }
}
