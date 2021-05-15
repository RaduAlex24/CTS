package ro.ase.cts.observer.observer;

public class ManagerSala extends ManagerSalaAbstract {
    private String denumireSala;

    public ManagerSala(String denumireSala) {
        this.denumireSala = denumireSala;
    }

    public void anuntaMeci(String tipMeci){
        super.notidica("Va avea loc un meci de " + tipMeci + " in sala " + denumireSala);
    }
}
