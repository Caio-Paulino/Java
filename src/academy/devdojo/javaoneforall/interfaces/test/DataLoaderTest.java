package academy.devdojo.javaoneforall.interfaces.test;

import academy.devdojo.javaoneforall.interfaces.domain.DataLoader;
import academy.devdojo.javaoneforall.interfaces.domain.DatabaseLoader;
import academy.devdojo.javaoneforall.interfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

    }
}
