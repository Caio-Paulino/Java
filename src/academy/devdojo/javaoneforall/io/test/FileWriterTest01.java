package academy.devdojo.javaoneforall.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("File.txt");
        // The code inside try is possible because FileWriter is closeable
        try(FileWriter fw = new FileWriter(file);) {
            fw.write("Hello World");
            fw.flush();
            //this method is used to force any buffered output and automatically closes the FileWriter
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
