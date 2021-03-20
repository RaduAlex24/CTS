package ro.ase.cts.program;

import ro.ase.cts.singletoneEager.AsigurareMedicala;

public class MainClass {
    public static void main(String[] args) {
        // Eager singletone
        AsigurareMedicala asigurareMedicala1 = AsigurareMedicala.getInstance();
        AsigurareMedicala asigurareMedicala2 = AsigurareMedicala.getInstance();

        asigurareMedicala1.setNumeAsigurat("Luca");
        asigurareMedicala2.setContributie(69.42f);
        System.out.println(asigurareMedicala1.toString());
        System.out.println(asigurareMedicala2.toString());

        // Lazy singletone
        ro.ase.cts.singletoneLazy.AsigurareMedicala asigurareMedicala3 = ro.ase.cts.singletoneLazy.AsigurareMedicala.getInstance(100,"Bogdan",255.5f);
        ro.ase.cts.singletoneLazy.AsigurareMedicala asigurareMedicala4 = ro.ase.cts.singletoneLazy.AsigurareMedicala.getInstance(101,"Alex",100.5f);

        System.out.println(asigurareMedicala3.toString());
        System.out.println(asigurareMedicala4.toString());
    }
}
