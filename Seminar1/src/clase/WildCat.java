package clase;

public class WildCat extends Animal{
    private String mancare;

    public WildCat(String nume) {
        super(nume);
    }

    public WildCat(String nume, String mancare) {
        super(nume);
        this.mancare = mancare;
    }

    public String getMancare() {
        return mancare;
    }

    public void setMancare(String mancare) {
        this.mancare = mancare;
    }
}
