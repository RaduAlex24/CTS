package ro.ase.cts.memento.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeci {
    private List<Memento> listaMeciuriSalvate;

    public ManagerMeci() {
        listaMeciuriSalvate = new ArrayList<>();
    }

    public void adaugaMemento(Memento memento) {
        listaMeciuriSalvate.add(memento);
    }

    public Memento getMemento(int pozitie) {
        if (pozitie >= 0 && pozitie < listaMeciuriSalvate.size()) {
            return listaMeciuriSalvate.get(pozitie);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public Memento undo() {
        return listaMeciuriSalvate.get(listaMeciuriSalvate.size() - 1);
    }

}
