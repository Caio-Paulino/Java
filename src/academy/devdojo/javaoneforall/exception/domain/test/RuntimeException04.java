package academy.devdojo.javaoneforall.exception.domain.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeException04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch(RuntimeException e) {
            System.out.println("RuntimeException");
        }

        try {
            mayThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void mayThrowException() throws SQLException, FileNotFoundException {
    }
}
