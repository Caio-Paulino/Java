package academy.devdojo.javaoneforall.exception.exception.test;

import java.io.File;

public class ExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }

    private static String openConnection() {
        try {
            System.out.println("Opening connection...");
            System.out.println("Writing to the database...");
            return "connected";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Close");
        }
        return "not connected";
    }
}
