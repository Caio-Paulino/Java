package academy.devdojo.javaoneforall.interfaces.domain;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from file");
    }

    @Override
    public void remove() {
        System.out.println("Loading remove data from file");
    }
}
