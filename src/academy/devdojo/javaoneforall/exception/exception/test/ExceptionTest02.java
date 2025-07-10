package academy.devdojo.javaoneforall.exception.exception.test;

import java.io.File;

public class ExceptionTest02 {
    public static void main(String[] args) {
    customFileCreator();
    }

    private static void customFileCreator() {
        File file = new File("folder\\test.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
