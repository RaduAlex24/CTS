package ro.ase.cts.flyweight.flyweight;

import ro.ase.cts.flyweight.clase.Client;

import java.util.HashMap;
import java.util.Map;

public class FabricaClienti {
    private Map<String, Client> clientMap;

    public FabricaClienti() {
        clientMap = new HashMap<>();
    }

    public Client getClient(String email) {
        if (clientMap.containsKey(email)) {
            return clientMap.get(email);
        } else {
            Client client = new Client("Alex", 1234, email);
            clientMap.put(email, client);
            return client;
        }
    }
}
