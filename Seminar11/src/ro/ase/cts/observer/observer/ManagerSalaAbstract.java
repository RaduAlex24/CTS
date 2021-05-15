package ro.ase.cts.observer.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaAbstract {
    private List<Observer> listaClientiAbonati;

    public ManagerSalaAbstract() {
        listaClientiAbonati = new ArrayList<>();
    }

    public void aboneaza(Observer observer){
        listaClientiAbonati.add(observer);
    }

    public void dezaboneaza(Observer observer){
        listaClientiAbonati.remove(observer);
    }

    public void notidica(String mesaj){
        for(Observer observer: listaClientiAbonati){
            observer.primesteAnunt(mesaj);
        }
    }

}
