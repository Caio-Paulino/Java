package academy.devdojo.javaoneforall.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("File.txt");

        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw);) {
            br.write("Hello World");
            br.newLine();
            br.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
