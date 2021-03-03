package clase;

public class Zookeeper {
    private String nume;

    public Zookeeper(String nume) {
        this.nume = nume;
    }

    public Zookeeper() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void feedAnimal(Animal animal){
        System.out.printf("Ingrijitorul " + this.nume + " hraneste animalul " + animal.getNume() + "\n");
    }
}
