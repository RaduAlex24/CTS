package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.proxy.OperatorRezervare;
import ro.ase.cts.proxy.proxy.ProxyRezervare;

public class Main {
    public static void main(String[] args) {
        OperatorRezervare operatorRezervare = new OperatorRezervare("Local");
        operatorRezervare.rezerva(2);

        ProxyRezervare proxyRezervare = new ProxyRezervare(operatorRezervare,4);
        proxyRezervare.rezerva(2);
        proxyRezervare.rezerva(4);
    }
}
