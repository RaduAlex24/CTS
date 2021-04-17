package ro.ase.cts.composite.composite;

import ro.ase.cts.composite.composite.ComponentaMeniu;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends ComponentaMeniu {
    private List<ComponentaMeniu> componentaMeniuList;

    public Sectiune(String nume) {
        super(nume);
        componentaMeniuList = new ArrayList<>();
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Sectiune: " + this.getNume());
        for (ComponentaMeniu componentaMeniu : this.componentaMeniuList) {
            componentaMeniu.afisareDescriere();
        }
    }

    @Override
    public ComponentaMeniu getComponenta(int poz) throws Exception {
        if (poz >= 0 && poz < componentaMeniuList.size()) {
            return componentaMeniuList.get(poz);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void adaugaComponenta(ComponentaMeniu componenta) {
        componentaMeniuList.add(componenta);
    }

    @Override
    public void stergeComponenta(ComponentaMeniu componenta) {
        componentaMeniuList.remove(componenta);
    }
}
