package academy.devdojo.javaoneforall.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("folder");
        // create a directory
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println(isDirectoryCreated);
        File fileFolderDirectory = new File(fileDirectory, "file.txt");
        boolean isFileCreated = fileFolderDirectory.createNewFile();
        System.out.println(isFileCreated);

        //rename a file
        File fileRenamed = new File(fileDirectory, "file_renamed.txt");
        boolean isRenamed = fileFolderDirectory.renameTo(fileRenamed);
        System.out.println(isRenamed);
    }
}
