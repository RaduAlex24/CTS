package ro.ase.cts.simpleFactory.clase;

public class SimpleFactorySingleton {

    private static SimpleFactorySingleton simpleFactorySingleton = null;

    private SimpleFactorySingleton() {
    }

    public synchronized static SimpleFactorySingleton getInstance() {
        if(simpleFactorySingleton == null){
            simpleFactorySingleton = new SimpleFactorySingleton();
        }

        return simpleFactorySingleton;
    }

    public Jucator getJucator(TipJucator tipJucator, String nume, int varsta){
        switch (tipJucator){
            case PORTAR:
                return new Portar(nume,varsta);
            case FUNDAS:
                return new Fundas(nume,varsta);
            case ATACANT:
                return new Fundas(nume,varsta);
            default:
                throw new IllegalArgumentException();
        }
    }

}
