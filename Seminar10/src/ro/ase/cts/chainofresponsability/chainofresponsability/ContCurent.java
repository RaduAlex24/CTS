package ro.ase.cts.chainofresponsability.chainofresponsability;

public class ContCurent extends Cont {
    public ContCurent(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if (super.getSold() >= suma) {
            super.setSold(super.getSold() - suma);
            System.out.println("Se face plata din contul curent pt suma de " + suma);
        } else if (super.getContSuccesor() != null) {
            super.getContSuccesor().realizeazaPlata(suma);
        } else {
            System.out.println("Plata este refuzata");
        }
    }
}
