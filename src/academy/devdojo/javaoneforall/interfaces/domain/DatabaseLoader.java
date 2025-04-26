package academy.devdojo.javaoneforall.interfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database");
        System.out.println("Removing data from database");
    }
}
