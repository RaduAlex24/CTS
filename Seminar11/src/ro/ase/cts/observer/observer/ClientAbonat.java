package ro.ase.cts.observer.observer;

public class ClientAbonat implements Observer {
    private String numeClient;

    public ClientAbonat(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void primesteAnunt(String mesaj) {
        System.out.println(numeClient + " a primit anuntul " + mesaj);
    }

}
